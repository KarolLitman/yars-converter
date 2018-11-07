package org.antlr.v4.runtime.tree;

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


public class YARS {

   public List<prefixDirective> pdlist = new ArrayList<prefixDirective>();

    Map<String, String> vdMap = new HashMap<String, String>();

//    public List<String,String> vdlist = new ArrayList<vertexDeclaration>();
   public List<relationship> rlist = new ArrayList<relationship>();

   public void addprefixDirective(String pname, String CONTEXT){
       pdlist.add(new prefixDirective(pname, CONTEXT));
   }

    public void addvertexDeclaration(String vertex_name, String value){
        vdMap.put(vertex_name, value);
    }

    public void addrelationship(String vertex_first, String predicate, String vertex_second){
        rlist.add(new relationship(vertex_first, predicate, vertex_second));
    }

    @Override
    public String toString() {
        return pdlist+"\n"+vdMap+"\n"+rlist;
    }

    public void buildTurtle(){

       for(prefixDirective p:pdlist){
           System.out.println(p);
       }

        for(relationship r:rlist){
            System.out.println(vdMap.get(r.vertex_first)+" "+r.predicate+" "+vdMap.get(r.vertex_second)+" .");
        }

    }

}
