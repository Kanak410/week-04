package com.reflection.advancedlevel.dependencyinjectionusingreflection;

class ServiceImpl implements Service {
    @Override
    public void serve() {
        System.out.println("Service is now serving!");
    }
}
