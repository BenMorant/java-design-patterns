package com.benmorant.designpatterns.creational.singleton;

/* Prior to Java 5, java memory model had a lot of issues and the above approaches used to fail in certain scenarios
where too many threads try to get the instance of the Singleton class simultaneously. (Bill Pugh).
* Notice the private inner static class that contains the instance of the singleton class. When the singleton class
is loaded, SingletonHelper class is not loaded into memory and only when someone calls the getInstance method, this
class gets loaded and creates the Singleton class instance.

This is the most widely used approach for Singleton class as it doesn’t require synchronization. */
public class PriorToJava5Singleton {

    private PriorToJava5Singleton() {}

    public static PriorToJava5Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    private static class SingletonHelper {
        private static final PriorToJava5Singleton INSTANCE = new PriorToJava5Singleton();
    }
}

