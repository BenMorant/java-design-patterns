package com.benmorant.designpatterns.creational.singleton;

import java.io.*;

public class SingletonSerializedTest {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        SerializedSingleton instanceOne = SerializedSingleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
        out.writeObject(instanceOne);
        out.close();

        //deserailize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
        SerializedSingleton instanceTwo = (SerializedSingleton)in.readObject();
        in.close();

        System.out.println("instanceOne hashCode=" + instanceOne.hashCode());
        System.out.println("instanceTwo hashCode=" + instanceTwo.hashCode());

    }

}

 /*   The output of the above program is


    instanceOne hashCode=2011117821
    instanceTwo hashCode=109647522

    we need to do it provide the implementation of readResolve() method.

    protected Object readResolve() {
        return getInstance();
    }
*/


