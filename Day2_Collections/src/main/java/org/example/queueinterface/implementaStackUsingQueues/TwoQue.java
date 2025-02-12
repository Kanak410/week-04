package org.example.queueinterface.implementaStackUsingQueues;
import java.util.*;
public class TwoQue {
    private Queue<Integer>q1;
    private Queue<Integer>q2;
    public TwoQue(){
        q1=new LinkedList<>();
        q2=new LinkedList<>();

    }
    public void push(int x){
        q2.add(x);
        while(!q1.isEmpty()){
            q2.add(q1.poll());
        }
        Queue<Integer>temp=q1;
        q1=q2;
        q2=temp;
    }
    public int pop(){
        return q1.poll();
    }

    public boolean isEmpty(){
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        TwoQue stack=new TwoQue();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("pop:"+stack.pop());

    }


}
