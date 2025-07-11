package com.liang.juc.completablefuture;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.locks.LockSupport;

/**
 * ClassName: Test
 * Package: com.liang.juc.completablefuture
 * Description:
 *
 * @Author liang
 * @Create 2025/4/27 9:51
 * @Version jdk11
 */
@Slf4j(topic = "c.Test")
public class Test {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
                  log.debug("打断标记{}",Thread.currentThread().isInterrupted());
                 LockSupport.park();



        }, "t1");

        log.debug("开始打断");
        t1.interrupt();
        t1.start();



    }
}
