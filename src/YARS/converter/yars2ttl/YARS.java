package YARS.converter.yars2ttl;

import java.util.*;

class prefixDirective {
    String pname, CONTEXT;

    prefixDirective(String pname, String CONTEXT) {
        this.pname = pname;
        this.CONTEXT = CONTEXT;
    }

    @Override
    public String toString() {
        return pname + " " + CONTEXT;

    }
}

class vertexDeclaration {
    String vertex_name;
    String value;
    String langtag;
    String datatype;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        vertexDeclaration that = (vertexDeclaration) o;
        return Objects.equals(vertex_name, that.vertex_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vertex_name);
    }

    vertexDeclaration(String vertex_name) {
        this.vertex_name = vertex_name;
    }

    vertexDeclaration() {
    }

    @Override
    public String toString() {
        return "" + vertex_name + ": " + " .";
    }
}

class relationship {
    vertexDeclaration vertex_start, vertex_end;
    String predicate;

    Map<String, String> any_key_value_Map;


    relationship(vertexDeclaration vertex_start, String predicate, vertexDeclaration vertex_end) {
        this.vertex_start = vertex_start;
        this.predicate = predicate;
        this.any_key_value_Map = new HashMap<>();
        this.vertex_end = vertex_end;
    }

    relationship() {
    }

    @Override
    public String toString() {
        return vertex_start.vertex_name + " " + predicate + " " + vertex_end.vertex_name;
    }

}

public class YARS {

    public List<prefixDirective> pdlist = new ArrayList<>();
    public HashMap<String, vertexDeclaration> vdMap = new HashMap();
    public List<relationship> rslist = new ArrayList<>();


    private String generateIdentifier(int i) {
        return i < 0 ? "" : generateIdentifier((i / 26) - 1) + (char) (97 + i % 26);
    }


    public void buildTurtle() {

        for (prefixDirective p : pdlist) {
            System.out.println("@prefix " + p.pname + ": <" + p.CONTEXT + "> .");
        }

        for (relationship r : rslist) {

            String langtag;
            String datatype = "";

            vertexDeclaration vertex_end = vdMap.get(r.vertex_end.vertex_name);

            if (vertex_end.langtag == null) {
                langtag = "";
                if (vertex_end.datatype == null) {
                    datatype = "";
                } else {
                    datatype = vertex_end.datatype;
                    if (datatype.startsWith("\"")) {
                        datatype = datatype.substring(1, datatype.length() - 1);
                    }
                    datatype = "^^" + datatype;
                }

            } else {
                langtag = vertex_end.langtag;
                langtag = "@" + (langtag.substring(1, langtag.length() - 1));

            }

            System.out.println(vdMap.get(r.vertex_start.vertex_name).value + " " + r.predicate + " " + vdMap.get(r.vertex_end.vertex_name).value + langtag + datatype + " .");

        }


    }

    void buildRDFreification() {

        int i = 0;
        boolean usedPrefixRDF = false;

        for (prefixDirective p : pdlist) {
            System.out.println("@prefix " + p.pname + ": <" + p.CONTEXT + "> .");

            if (p.pname == "rdf") {
                usedPrefixRDF = true;
            }

        }

        if (!usedPrefixRDF) {
            System.out.println("@prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> .");
        }
        System.out.println("@prefix : <urn:pg:1.0:> .");


        for (relationship r : rslist) {

            String blanknode = "_:" + generateIdentifier(i++);


            System.out.println(blanknode + " rdf:type rdf:Statement .");
            System.out.println(blanknode + " rdf:subject " + vdMap.get(r.vertex_start.vertex_name).value + " .");
            System.out.println(blanknode + " rdf:predicate " + r.predicate + " .");
            System.out.println(blanknode + " rdf:object " + vdMap.get(r.vertex_end.vertex_name).value + " .");
            r.any_key_value_Map.forEach((key, value) -> System.out.println(blanknode + " :" + key + " " + value + " ."));


        }

    }

