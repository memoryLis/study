package com.liang.juc.util;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * ClassName: Test
 * Package: com.liang.juc.util
 * Description:
 *
 * @Author liang
 * @Create 2025/4/20 22:00
 * @Version jdk11
 */
public class Test {
    public static void main(String[] args) {
        ExecutorService pools = Executors.newFixedThreadPool(2);
        ExecutorService pools1 = Executors.newFixedThreadPool(2, new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                return new Thread(r,"liang");
            }
        });

        pools1.execute(()->{
            System.out.println(Thread.currentThread().getName());
            System.out.println("liang");
        });
        pools1.execute(()->{
            System.out.println(Thread.currentThread().getName());
            System.out.println("liang");
        });
        pools1.execute(()->{
            System.out.println(Thread.currentThread().getName());
            System.out.println("liang");
        });
    }
}
