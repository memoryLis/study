package com.liang.juc;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ClassName: Test1
 * Package: com.liang.juc
 * Description:
 *
 * @Author liang
 * @Create 2025/3/31 9:34
 * @Version jdk17.0
 */
@Slf4j(topic = "test1")
public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        log.debug("hello world ");
        Thread thread1 = new Thread(() -> {
            System.out.println("thread t1");
            log.debug("hello world ");

        }, "t1");
        thread1.start();
        Thread thread2 = new Thread("t2"){
            @Override
            public void run() {
                System.out.println("thread t2");
                log.debug("hello world ");
            }

        };
        thread2.join();

    }
    static int result = 0;
    @Test
    public void test1() throws InterruptedException {
        ConcurrentHashMap<String, Object> stringStringConcurrentHashMap = new ConcurrentHashMap<>();
        String s = (String) stringStringConcurrentHashMap.computeIfAbsent("1", k -> "1");
        System.out.println(s);
        String s1 = (String)stringStringConcurrentHashMap.computeIfAbsent("1", k -> "1");
        stringStringConcurrentHashMap.put("1", "afsdaf");
        System.out.println(stringStringConcurrentHashMap.get("1"));

    }



}
