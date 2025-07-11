package com.liang.designpattern.behavior2.visitor;

// 客户端代码
public class VisitorPatternDemo {
    public static void main(String[] args) {
        // 创建一个 Computer 对象
        ComputerPart computer = new Computer();
        // 创建一个具体访问者
        ComputerPartVisitor visitor = new ComputerPartDisplayVisitor();
        // 让 Computer 对象接受访问者的访问
        computer.accept(visitor);
    }
}