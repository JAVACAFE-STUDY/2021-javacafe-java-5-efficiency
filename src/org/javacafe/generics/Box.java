package org.javacafe.generics;

import java.util.ArrayList;
import java.util.List;
import com.sun.tools.javac.util.Pair;

public class Box<T> {

    public Box() {

    }

    public Box(T a) {

    }

    private List<T> valueList = new ArrayList<>();

    public void add(T value) {
        valueList.add(value);
    }

    public static void printCollection() {

    }

    public void setValue(T value) {

    }

    public <S extends Number, U> boolean compare(U t,  S s) {
        return true;
    }


}
