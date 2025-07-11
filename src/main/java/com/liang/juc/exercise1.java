package com.liang.juc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * ClassName: exercise1
 * Package: com.liang.juc
 * Description:
 *
 * @Author liang
 * @Create 2025/3/31 15:25
 * @Version jdk17.0
 */
public class exercise1 {
    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);


        //主线程
        Thread thread1Water = thread1Water();
        Thread thread2Tea = thread2Tea();

    }


    public static Thread thread1Water(){
        Thread thread1 = new Thread("threadWater"){
            @Override
            public  void run(){
                System.out.println("洗烧水壶");
                System.out.println("烧水————————");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                   e.printStackTrace();
                }
                System.out.println("烧水成功————————");
                //判断茶有没有准备好

            }

        };

        thread1.start();
        return  thread1;
    }

    public static Thread thread2Tea(){
        Thread thread1 = new Thread("threadTea"){
            @Override
            public  void run(){
                System.out.println("洗茶，洗杯子");
                System.out.println("洗茶壶————————");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("烧茶壶成功————————");
            }

        };

        thread1.start();
        return  thread1;
    }
}
