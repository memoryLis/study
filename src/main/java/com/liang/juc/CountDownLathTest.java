package com.liang.juc;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ClassName: CountDownLathTest
 * Package: com.liang.juc
 * Description:
 *进入游戏
 * @Author liang
 * @Create 2025/4/23 17:03
 * @Version jdk11
 */
public class CountDownLathTest {
         static  int anInt;
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        ExecutorService service = Executors.newFixedThreadPool(5);
        String[] tem = new String[10];
        CountDownLatch countDownLatch = new CountDownLatch(10);


        for (int j = 0 ; j<10; j++){
            int k = j;
            service.submit(() -> {
                for (int i = 1; i <= 100; i++) {
                    try {
                        Thread.sleep(random.nextInt(100));
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    tem[k] = i+"%";
                    System.out.print("\r"+ Arrays.toString(tem));

                }
                countDownLatch.countDown();
            });


        }


        countDownLatch.await();
        System.out.println();
        System.out.println("游戏开始");
    }
}
