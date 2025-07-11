package com.liang.juc.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * ClassName: Test
 * Package: com.liang.juc.reentrantlock
 * Description:
 *
 * @Author liang
 * @Create 2025/4/10 11:21
 * @Version jdk11
 */
public class Test {

    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        Thread t1 = new Thread(() -> {

            try {
                lock.lockInterruptibly();
            } catch (InterruptedException e) {
                e.printStackTrace();

                   return;
            }
            try {
                System.out.println("获取到锁，进行解锁");
            } finally {
                lock.unlock();
            }
        }, "t1");
        lock.lock();

        t1.start();
        try {
            Thread.sleep(1);
            t1.interrupt();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }

    }
}
