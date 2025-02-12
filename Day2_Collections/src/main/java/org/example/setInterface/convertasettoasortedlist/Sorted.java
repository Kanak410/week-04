package org.example.setInterface.convertasettoasortedlist;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Sorted {
    public static <T> TreeSet<T>sort(HashSet<T>h){
        TreeSet<T>t=new TreeSet<>();
        t.addAll(h);
        return t;

    }

    public static void main(String[] args) {

        HashSet<Integer>h2=new HashSet<>(Arrays.asList(5,3,9,1));

        System.out.println(sort(h2));


    }

}
