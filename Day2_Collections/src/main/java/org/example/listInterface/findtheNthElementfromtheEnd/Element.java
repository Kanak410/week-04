package org.example.listInterface.findtheNthElementfromtheEnd;
import java.util.Iterator;
import java.util.LinkedList;

public class Element<T> {

    // Method to find the Nth element from the end using Iterator
    public T findNthFromEnd(LinkedList<T> list, int N) {
        Iterator<T> fast = list.iterator();
        Iterator<T> slow = list.iterator();

        // Move fast pointer N steps ahead
        for (int i = 0; i < N; i++) {
            if (!fast.hasNext()) {
                return null;
            }
            fast.next();
        }

        // Move both fast and slow pointers one step at a time
        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }


        return slow.hasNext() ? slow.next() : null;
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        Element<String> obj = new Element<>();

        int N = 2;
        String result = obj.findNthFromEnd(list, N);
        System.out.println("The " + N + "th element from the end is: " + result);
    }
}

