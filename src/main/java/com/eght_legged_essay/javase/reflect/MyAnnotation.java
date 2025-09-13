package com.eght_legged_essay.javase.reflect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ClassName: MyAnnotion
 * Package: com.eght_legged_essay.javase.reflect
 * Description:
 *
 * @Author liang
 * @Create 2025/8/18 16:42
 * @Version jdk17.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
public @interface MyAnnotation {
    int value() default 0;
    String name() default "liang";
}
