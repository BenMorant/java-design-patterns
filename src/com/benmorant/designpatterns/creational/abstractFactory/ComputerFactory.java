package com.benmorant.designpatterns.creational.abstractFactory;


public class ComputerFactory {

    /*a consumer class that will provide the entry point for the client classes to create sub-classes*/
    public static Computer getComputer(ComputerAbstractFactory factory) {
        return factory.createComputer();
    }
}
