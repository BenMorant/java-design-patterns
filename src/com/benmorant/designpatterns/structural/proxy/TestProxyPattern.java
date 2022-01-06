package com.benmorant.designpatterns.structural.proxy;

/*
Proxy design pattern common uses are to control access or to provide a wrapper implementation for better performance.
 */
public class TestProxyPattern {
    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutorProxy("BenMor", "motdepasseincorrect");
        try {
            executor.runCommand("ls -ltr");
            executor.runCommand(" rm -rf abc.pdf");
        } catch (Exception e) {
            System.out.println("Exception Message::" + e.getMessage());
        }

    }

}

