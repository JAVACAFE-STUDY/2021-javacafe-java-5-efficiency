package org.javacafe.enums;

public enum Example2 {
    AAAAAA("자바카페", "만세"),
    BBBBBB("서동우", "화이팅"),
    CCCCCC("우하하", "패밀리");

    private final String name;
    private final String value;

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
