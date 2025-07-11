package com.exercise.stackandqueue;

import java.util.ArrayList;
import java.util.List;

class MinStack {
    List<Integer> stack;
    int min;

    public MinStack() {
         stack =new ArrayList<>();
    }
    
    public void push(int val) {
        if(stack.size() == 0){
            min =val;
        }
        stack.add(val);
        if(val < min){
            min = val;
        }
    }
    
    public void pop() {
        int temp = stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        if(stack.size()==0){
            return;
        }
        if(temp == min){
            min=stack.get(stack.size()-1);
            //最小元素被移出，进行更新
            for (Integer i : stack) {
                if(i < min){
                    min = i;
                }

            }
        }
        
    }
    
    public int top() {
        return stack.get(stack.size()-1);
    }
    
    public int getMin() {
        return min;
        
    }

    public static void main(String[] args) {

    }
}
