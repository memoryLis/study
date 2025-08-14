package com.liang.juc;

import lombok.extern.slf4j.Slf4j;

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



}
