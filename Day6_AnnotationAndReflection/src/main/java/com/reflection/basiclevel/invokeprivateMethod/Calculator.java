package com.reflection.basiclevel.invokeprivateMethod;

import java.lang.reflect.Method;

class Calculate{
    private int multi(int a,int b){
        return a*b;
    }
}
public class Calculator{
    public static void main(String[] args) {
        try{
            Calculate calculator=new Calculate();
            Method m=Calculate.class.getDeclaredMethod("multi", int.class, int.class);
            m.setAccessible(true);
            int result =(int)m.invoke(calculator,5,3);
            System.out.println("Multiplication:"+result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
