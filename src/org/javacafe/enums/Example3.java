package org.javacafe.enums;

public enum Example3 {
    A("1"),
    B("2"),
    C("3"),
    D("4")
    ;

    private String value;
    private Example3(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
