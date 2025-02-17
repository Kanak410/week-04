package com.reflection.advancedlevel.customloggingproxyUsingReflection;
public class GreetingImpl implements Greeting {
    @Override
    public void sayHello() {
        System.out.println("Hello, welcome!");
    }

    @Override
    public void sayGoodbye() {
        System.out.println("Goodbye, see you again!");
    }
}
