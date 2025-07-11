package com.exercise.stackandqueue;

import java.util.ArrayDeque;
import java.util.Queue;

// - LeetCode 225. 使用队列实现栈
class MyStack {
    Queue<Integer> queue;
    Queue<Integer> tempQueue;

    public MyStack() {
        queue = new ArrayDeque<>();
        tempQueue = new ArrayDeque<>();
    }

    public void push(int x) {
        queue.add(x);
    }

    public int pop() {
        int size =  queue.size();
        for (int i = 0; i < size - 1; i++) {
            tempQueue.add(queue.poll());
        }
        // 这个时候队列中只剩一个队尾元素
        Integer result = queue.poll();
        while (!tempQueue.isEmpty()) {
            queue.add(tempQueue.poll());
        }
        return result;
    }

    public int top() {
      int size =  queue.size();
        for (int i = 0; i < size -1; i++) {
            tempQueue.add(queue.poll());
        }
        // 这个时候队列中只剩一个队尾元素
        Integer result = queue.peek();
        tempQueue.add(queue.poll());
        while (!tempQueue.isEmpty()) {
            queue.add(tempQueue.poll());
        }
        return result;

    }

    public boolean empty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println(myStack.top()); // 返回 3
        // System.out.println(myStack.pop()); // 返回 2
        myStack.empty(); // 返回 Fals
    }
}