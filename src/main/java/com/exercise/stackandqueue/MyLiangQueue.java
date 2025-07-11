package com.exercise.stackandqueue;

import java.util.Stack;

class MyLiangQueue {
    Stack<Integer> addStack;
    Stack<Integer> removeStack;

    public MyLiangQueue() {
        addStack = new Stack();
        removeStack = new Stack();
    }
    public void push(int x) {
        //加入入栈
        addStack.push(x);
    }
    
    public int pop() {
        //有元素需要出，借助出栈
        while (addStack.size() != 0) {
            removeStack.add(addStack.pop());
        }
         int result = removeStack.pop();
        //更新入栈
        while (removeStack.size() != 0) {
            addStack.push(removeStack.pop());
        }
        return result;
    }
    
    public int peek() {
        //有元素需要出，借助出栈
        while (addStack.size() != 0) {
            removeStack.add(addStack.pop());
        }
        int result = removeStack.peek();
        //更新入栈
        while (removeStack.size() != 0) {
            addStack.push(removeStack.pop());
        }
        return result;


    }
    
    public boolean empty() {
        return  addStack.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */