package com.liang.juc.aqs;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.locks.LockSupport;

/**
 * ClassName: Test2
 * Package: com.liang.juc.aqs
 * Description:
 *
 * @Author liang
 * @Create 2025/4/22 23:16
 * @Version jdk11
 */
@Slf4j(topic = "c.test2")
public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
                try {
                    log.debug("beidaduan");
                    LockSupport.park();
                }catch (RuntimeException  e){
                    log.debug("666666");//InterruptedException park被打断不会抛异常
                }
                log.debug("suo");
                while (true){
                    
                }
        }, "t1");
        thread.start();
        boolean interrupted = thread.isInterrupted();
        System.out.println("thread   "+interrupted);
        Thread.sleep(2000);
        log.debug("开始打断");
        thread.interrupt();
        System.out.println("thread   "+thread.isInterrupted());
        log.debug("继续park该线程");
        LockSupport.park(thread);


    }
}
