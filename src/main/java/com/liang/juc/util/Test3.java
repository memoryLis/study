package com.liang.juc.util;

import lombok.extern.slf4j.Slf4j;

import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * ClassName: Test3
 * Package: com.liang.juc.util
 * Description:
 *
 * @Author liang
 * @Create 2025/4/21 15:07
 * @Version jdk11
 */
@Slf4j(topic = "c.Test3")
public class Test3 {
 public static void main(String[] args) {
  Timer timer = new Timer();

  TimerTask task1 = new TimerTask() {
   @Override
   public void run() {
    log.debug("task 1");
    /*System.out.println("task 1"+new Date(System.currentTimeMillis()));*/
       try {
           Thread.sleep(2000);
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }
   }
  };
  TimerTask task2 = new TimerTask() {
   @Override
   public void run() {
    log.debug("task 2");
    /*System.out.println("task 2"+new Date(System.currentTimeMillis()));*/
   }
  };
  // 使用 timer 添加两个任务，希望它们都在 1s 后执行
  // 但由于 timer 内只有一个线程来顺序执行队列中的任务，因此『任务1』的延时，影响了『任务2』的执行

  System.out.println(new Date(System.currentTimeMillis()));
  timer.schedule(task1, 1000);
  timer.schedule(task2, 1000);
 }
}
