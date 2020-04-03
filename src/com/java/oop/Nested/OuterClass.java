package com.java.oop.Nested;

/*
* Why use a Nested Class?
* ***********************
* It is a way of logically grouping classes that are only used in one place:
* If a class is useful to only one other class, then it is logical to embed it in that class and keep the two together.
* Nesting such "helper classes" makes their package more streamlined.

* It increases encapsulation:
* Consider two top-level classes, A and B, where B needs access to members of A that would otherwise be declared private.
* By hiding class B within class A, A's members can be declared private and B can access them.
* In addition, B itself can be hidden from the outside world.

* It can lead to more readable and maintainable code:
* Nesting small classes within top-level classes places the code closer to where it is used.
*
* An instance of InnerClass can exist only within an instance of OuterClass and has direct access to the methods and fields of its enclosing instance.
*
* There are two special kinds of inner classes: local classes and anonymous classes.
*  */

public class OuterClass {
    //...
    static class StaticNestedClass {
        //...
    }
    class InnerClass {
        //...
    }
}
