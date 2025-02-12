package org.example.setInterface.findsubsets;

import java.util.Arrays;
import java.util.HashSet;

public class Subset {
    public static boolean sub(HashSet<Integer>h1,HashSet<Integer>h2){
        boolean ans=false;
        for(int i:h2){
            if(h1.contains(i)){
                ans=true;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        HashSet<Integer> h1=new HashSet<>(Arrays.asList(2,3));
        HashSet<Integer>h2=new HashSet<>(Arrays.asList(1,2,3,4));

        System.out.println(sub(h1,h2));


    }
}
