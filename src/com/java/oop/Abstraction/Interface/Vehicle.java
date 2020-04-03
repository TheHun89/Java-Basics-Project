package com.java.oop.Abstraction.Interface;

public interface Vehicle {

    int maxSpeed = 70;  // java does not allow abstract variables or constructors for interfaces

    default void defaultMethod() {
        privateMethod("Hello from the default method!");
    }
    private void privateMethod(final String string) {  // Java 9 introduces private methods for interfaces
        System.out.println(string);
    }
    void makeSound();
}
