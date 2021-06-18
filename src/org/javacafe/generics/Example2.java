package org.javacafe.generics;

import java.util.ArrayList;
import java.util.List;

public class Example2 {
    public void test(int a) {           //a는 parameter

    }

    public void test2() {
        test(100);                  //100 argument
    }

    public void test3() {
        Box box = new Box();

        box.add(1212121221);
        box.add("wdwdwdwddw");

        ObjectBox objBox = new ObjectBox();
        objBox.add("dqwdwqdqwdqdwd");

        List<Integer> dddd = new ArrayList<>();
        List<Long> lllll = new ArrayList<>();
        List<String> ssss = new ArrayList<>();

        pringCollection(dddd);
        // pringCollection(lllll);
        // pringCollection(ssss);

    }

    public void pringCollection(List<? super Integer> dada) {
        dada.get(0);
    }

}

