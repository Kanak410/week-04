package org.example.setInterface.checkifTwosetsAreequal;

import java.util.Arrays;
import java.util.HashSet;

public class Compare {
    public static  boolean twoset(HashSet<Integer>h1,HashSet<Integer>h2){
        boolean ans=false;
        if(h1.size()!= h2.size()){
            ans=false;
            return ans;
        }
        for(int i=0;i< h1.size();i++){
            if(h2.contains(i)){
                ans=true;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        HashSet<Integer>h1=new HashSet<>(Arrays.asList(1,2,3));
        HashSet<Integer>h2=new HashSet<>(Arrays.asList(3,2,1,4));
        System.out.println(twoset(h1,h2));


    }
}
