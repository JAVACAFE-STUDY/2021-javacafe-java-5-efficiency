package org.javacafe.generics;

public class ChildBox extends Box<Integer> {
    // public void add(Object a) {
    //     super.add(a);
    // }
    //
    // public void add(Object v) {
    //     add((Integer) v);
    // }
    public void add(int a) {
        //구현체가 있어요.
        super.add(a);
    }
}
