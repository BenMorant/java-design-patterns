package com.benmorant.designpatterns.structural.decorator;

/*
We use inheritance or composition to extend the behavior of an object but this is done at compile time and its
applicable to all the instances of the class. We can’t add any new functionality of remove any existing behavior at
runtime – this is when Decorator pattern comes into picture.

Suppose we want to implement different kinds of cars – we can create interface Car to define the assemble method and
then we can have a Basic car, further more we can extend it to Sports car and Luxury Car. The implementation
hierarchy will look like below image.

But if we want to get a car at runtime that has both the features of sports car and luxury car, then the
implementation gets complex and if further more we want to specify which features should be added first, it gets even
 more complex. Now imagine if we have ten different kind of cars, the implementation logic using inheritance and
 composition will be impossible to manage. To solve this kind of programming situation, we apply decorator pattern in
  java.
 */
public class TestDecoratorPattern {
    public static void main(String[] args) {

        // Notice that client program can create different kinds of Object at runtime and they can specify the order
        // of execution too.
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n*****");

        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }

}

/*
Decorator design pattern is helpful in providing runtime modification abilities and hence more flexible. Its easy to
maintain and extend when the number of choices are more.
The disadvantage of decorator design pattern is that it uses a lot of similar kind of objects (decorators).
 */

