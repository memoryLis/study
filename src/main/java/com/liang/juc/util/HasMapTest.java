package com.liang.juc.util;

/**
 * ClassName: HasMapTest
 * Package: com.liang.juc.util
 * Description:
 *
 * @Author liang
 * @Create 2025/4/22 9:48
 * @Version jdk11
 */
public class HasMapTest {
    public static void main(String[] args) {

        int c = 16; //当c为2的n次幂 时 tem % c==tem & (c-1)
        int tem = 516516;
        int i = tem % c;
        int a =tem & (c-1);
        System.out.println(i);
        System.out.println(a);
    }
}
