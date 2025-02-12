package org.example.queueinterface.reverseaQueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueT{
    public static void queue(LinkedList<Integer>q){
      if(q.isEmpty()){
          return;
      }
      int front=q.poll();
      queue(q);
      q.add(front);


    }
    public static void main(String[] args) {
       LinkedList<Integer> q=new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.out.println("Original Queue: " + q);
        queue(q);
        System.out.println("Reversed Queue: " + q);

    }

}
