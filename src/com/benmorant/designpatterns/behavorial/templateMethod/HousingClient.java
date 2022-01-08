package com.benmorant.designpatterns.behavorial.templateMethod;

/*
Notice that client is invoking the template method of base class and depending of implementation of different steps,
it’s using some of the methods from base class and some of them from subclass.
 */
public class HousingClient {

    public static void main(String[] args) {

        HouseTemplate houseType = new WoodenHouse();

        //using template method
        houseType.buildHouse();
        System.out.println("************");

        houseType = new GlassHouse();

        houseType.buildHouse();
    }

}

/*
    Template method should consists of certain steps whose order is fixed and for some of the methods, implementation
     differs from base class to subclass. Template method should be final.
    Most of the times, subclasses calls methods from super class but in template pattern, superclass template method
    calls methods from subclasses, this is known as Hollywood Principle – “don’t call us, we’ll call you.”.
    Methods in base class with default implementation are referred as Hooks and they are intended to be overridden by
     subclasses, if you want some of the methods to be not overridden, you can make them final, for example in our
     case we can make buildFoundation() method final because if we don’t want subclasses to override it.
 */
