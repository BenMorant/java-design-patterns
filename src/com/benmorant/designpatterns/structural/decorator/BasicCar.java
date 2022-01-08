package com.benmorant.designpatterns.structural.decorator;

/*
Component Implementation – The basic implementation of the component interface. We can have BasicCar class as our
component implementation.
 */
public class BasicCar implements Car {

    @Override
    public void assemble() {
        System.out.print("Basic Car.");
    }

}
