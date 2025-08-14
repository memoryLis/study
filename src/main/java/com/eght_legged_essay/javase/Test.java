package com.eght_legged_essay.javase;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

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
    public void test(){
          ArrayList<Integer> list = new ArrayList<>(0);
          list.add(1);
          list.add(2);
        System.out.println(list.size());

    }

    @org.junit.jupiter.api.Test
    public void test1(){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        for (Integer integer : list){
            System.out.println(integer);
        }

    }

}
