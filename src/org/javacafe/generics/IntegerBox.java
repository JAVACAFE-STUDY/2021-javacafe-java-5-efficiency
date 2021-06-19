package org.javacafe.generics;

import java.util.ArrayList;
import java.util.List;

public class IntegerBox {
    private final List<Integer> valueList = new ArrayList<>();

    public void add(int value) {//int value ==> parameter
        valueList.add(value);
    }
    public int get(int index) {
        return valueList.get(index);
    }
}
