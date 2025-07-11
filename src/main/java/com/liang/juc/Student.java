package com.liang.juc;

/**
 * ClassName: Student
 * Package: com.liang.juc
 * Description:
 *
 * @Author liang
 * @Create 2025/4/1 14:58
 * @Version jdk17.0
 */
public class Student {
    public  final void a(){
        System.out.println("a");
        test1();
        test2();
    }

    public void test2() {
        System.out.println("a");
    }

    public void test1() {
        System.out.println("a");
    }

     void test3() {
        System.out.println("a");
    }
}
