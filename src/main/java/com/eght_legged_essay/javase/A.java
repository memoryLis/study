package com.eght_legged_essay.javase;

/**
 * ClassName: A
 * Package: com.eght_legged_essay.javase
 * Description:
 *
 * @Author liang
 * @Create 2025/8/14 21:42
 * @Version jdk17.0
 */
public interface A {
    void method();
    default void defaultMethod() {
        System.out.println("这是默认方法");
    }


}
