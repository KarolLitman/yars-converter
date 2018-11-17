package YARS.converter.yars2ttl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class prefixDirective{
    String pname, CONTEXT;

    prefixDirective(String pname, String CONTEXT){
       this.pname=pname;
       this.CONTEXT=CONTEXT;
    }

    @Override
    public String toString() {
        return "@prefix "+pname+": "+CONTEXT +" .";

    }
}

class vertexDeclaration{
    String vertex_name, value;

    vertexDeclaration(String vertex_name, String value){
        this.vertex_name=vertex_name;
        this.value=value;
    }

    @Override
    public String toString() {
        return "@prefix "+vertex_name+": "+value +" .";
    }
}

class relationship{
    String vertex_first, predicate, vertex_second;

    relationship(String vertex_first, String predicate, String vertex_second){
        this.vertex_first=vertex_first;
        this.predicate=predicate;
        this.vertex_second=vertex_second;
    }

    @Override
    public String toString() {
        return vertex_first+" "+predicate+" "+vertex_second;
    }

}

class RDFLiteral{
    String value;
    String langtagOrDatatype;
}

public class YARS {

   public List<prefixDirective> pdlist = new ArrayList<prefixDirective>();

    Map<String, String> vertexValueMap = new HashMap<String, String>();
    Map<String, String> vertexLangMap = new HashMap<String, String>();
    Map<String, String> vertexDatatypeMap = new HashMap<String, String>();

//    public List<String,String> vdlist = new ArrayList<vertexDeclaration>();
   public List<relationship> rlist = new ArrayList<relationship>();

   public void addprefixDirective(String pname, String CONTEXT){
       pdlist.add(new prefixDirective(pname, CONTEXT));
   }

    public void addVertexValue(String vertex_name, String value){
        vertexValueMap.put(vertex_name, value);
    }
    public void addVertexLang(String vertex_name, String lang){
        vertexLangMap.put(vertex_name, lang);
    }
    public void addVertexDatatype(String vertex_name, String datatype){
        vertexDatatypeMap.put(vertex_name, datatype);
    }


    public void addrelationship(String vertex_first, String predicate, String vertex_second){
        rlist.add(new relationship(vertex_first, predicate, vertex_second));
    }

    @Override
    public String toString() {
        return pdlist+"\n"+vertexValueMap+"\n"+rlist;
    }

    public void buildTurtle(){

       for(prefixDirective p:pdlist){
           System.out.println(p);
       }

        for(relationship r:rlist){

            String vertexLang;
            String vertexDatatype="";
            if(vertexLangMap.get(r.vertex_second)==null){
                vertexLang="";
                if(vertexDatatypeMap.get(r.vertex_second)==null){
                    vertexDatatype="";
                }
                else{
                    vertexDatatype=vertexDatatypeMap.get(r.vertex_second);
                }
            }
            else{
                vertexLang=vertexLangMap.get(r.vertex_second);
            }


            System.out.println(vertexValueMap.get(r.vertex_first)+" "+r.predicate+" "+vertexValueMap.get(r.vertex_second)+vertexLang+vertexDatatype+" .");
        }

    }

}
