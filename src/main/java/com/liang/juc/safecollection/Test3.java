package com.liang.juc.safecollection;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ClassName: Test3
 * Package: com.liang.juc.safecollection
 * Description:
 *
 * @Author liang
 * @Create 2025/4/25 14:24
 * @Version jdk11
 */
public class Test3 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        ReentrantLock lock = new ReentrantLock();
        Condition a = lock.newCondition();
        Condition b = lock.newCondition();
        Condition c = lock.newCondition();
        executorService.execute(() -> {
            for (int i = 0; i < 3; i++) {
                lock.lock();
                try {
                    try {
                        a.await();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.print("A");
                    b.signal();
                } finally {
                    lock.unlock();
                }
            }
        });
        executorService.execute(() -> {
            for (int i = 0; i < 3; i++) {
                lock.lock();
                try {
                    try {
                        b.await();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.print("B");
                    c.signal();
                } finally {
                    lock.unlock();
                }
            }
        });
        executorService.execute(() -> {
            for (int i = 0; i < 3; i++) {
                lock.lock();
                try {
                    try {
                        c.await();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.print("C");
                    a.signal();
                } finally {
                    lock.unlock();
                }
            }
        });
        Thread.sleep(500);
        lock.lock();
        try {
         System.out.println("开始");
         a.signal();
        }finally {
         lock.unlock();

        }
    }
}
