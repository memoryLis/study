package com.liang.juc.aqs;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * ClassName: MyLock
 * Package: com.liang.juc.aqs
 * Description:
 *
 * @Author liang
 * @Create 2025/4/22 10:51
 * @Version jdk11
 */
public class MyLock implements Lock {
   private  MySync mySync = new MySync();


    //独占锁，同步器类
    class MySync extends AbstractQueuedSynchronizer{
     @Override
     protected boolean tryAcquire(int arg) {
              if(compareAndSetState(0,1)){
               //加锁成功
               setExclusiveOwnerThread(Thread.currentThread());
               return  true;
              }
              return false;
     }


     @Override
     protected boolean tryRelease(int arg) {
      setExclusiveOwnerThread(null);
      setState(0);//state 是volatile 保证前面修改，对stat所见
      return  true;

     }

     @Override
     protected boolean isHeldExclusively() {
       return  getState() == 1;
     }
       public Condition newCondition(){
          return  newCondition();
       }
    }
    @Override
    public void lock() {
     mySync.acquire(1);

    }

    @Override
    public void lockInterruptibly() throws InterruptedException {
              mySync.acquireInterruptibly(1);
    }

    @Override
    public boolean tryLock() {
        return mySync.tryAcquire(1);
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return mySync.tryAcquireNanos(1,unit.toNanos(time));
    }

    @Override
    public void unlock() {
     mySync.release(1);

    }

    @Override
    public Condition newCondition() {
        return mySync.newCondition();
    }
}
