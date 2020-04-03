package com.java.oop.Encapsulation;

public class Example {

    static String var;  // static/class variable

    private int number; // instance variable

    public int getNumber() {

        return number;
    }

    public void setNumber( int number) {

        int div = 1;  // local variable

        this.number = number / div;
    }

    public final void printMessage() {

        final int var = 1;

        System.out.println("a final method can't be overriden and final variable can't be changed!" + var);
    }

}
