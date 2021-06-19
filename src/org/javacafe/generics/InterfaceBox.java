package org.javacafe.generics;

public interface InterfaceBox<T> {
    void add(T value);
    T get(int index);
}
