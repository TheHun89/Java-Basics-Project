package com.java.oop.Generics;
import java.util.ArrayList;
import java.util.List;

public class GenericExample<T, G, C> {

    public T Var1;
    public G[] Var2;
    private List<C> list = new ArrayList<C>();

    public List<C> getList() {
        return list;
    }

    public void setList(List<C> list) {
        this.list = list;
    }

    public void addToList(C x) {
        list.add(x);
    }

    //    list.add(1000);     //works fine
//    list.add("lokesh"); //compile time error;
}
