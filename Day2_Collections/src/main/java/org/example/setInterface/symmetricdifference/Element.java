package org.example.setInterface.symmetricdifference;

import java.util.Arrays;
import java.util.HashSet;

public class Element {
    public static HashSet<Integer> diff(HashSet<Integer>h1, HashSet<Integer>h2){
        HashSet<Integer>ans=new HashSet<>();
        for(int i:h2){
            if(!h1.contains(i)){
                ans.add(i);
            }
        }
        for(int i:h1){
            if(!h2.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        HashSet<Integer> h1=new HashSet<>(Arrays.asList(1,2,3));
        HashSet<Integer>h2=new HashSet<>(Arrays.asList(3,2,5,4));

        System.out.println(diff(h1,h2));


    }
}
