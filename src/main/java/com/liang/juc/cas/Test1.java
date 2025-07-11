package com.liang.juc.cas;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * ClassName: Test1
 * Package: com.liang.juc.cas
 * Description:
 *
 * @Author liang
 * @Create 2025/4/17 15:22
 * @Version jdk11
 */
public class Test1 {
   private  static AtomicInteger temp = new AtomicInteger(2);
   public static void main(String[] args) {
    int andUpdate = temp.updateAndGet(a -> a * 20);
    System.out.println(andUpdate);
   }
}
