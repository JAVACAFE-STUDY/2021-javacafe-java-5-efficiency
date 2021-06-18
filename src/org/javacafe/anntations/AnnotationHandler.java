package org.javacafe.anntations;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AnnotationHandler implements InvocationHandler {

    Object target;

    public AnnotationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.isAnnotationPresent(CustomAnnotation.class));
        if (method.isAnnotationPresent(CustomAnnotation.class)) {
            CustomAnnotation annotation = method.getAnnotation(CustomAnnotation.class);
            System.out.println("어노테이션이 존재합니다.");
            if (annotation.isCheck()) {
                System.out.println("어노테이션이 체크되었습니다.");
            }
        }
        method.invoke(target, args);
        return null;
    }
}
