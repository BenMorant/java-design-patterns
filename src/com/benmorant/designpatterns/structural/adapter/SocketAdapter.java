package com.benmorant.designpatterns.structural.adapter;

/* Adapter is used so that two unrelated interfaces can work together. The object that joins these unrelated
interfaces is called an Adapter. As a real-life example, we can think of a mobile charger as an adapter because the
mobile battery needs 3 volts to charge but the normal socket produces either 120V (US) or 240V (India). So the mobile
 charger works as an adapter between the mobile charging socket and the wall socket. */
public interface SocketAdapter {

    public Volt get120Volt();

    public Volt get12Volt();

    public Volt get3Volt();
}

