package org.javacafe.generics;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    private final List<T> valueList = new ArrayList<>();

    public void add(T value) {
        valueList.add(value);
    }

    public T get(int index) {
        return valueList.get(index);
    }
}
