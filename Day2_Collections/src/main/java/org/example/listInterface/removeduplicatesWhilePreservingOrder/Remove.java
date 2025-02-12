package org.example.listInterface.removeduplicatesWhilePreservingOrder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;


public class Remove {
    public static List<Integer>removeDuplicates(List<Integer>in){
        LinkedHashSet<Integer>s=new LinkedHashSet<>(in);
        return new ArrayList<>(s);
    }
    public static void main(String[] args) {
        List<Integer>in=List.of(3,1,2,2,3,4);
        List <Integer>out=removeDuplicates(in);
        System.out.println(out);
    }
}
