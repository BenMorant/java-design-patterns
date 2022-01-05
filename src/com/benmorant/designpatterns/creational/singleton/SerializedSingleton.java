package com.benmorant.designpatterns.creational.singleton;

import java.io.Serializable;

/*Sometimes in distributed systems, we need to implement Serializable interface in Singleton class so that we can
store its state in the file system and retrieve it at a later point of time.*/

public class SerializedSingleton implements Serializable {

    private static final long serialVersionUID = - 7604766932017737115L;

    private SerializedSingleton() {}

    public static SerializedSingleton getInstance() {
        return SingletonHelper.instance;
    }

    private static class SingletonHelper {
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

}

