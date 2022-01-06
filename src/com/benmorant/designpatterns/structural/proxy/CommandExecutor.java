package com.benmorant.designpatterns.structural.proxy;

/*
Proxy pattern intent is to “Provide a surrogate or placeholder for another object to control access to it”. The
definition itself is very clear and proxy pattern is used when we want to provide controlled access of a functionality.
 */
public interface CommandExecutor {

    public void runCommand(String cmd) throws Exception;
}

