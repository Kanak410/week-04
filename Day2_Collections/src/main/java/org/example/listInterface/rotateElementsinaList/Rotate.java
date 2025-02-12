package org.example.listInterface.rotateElementsinaList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rotate {
    public static void reverse(List<Integer>l,int left,int right){

        while (left < right) {
            int temp = l.get(left);
            l.set(left, l.get(right));
            l.set(right, temp);
            left++;
            right--;
        }

    }
    public static void rotate(List<Integer>l,int idx){
        reverse(l,0,idx-1);
        reverse(l,idx,l.size()-1);
        reverse(l,0,l.size()-1);

    }

    public static void main(String[] args) {
        List<Integer>l=new ArrayList<>(Arrays.asList(10,20,30,40,50));
        int left = 0, right = l.size() - 1;
        int i=2;
        System.out.println("Original List: " + l);
        rotate(l, i);
        System.out.println("Rotated List: " + l);

    }
}
