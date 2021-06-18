package org.javacafe.generics;

import java.util.ArrayList;
import java.util.List;

public class IntegerBox {
    private List<Integer> valueList = new ArrayList<>();

    public void add(int value) {
        valueList.add(value);
    }

}
