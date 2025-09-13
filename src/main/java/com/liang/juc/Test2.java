package com.liang.juc;

import java.util.LinkedList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * ClassName: Test2
 * Package: com.liang.juc
 * Description:
 *
 * @Author liang
 * @Create 2025/3/31 11:07
 * @Version jdk17.0
 */
public class Test2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>();
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue<>(6);
        CopyOnWriteArrayList<String> list1 = new CopyOnWriteArrayList<>();
        list1.add("1");
        list1.get(1);
    }
    public static void test(){
        System.out.println("hello world");

    }
}
