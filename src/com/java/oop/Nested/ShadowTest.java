package com.java.oop.Nested;

public class ShadowTest {

    public int x = 0;

    public class FirstLevel {

        public int x = 1;   // "shadowing" the declaration with the same member name in the enclosing scope

        public void methodInFirstLevel(int x) {
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("ShadowTest.this.x = " + ShadowTest.this.x);
        }
    }
}
