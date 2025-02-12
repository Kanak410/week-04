package org.example.listInterface.reverselist;
import java.util.*;
public class Reverse {

        // Reverse an ArrayList without using built-in methods
        public static void reverseArrayList(List<Integer> list) {
            int left = 0, right = list.size() - 1;
            while (left < right) {
                int temp = list.get(left);
                list.set(left, list.get(right));
                list.set(right, temp);
                left++;
                right--;
            }
        }
        public static void reverseLinked(LinkedList<Integer>linkedList){
            int data;
            int next;

        }



        public static void main(String[] args) {
            // Example with ArrayList
            List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
            System.out.println("Original ArrayList: " + arrayList);
            reverseArrayList(arrayList);
            System.out.println("Reversed ArrayList: " + arrayList);

            // Example with LinkedList
            LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
            System.out.println("Original LinkedList: " + linkedList);

            System.out.println("Reversed LinkedList: " + linkedList);
        }
    }


