package com.benmorant.designpatterns.creational.singleton;

/* The easier way to create a thread-safe singleton class is to make the global access method synchronized, so that
only one thread can execute this method at a time.
 * implementation works fine and provides thread-safety but it reduces the performance because of the cost associated
  with the synchronized method, although we need it only for the first few threads who might create the separate
  instances.*/
public class BetterThreadSafeSingleton {

    private static BetterThreadSafeSingleton instance;

    private BetterThreadSafeSingleton() {}

    public static synchronized BetterThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new BetterThreadSafeSingleton();
                }
            }
        }
        return instance;
    }


}

