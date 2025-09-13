package com.eght_legged_essay.javase;

import java.lang.reflect.Array;
import java.util.*;

/**
 * ClassName: Test
 * Package: com.eght_legged_essay
 * Description:
 *
 * @Author liang
 * @Create 2025/8/14 15:09
 * @Version jdk17.0
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("hello world");


    }

    @org.junit.jupiter.api.Test
    public void test() {
        ArrayList<Integer> list = new ArrayList<>(0);
        list.add(1);
        list.add(2);
        System.out.println(list.size());

    }

    @org.junit.jupiter.api.Test
    public void test1() {
        String s1 = "hello";
        String s2 = "world";
        String s3 = "hello" + "world";
        String s4 = s1 + "world";
        String s5 = s1 + s2;
        String s6 = (s1 + s2).intern();

        System.out.println(s3 == s4);//flase
        System.out.println(s3 == s5);//flase
        System.out.println(s4 == s5);//flase
        System.out.println(s3 == s6);//true



    }

}
