package org.javacafe.generics;

public class ChildBox extends Box<Integer> {
    public ChildBox(int a) {
        super(a);
    }

    public void setValue(int a) {
        super.setValue(a);
    }
}
