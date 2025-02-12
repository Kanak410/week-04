package org.example.setInterface.unionandIntersection;

import java.util.Arrays;
import java.util.HashSet;

public class Set {
    public static HashSet<Integer> union(HashSet<Integer>h1,HashSet<Integer>h2){
       HashSet<Integer>ans=new HashSet<>();
       ans.addAll(h1);
       ans.addAll(h2);
        return ans;
    }
    public static HashSet<Integer> intersection(HashSet<Integer>h1,HashSet<Integer>h2){
        HashSet<Integer>ans=new HashSet<>();
       for(int i:h2){
           if(h1.contains(i)){
               ans.add(i);
           }
       }
        return ans;
    }

    public static void main(String[] args) {
        HashSet<Integer> h1=new HashSet<>(Arrays.asList(1,2,3));
        HashSet<Integer>h2=new HashSet<>(Arrays.asList(3,2,5,4));
        System.out.println(union(h1,h2));
        System.out.println(intersection(h1,h2));


    }
}
