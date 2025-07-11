package com.liang.juc.safecollection;

import lombok.extern.slf4j.Slf4j;
import sun.misc.Unsafe;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ClassName: Test2
 * Package: com.liang.juc.safecollection
 * Description:
 *
 * @Author liang
 * @Create 2025/4/24 16:41
 * @Version jdk11
 */
@Slf4j
public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        ReentrantLock lock = new ReentrantLock();
        Condition a = lock.newCondition();
        Condition b = lock.newCondition();
        Condition c = lock.newCondition();
        new Thread(()->{
            while (true){
                lock.lock();
             try {
                 try {
                     a.await();
                 } catch (InterruptedException e) {
                     throw new RuntimeException(e);
                 }
                 System.out.print("A");
                 b.signal();
             }finally {
                 lock.unlock();
             }
            }
        }).start();
        new Thread(()->{
            while (true){
                lock.lock();
                try {
                    try {
                        b.await();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.print("B");
                    c.signal();
                }finally {
                    lock.unlock();
                }
            }
        }).start();
        new Thread(()->{
            while (true){
                lock.lock();
                try {
                    try {
                        c.await();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.print("C");
                    a.signal();
                }finally {
                    lock.unlock();
                }
            }
        }).start();
        Thread.sleep(5000);
        lock.lock();
        try {
            log.debug("开始打印");
            a.signal();
        }finally {
            lock.unlock();
        }

    }


}
