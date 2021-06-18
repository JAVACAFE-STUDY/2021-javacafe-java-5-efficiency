package org.javacafe.generics;

import java.util.ArrayList;
import java.util.List;

public class ObjectBox {
    private List<Object> valueList = new ArrayList<>();

    public void add(Object value) {
        valueList.add(value);
    }
}
