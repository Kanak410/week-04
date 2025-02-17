package com.reflection.advancedlevel.customloggingproxyUsingReflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LoggingProxy implements InvocationHandler {
    private final Object target;

    // Constructor to accept the target object (real object)
    public LoggingProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // Log the method name before invoking
        System.out.println("Method called: " + method.getName());

        // Invoke the actual method on the target object
        return method.invoke(target, args);
    }

    // Method to create a dynamic proxy
    public static Object createProxy(Object target) {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new LoggingProxy(target)
        );
    }

    public static void main(String[] args) {
        // Create a GreetingImpl object
        Greeting greeting = new GreetingImpl();

        // Create a proxy for the Greeting interface
        Greeting proxy = (Greeting) createProxy(greeting);

        // Call methods on the proxy, which will log the method name before execution
        proxy.sayHello();
        proxy.sayGoodbye();
    }
}
