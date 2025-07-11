package com.liang.juc.safecollection;

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * ClassName: LinkBlockingQueueTest
 * Package: com.liang.juc.safecollection
 * Description:
 *
 * @Author liang
 * @Create 2025/4/25 15:02
 * @Version jdk11
 */
public class LinkBlockingQueueTest {
    public static void main(String[] args) {
        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>();//使用这个

        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue<>(5);
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
    }
}
