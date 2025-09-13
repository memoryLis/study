package com.eght_legged_essay.javase.reflect;

/**
 * ClassName: AnnotationDemo
 * Package: com.eght_legged_essay.javase.reflect
 * Description:
 *
 * @Author liang
 * @Create 2025/8/18 17:10
 * @Version jdk17.0
 */
public class AnnotationDemo {

    public static void main(String[] args) {
        Class<Person> personClass = Person.class;
        System.out.println(personClass.isAnnotationPresent(MyAnnotation.class));
        MyAnnotation annotation = personClass.getAnnotation(MyAnnotation.class);
        System.out.println(annotation.value());
        System.out.println(annotation.name());
    }
}
