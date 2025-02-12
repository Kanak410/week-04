package org.example.listInterface.findFrequencyofelements;

import java.util.HashMap;

public class Frequency {
    public static HashMap<String,Integer> fre(String arr[]){
        HashMap<String,Integer>h=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!h.containsKey(arr[i])){
                h.put(arr[i],1);
            }
            else{
                h.put(arr[i],h.get(arr[i])+1);
            }
        }
        return h;

    }

    public static void main(String[] args) {
        String []arr={"apple","banana","apple","orange"};
        System.out.println(fre(arr));


    }
}
