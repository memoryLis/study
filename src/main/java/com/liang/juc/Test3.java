package com.liang.juc;

/**
 * ClassName: Test3
 * Package: com.liang.juc
 * Description:
 *
 * @Author liang
 * @Create 2025/3/31 16:40
 * @Version jdk17.0
 */
public class Test3 {
     static int i =0;
    public static void main(String[] args) throws InterruptedException {
        Test2 test2 = new Test2();
        Thread t1 = new Thread("t1") {
            @Override
            public void run() {
                int a = 0;
                while (a < 5000) {
                    synchronized (Test3.class){
                        i++;
                    }
                    a++;
                }
            }
        };

        Thread t2 = new Thread("t2") {
            @Override
            public void run() {
                int a = 0;
                while (a < 5000) {
                    synchronized (Test3.class){

                        i--;
                    }
                    a++;
                }
            }
        };
        t2.start();
        t1.start();
        t1.join();
        t2.join();
        System.out.println(i);


    }

    }




