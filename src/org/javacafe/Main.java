package org.javacafe;

import java.lang.reflect.Proxy;
import org.javacafe.anntations.AnnotationHandler;
import org.javacafe.anntations.CustomInterface;
import org.javacafe.anntations.Example2;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Example2 example2 = new Example2();

        example2.test();
        example2.test2();

        CustomInterface proxyClass = (CustomInterface)Proxy.newProxyInstance(
            Main.class.getClassLoader(),
            new Class[] {CustomInterface.class},
            new AnnotationHandler(new Example2())
        );

        proxyClass.test();
        proxyClass.test2();
    }
}
