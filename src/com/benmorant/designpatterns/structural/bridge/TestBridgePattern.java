package com.benmorant.designpatterns.structural.bridge;


/*
When we have interface hierarchies in both interfaces as well as implementations, then bridge design pattern is used
to decouple the interfaces from implementation and hiding the implementation details from the client programs.
 */
public class TestBridgePattern {
    public static void main(String[] args) {
        Shape tri = new Triangle(new RedColor());
        tri.applyColor();

        Shape pent = new Pentagon(new GreenColor());
        pent.applyColor();
    }

}

/*
Bridge design pattern can be used when both abstraction and implementation can have different hierarchies
independently and we want to hide the implementation from the client application.
 */