    void buildSingletonProperty() {

        for (prefixDirective p : pdlist) {
            System.out.println("@prefix " + p.pname + ": <" + p.CONTEXT + "> .");
        }

        System.out.println("@prefix : <urn:pg:1.0:> .");


        int i = 0;
        String identifier = "";
        for (relationship r : rslist) {


            System.out.println(":" + r.vertex_start.vertex_name + " :value " + vdMap.get(r.vertex_start.vertex_name).value + " .");
            System.out.println(":" + r.vertex_start.vertex_name + " " + r.predicate + " :" + r.vertex_end.vertex_name + " .");
            for (Map.Entry<String, String> entry : r.any_key_value_Map.entrySet()) {
                identifier = generateIdentifier(i++);
                String key = entry.getKey();
                String value = entry.getValue();
                System.out.println(":" + r.vertex_start.vertex_name + " <" + identifier + "> " + value + " ." + "\n" +
                        "<" + identifier + "> rdf:singletonProperty :" + key + " ."
                );
            }
            System.out.println(":" + r.vertex_end.vertex_name + " :value " + vdMap.get(r.vertex_end.vertex_name).value + " .");
        }
    }

    void buildNaryRelation() {

        for (prefixDirective p : pdlist) {
            System.out.println("@prefix " + p.pname + ": <" + p.CONTEXT + "> .");
        }

        System.out.println("@prefix : <urn:pg:1.0:> .");


        int i = 0;
        for (relationship r : rslist) {
            String blanknode = "_:" + generateIdentifier(i++);

            System.out.println(":" + r.vertex_start.vertex_name + " :value " + vdMap.get(r.vertex_start.vertex_name).value + " .");
            System.out.println(":" + r.vertex_start.vertex_name + " " + r.predicate + " :" + r.vertex_end.vertex_name + " .");
            System.out.println(":" + r.vertex_end.vertex_name + " :value " + vdMap.get(r.vertex_end.vertex_name).value + " .");

            r.any_key_value_Map.forEach((key, value) -> System.out.println(":" + r.vertex_start.vertex_name + " :" + key + " " + blanknode + " ." + "\n" +
                    blanknode + " :" + key + "-value " + value + " ."
            ));
        }
    }

    void buildRDFstar() {

        for (prefixDirective p : pdlist) {
            System.out.println("@prefix " + p.pname + ": <" + p.CONTEXT + "> .");
        }

        System.out.println("@prefix : <urn:pg:1.0:> .");


        for (relationship r : rslist) {

            System.out.println(":" + r.vertex_start.vertex_name + " :value " + vdMap.get(r.vertex_start.vertex_name).value + " .");
            System.out.print("<<:" + r.vertex_start.vertex_name + " " + r.predicate + " :" + r.vertex_end.vertex_name + ">> ");

            String key_values = "";


            for (Map.Entry<String, String> entry : r.any_key_value_Map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                key_values += ":" + key + " " + value + " ; ";
            }
            key_values = key_values.substring(0, key_values.length() - 2);
            System.out.println(key_values + ".");

            System.out.println(":" + r.vertex_end.vertex_name + " :value " + vdMap.get(r.vertex_end.vertex_name).value + " .");
        }
    }

    void buildNamedGraphs() {

        for (prefixDirective p : pdlist) {
            System.out.println("@prefix " + p.pname + ": <" + p.CONTEXT + "> .");
        }

        System.out.println("@prefix : <urn:pg:1.0:> .");


        int i = 0;

        for (relationship r : rslist) {
            String blanknode = "_:" + generateIdentifier(i++);

            System.out.println(":" + r.vertex_start.vertex_name + " :value " + vdMap.get(r.vertex_start.vertex_name).value + " " + blanknode + " .");
            System.out.println(":" + r.vertex_start.vertex_name + " " + r.predicate + " :" + r.vertex_end.vertex_name + " " + blanknode + " .");
            System.out.println(":" + r.vertex_end.vertex_name + " :value " + vdMap.get(r.vertex_end.vertex_name).value + " " + blanknode + " .");
            r.any_key_value_Map.forEach((key, value) -> System.out.println(blanknode + " :" + key + " " + value + " ."));

        }

    }


}



