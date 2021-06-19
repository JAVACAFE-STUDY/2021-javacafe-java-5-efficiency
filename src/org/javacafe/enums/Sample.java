package org.javacafe.enums;

public class Sample {
    public void test() {
        // String value = Example1.AAAAAA.name();
        // int value2 = Example1.AAAAAA.ordinal();
        //
        // System.out.println(value);
        // System.out.println(value2);


        System.out.println(Example2.AAAAAA.getName());
        System.out.println(Example2.AAAAAA.getValue());
    }

    public void test(String a) {
        if (a.equals("A")) {
            System.out.println("1");
        } else if (a.equals("B")) {
            System.out.println("2");
        } else if (a.equals("C")) {
            System.out.println("3");
        } else if (a.equals("D")) {
            System.out.println("4");
        } else if (a.equals("E")) {
            System.out.println("5");
        } else if (a.equals("F")) {
            System.out.println("6");
        } else if (a.equals("G")) {
            System.out.println("7");
        } else if (a.equals("H")) {
            System.out.println("8");
        } else if (a.equals("I")) {
            System.out.println("9");
        } else if (a.equals("J")) {
            System.out.println("10");
        } else {
            System.out.println("end");
        }
    }

    public void test2(String a) {
        Example3 example3 = Example3.valueOf(a);
        System.out.println(example3.getValue());
    }


}
