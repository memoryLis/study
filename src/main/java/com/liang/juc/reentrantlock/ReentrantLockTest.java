package com.liang.juc.reentrantlock;

import com.sun.media.sound.SoftTuning;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ClassName: ReentrantLockTest
 * Package: com.liang.juc.reentrantlock
 * Description:
 *
 * @Author liang
 * @Create 2025/4/10 17:01
 * @Version jdk11
 */
public class ReentrantLockTest {
   static boolean study = false;
   static   boolean sleep= false;
   static ReentrantLock reentrantLock = new ReentrantLock();
   static Condition sleepRoom = reentrantLock.newCondition();
   static Condition studyRoom = reentrantLock.newCondition();
    public static void main(String[] args) {


        Thread thread2 = new Thread(() -> {


            try {
                System.out.println("小颖进入房间，开始睡觉");
                while (!sleep) {//while 防止被打断
                    System.out.println("没人，不能睡觉");
                    try {
                        sleepRoom.await();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
                System.out.println("开始睡觉");


            } finally {
                reentrantLock.unlock();
            }
        }, "小颖");
                  thread2.start();

        Thread thread1 = new Thread(() -> {
            reentrantLock.lock();
            try {
                System.out.println("小红进入房间，准备学习");
                while (!study) {//while 防止被打断
                    System.out.println("没人，不能学习");
                    try {
                        studyRoom.await();
                    } catch (InterruptedException e) {
                        System.out.println("等笔中被打断");
                    }

                }
                System.out.println("开始学习");


            } finally {
                reentrantLock.unlock();
            }
        }, "小红");
                thread1.start();

        new Thread(()->{
            reentrantLock.lock();
            try {
                Thread.sleep(2000);
                System.out.println("送被子人开始送");
                sleep=true;
                System.out.println("送被子人成功");
                sleepRoom.signal();

            } catch (InterruptedException e) {
                System.out.println("等被子中被打断");
            } finally {
                reentrantLock.unlock();
            }

        },"送被子人").start();
        new Thread(()->{
            reentrantLock.lock();
            try {
                Thread.sleep(2000);
                System.out.println("送笔人人开始送");
                study=true;
                System.out.println("送笔人人成功");
                studyRoom.signal();

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                reentrantLock.unlock();
            }

        },"送笔人").start();

/*

     new Thread(()->{

         try {
             Thread.sleep(1000);
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }
         thread1.interrupt();
         thread2.interrupt();

         }).start();

*/







    }
}
