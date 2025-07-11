package com.liang.designpattern.behavior2.visitor;

// 具体元素：键盘
class Keyboard implements ComputerPart {
    // 接受访问者的访问
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        // 访问 Keyboard 对象
        computerPartVisitor.visit(this);
    }
}