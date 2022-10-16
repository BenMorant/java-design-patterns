package com.benmorant.designpatterns.behavorial.mediator;

// defines the contract for concrete mediators
public interface ChatMediator {

    public void sendMessage(String msg, User user);

    void addUser(User user);
}
