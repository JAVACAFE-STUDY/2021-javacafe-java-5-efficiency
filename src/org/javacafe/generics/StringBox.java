package org.javacafe.generics;

import java.util.ArrayList;
import java.util.List;

public class StringBox {
    private List<String> valueList = new ArrayList<>();

    public void add(String value) {
        valueList.add(value);
    }
}
