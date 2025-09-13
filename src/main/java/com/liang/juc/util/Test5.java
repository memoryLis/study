package com.liang.juc.util;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * ClassName: Test5
 * Package: com.liang.juc.util
 * Description:
 *
 * @Author liang
 * @Create 2025/8/26 16:31
 * @Version jdk17.0
 */
@Slf4j(topic = "Test5")
public class Test5 {
    public static void main(String[] args) throws InterruptedException {
        test2();
    }
    private static void test2() throws InterruptedException {
        Thread t2 = new Thread(()->{
            while(true) {
                Thread current = Thread.currentThread();
                boolean interrupted = current.isInterrupted();
                if(interrupted) {
                    log.debug(" 打断状态: {}", interrupted);
                    break;
                }
            }
        }, "t2");
        t2.start();
        Thread.sleep((long) 5000);
        t2.interrupt();
    }
}
