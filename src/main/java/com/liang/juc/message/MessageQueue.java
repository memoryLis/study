package com.liang.juc.message;

import java.util.LinkedList;

/**
 * ClassName: MessageQueue
 * Package: com.liang.juc.message
 * Description:
 *
 * @Author liang
 * @Create 2025/4/8 15:51
 * @Version jdk11
 */
public class MessageQueue {
    private LinkedList<Message> queue;
    private int capacity;

    public MessageQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new LinkedList();
    }

    public Message take() {
        synchronized (queue) {
            while (queue.isEmpty()) {
                System.out.println("没货了");
                try {
                    queue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Message message = queue.removeFirst();
            queue.notifyAll();
            return message;
        }
    }
    public void put(Message message){
        synchronized (queue){
          //判断队列是否满
         if(queue.size()==capacity){
             try {
                 queue.wait();
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
         }
         //队列没有满
         queue.addLast(message);
         queue.notifyAll();
        }
    }


}
