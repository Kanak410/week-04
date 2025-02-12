package org.example.queueinterface.generateBinarynumbersusingaQueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Binary {
    public static List<String> bin(int n){
        List<String>ans=new ArrayList<>();
        Queue<String>q=new LinkedList<>();
        q.add("1");
        for(int i=0;i<n;i++){
            String binary=q.poll();
            ans.add(binary);
            q.add(binary+"0");
            q.add(binary+"1");

        }

        return ans;
    }
    public static void main(String[] args) {
        int n=4;

        System.out.println(bin(n));
    }
}
