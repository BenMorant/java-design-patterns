package com.benmorant.designpatterns.structural.decorator;

/*
Concrete Decorators – Extending the base decorator functionality and modifying the component behavior accordingly.
 */
public class SportsCar extends CarDecorator {

    public SportsCar(Car c) {
        super(c);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" Adding features of Sports Car.");
    }
}
