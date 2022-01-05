package com.benmorant.designpatterns.creational.staticFactoryMethod;

/* The implementation of the getSingletonInstance() method is thread-safe, with a small performance penalty, due to
the synchronized block.

In this case, we used lazy initialization to demonstrate the implementation of an instance-controlled static factory
method.

It's worth mentioning, however, that the best way to implement a Singleton is with a Java enum type, as it's both
serialization-safe and thread-safe.

 */

public class UserSingleton {

    private static volatile UserSingleton instance = null;

    private final String name;
    private final String email;
    private final String country;

    private UserSingleton(String name, String email, String country) {
        this.name = name;
        this.email = email;
        this.country = country;
    }

    public static UserSingleton getSingletonInstance(String name, String email, String country) {
        if (instance == null) {
            synchronized (User.class) {
                if (instance == null) {
                    instance = new UserSingleton(name, email, country);
                }
            }
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCountry() {
        return country;
    }
}
