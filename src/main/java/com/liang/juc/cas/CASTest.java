package com.liang.juc.cas;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * ClassName: CASTest
 * Package: com.liang.juc.cas
 * Description:
 *
 * @Author liang
 * @Create 2025/4/15 14:35
 * @Version jdk11
 */
public class CASTest {
    private AtomicInteger money ;
    public CASTest(Integer m){
        money=new AtomicInteger(m);
    }


    public  int get(){
        return money.get();
    }
    public void cost(int cost){
        int all = get();
        int next = all - cost;
        while (true){
            if(money.compareAndSet(all,next)){
                break;
            }
        }

    }

    public static void main(String[] args) throws InterruptedException {
        CASTest casTest = new CASTest(60000);
        ArrayList<Thread> threads = new ArrayList<>();

        for(int i = 0 ;i<500;i++){
            Thread thread = new Thread() {
                @Override
                public void run() {
                    casTest.cost(10);
                }
            };
            threads.add(thread);
        }
        for (Thread thread : threads) {
            thread.start();
        }
        for (Thread thread : threads) {
            thread.join();
        }
        System.out.println(casTest.get());
    }

}
