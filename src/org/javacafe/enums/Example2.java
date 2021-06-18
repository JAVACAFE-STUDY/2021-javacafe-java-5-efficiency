package org.javacafe.enums;

public enum Example2 {
    AAAAAA("aa", "aa"),
    BBBBBB("bb", "bb"),
    CCCCCC("cc", "cc");

    private String name;
    private String value;

    private Example2(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }
}
