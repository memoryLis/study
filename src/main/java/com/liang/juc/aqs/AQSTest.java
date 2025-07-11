package com.liang.juc.aqs;

import lombok.extern.slf4j.Slf4j;

/**
 * ClassName: AQSTest
 * Package: com.liang.juc.aqs
 * Description:
 *
 * @Author liang
 * @Create 2025/4/22 10:35
 * @Version jdk11
 */
@Slf4j(topic = "c.AQSTest")
public class AQSTest {
    public static void main(String[] args) {
        MyLock lock = new MyLock();
        new Thread(()->{
            lock.lock();
            try {
                try {
                    log.debug("加锁");
                    Thread.sleep(2500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                log.debug("解锁");

            }finally {
                lock.unlock();
            }

        },"liang").start();
        new Thread(()->{
            boolean b = lock.tryLock();
            log.debug("尝试加锁{}",b);
            try {
//                try {
//                    Thread.sleep(2500);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                log.debug("加锁");


            }finally {
                log.debug("解锁");
                lock.unlock();
            }

        },"guang").start();

    }
}
