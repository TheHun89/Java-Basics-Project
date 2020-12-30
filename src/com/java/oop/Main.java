package com.java.oop;

import com.java.oop.Abstraction.Abstract.Animal;
import com.java.oop.Abstraction.Abstract.Lion;
import com.java.oop.Abstraction.Interface.Vehicle;
import com.java.oop.Enum.Day;
import com.java.oop.Generics.GenericExample;
import com.java.oop.Inheritance.Bike;
import com.java.oop.Inheritance.Splendor;
import com.java.oop.Abstraction.Interface.Car;
import com.java.oop.Nested.AnonymousClassExample;
import com.java.oop.Nested.LocalClassExample;
import com.java.oop.Nested.ShadowTest;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Bike b = new Splendor();   //upcasting - Splendor extends Bike
        b.run();  // prints running safely with 60km
        System.out.println("b.speedlimit is " + b.speedlimit); // 90

        Bike a = new Bike();
        a.run();   // prints running
        System.out.println("b speed limit is " + b.speedlimit + " and a speed limit is " + a.speedlimit);   //90

        Splendor c = new Splendor();
        c.run();  // prints running safely with 60km
        System.out.println("c.speedlimit is " + c.speedlimit); // 150


        Animal animal = new Lion();
        animal.getSound();

        System.out.println("lion name is " + animal.getName());

        Integer number1  = 100;  // Autoboxing - value to object
        int number2 = number1;   // Unboxing - object to value

        byte val1 = 50;
        double val2 = val1;         // Implicit Conversion - widening
        System.out.println("val2 is " + val2);  // 50.0

        double val3 = 50.65;
        byte val4 = (byte) val3;    // Explicit Conversion - narrowing
        System.out.println("val4 is " + val4);  // 50

        System.out.println("One of the enum Day values is " + Day.MONDAY);  // Enum constant

        Vehicle car = new Car();
        car.defaultMethod();
        car.makeSound();

        ShadowTest st = new ShadowTest();
        ShadowTest.FirstLevel fl = st.new FirstLevel();
        fl.methodInFirstLevel(23);

        LocalClassExample localClassExample = new LocalClassExample();
        localClassExample.validatePhoneNumber("123-456-7890", "456-7890");

        AnonymousClassExample anonymousClassExample = new AnonymousClassExample();
        anonymousClassExample.sayHello();

        ArrayDemo arrayDemo = new ArrayDemo();
        arrayDemo.getList();

        String my_value = "1";
        int i = Integer.parseInt(my_value);
        System.out.println("int i is " + i);

        GenericExample genericExample = new GenericExample();
        genericExample.getList().add(8);
        genericExample.addToList(9);

    }
}
