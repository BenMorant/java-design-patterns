package com.benmorant.designpatterns.creational.staticFactoryMethod;

import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;

/*     “Consider static factory methods instead of constructors”

While this isn't a silver bullet, here are the most compelling reasons that sustain this approach:

    Constructors don't have meaningful names, so they are always restricted to the standard naming convention imposed
     by the language. Static factory methods can have meaningful names, hence explicitly conveying what they do
    Static factory methods can return the same type that implements the method(s), a subtype, and also primitives, so
     they offer a more flexible range of returning types
    Static factory methods can encapsulate all the logic required for pre-constructing fully initialized instances,
    so they can be used for moving this additional logic out of constructors. This prevents constructors from
    performing further tasks, others than just initializing fields
    Static factory methods can be controlled-instanced methods, with the Singleton pattern being the most glaring
    example of this feature
  Moving Logic out of Constructors (in order to maintain the SRP !)

*/

public class User {

    private static final Logger LOGGER = Logger.getLogger(User.class.getName());
    private final String name;
    private final String email;
    private final String country;

    public User(String name, String email, String country) {
        this.name = name;
        this.email = email;
        this.country = country;
    }

    public static User createWithLoggedInstantiationTime(String name, String email, String country) {
        LOGGER.log(Level.INFO, "Creating User instance at : {0}", LocalTime.now());
        return new User(name, email, country);
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

// => User user = User.createWithLoggedInstantiationTime("John", "john@domain.com", "Argentina");

