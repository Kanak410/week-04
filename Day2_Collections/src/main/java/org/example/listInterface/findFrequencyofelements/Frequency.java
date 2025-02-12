package org.example.listInterface.findFrequencyofelements;

import java.util.HashMap;

public class Frequency {
    public static void fre(String arr[]){
        HashMap<String,Integer>h=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!h.containsKey(arr[i])){
                h.put(arr[i],1);
            }
            else{
                h.put(arr[i],h.get(arr[i])+1);
            }
        }
        System.out.println(h);

    }

    public static void main(String[] args) {
        String []arr={"apple","banana","apple","orange"};
        fre(arr);


    }
}
