package org.javacafe.generics;

import java.util.ArrayList;
import java.util.List;

public class ImplementIntegerBox implements InterfaceBox<Integer> {
    private final List<Integer> data = new ArrayList<>();
    @Override
    public void add(Integer value) {
        data.add(value);
    }

    @Override
    public Integer get(int index) {
        return data.get(index);
    }
}
