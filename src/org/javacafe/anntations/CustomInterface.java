package org.javacafe.anntations;

public interface CustomInterface {
    @CustomAnnotation
    void test();
    @CustomAnnotation(isCheck = false)
    void test2();
}
