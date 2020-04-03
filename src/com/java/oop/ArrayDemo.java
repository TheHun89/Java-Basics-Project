package com.java.oop;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayDemo {

    List<String> list = List.of("one", "two", "three");
    Set<String> set = Set.of("one", "two", "three");
    Map<String, String> map = Map.of("foo", "one", "bar", "two");

    void getList() {

        for (String num: list) {
            System.out.println(num);
        }
    }
}
