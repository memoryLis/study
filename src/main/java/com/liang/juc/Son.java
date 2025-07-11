package com.liang.juc;

import java.util.jar.JarEntry;

/**
 * ClassName: Son
 * Package: com.liang.juc
 * Description:
 *
 * @Author liang
 * @Create 2025/4/1 14:59
 * @Version jdk17.0
 */
public class Son extends  Student{
    public static void main(String[] args) {
        Son son = new Son();
        son.a();
    }
    @Override
    public void test1() {
        System.out.println("b");
        System.out.println("a");
        System.out.println("c");
    }

}
