package com.benmorant.designpatterns.creational.abstractFactory;

/* Abstract Factory design pattern provides approach to code for interface rather than implementation.
Abstract Factory pattern is “factory of factories” and can be easily extended to accommodate more products, for
example we can add another sub-class Laptop and a factory LaptopFactory.
Abstract Factory pattern is robust and avoid conditional logic of Factory pattern.*/
public interface ComputerAbstractFactory {

    Computer createComputer();

}
