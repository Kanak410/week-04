package org.example.mapinterface.mergeTwoMaps;

import java.util.HashMap;
import java.util.Map;
public class Merge {
public static Map<String,Integer>mer(Map<String,Integer>m1,Map<String,Integer>m2){
    Map<String,Integer>res=new HashMap<>(m1);
    for(Map.Entry<String,Integer>entry: m2.entrySet()){
        res.put(entry.getKey(), res.getOrDefault(entry.getKey(),0)+ entry.getValue());
    }
    return res;
}


    public static void main(String[] args) {
        Map<String,Integer>map1= Map.of("A",1,"B",2);
        Map<String,Integer>map2=Map.of("B",3,"C",4);
        Map<String,Integer>mergemap=mer(map1,map2);
        System.out.println(mergemap);
    }
}
