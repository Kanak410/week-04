package com.reflection.advancedlevel.dependencyinjectionusingreflection;

public class Client {
    @Inject
    private Service service; // Dependency

    public void doWork() {
        service.serve();  // Use the injected service
    }
}
