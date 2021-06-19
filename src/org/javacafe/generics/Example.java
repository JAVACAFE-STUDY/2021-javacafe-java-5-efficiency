package org.javacafe.generics;

import java.util.ArrayList;
import java.util.List;

public class Example {
    Box<?> box;
    public void setBox(Box<?> box) {
        this.box = box;
    }

    public void test3() {
        IntegerBox integerBox = new IntegerBox();

        integerBox.add(100);
        int value1 = integerBox.get(0);

        StringBox stringBox = new StringBox();

        stringBox.add("1000");
        String value = stringBox.get(0);

        ObjectBox objectBox = new ObjectBox();

        objectBox.add(1000);
        objectBox.add("@#232332");

        Object oValue1 = objectBox.get(0);
        Object oValue2 = objectBox.get(1);

        int a = (Integer) oValue1;
        String b = (String) oValue2;

        Box<Integer> box = new Box<>();

        box.add(1000);
        box.add(200);

        Box<String> box2 = new Box<>();

        box2.add("wdwdwdwdwd");

        String qdwdw = box2.get(0);

        Box<Long> box3 = new Box<>();


        Box box4 = new Box();

        box4.add("dwdwwdwd");
        box4.get(0);

        setBox(box);
        setBox(box3);
        setBox(box2);

        GenericMethod.test(100);
        GenericMethod genericMethod = new GenericMethod();

        genericMethod.add("wdwdwdw");

    }
}

