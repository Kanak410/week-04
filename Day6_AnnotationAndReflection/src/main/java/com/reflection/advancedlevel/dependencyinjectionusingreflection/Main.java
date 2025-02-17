package com.reflection.advancedlevel.dependencyinjectionusingreflection;

public class Main {
    public static void main(String[] args) {
        // Create the DI container
        DIContainer container = new DIContainer();

        // Register the services in the container
        container.register(ServiceImpl.class);
        container.register(Client.class);

        // Resolve and inject dependencies
        Client client = container.resolve(Client.class);

        // Call method on the client, which uses the injected service
        client.doWork();  // Output: Service is now serving!
    }
}
