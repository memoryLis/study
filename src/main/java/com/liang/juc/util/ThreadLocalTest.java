package com.liang.juc.util;

/**
 * ClassName: ThreadLocalTest
 * Package: com.liang.juc.util
 * Description:
 *
 * @Author liang
 * @Create 2025/5/5 12:28
 * @Version jdk11
 */
public class ThreadLocalTest {
    public static void main(String[] args) {
        ThreadLocal<String> tl1 = new ThreadLocal<>();
        tl1.set("liang");
        ThreadLocal<String> tl2 = new ThreadLocal<>();
        tl2.set("liang");
        String s = tl1.get();

    }
}
