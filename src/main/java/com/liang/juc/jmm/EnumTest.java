package com.liang.juc.jmm;

/**
 * ClassName: EnumTest
 * Package: com.liang.juc.jmm
 * Description:
 *
 * @Author liang
 * @Create 2025/4/15 9:32
 * @Version jdk11
 */

public enum EnumTest {
    XIAOMING(1,"小明"),
    XIAOHONG(1,"小明");
    public int age;
    private String name;

   private EnumTest(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
