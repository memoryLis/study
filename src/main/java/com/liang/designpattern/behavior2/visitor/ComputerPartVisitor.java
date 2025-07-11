package com.liang.designpattern.behavior2.visitor;



interface ComputerPartVisitor {
    // 访问 Computer 对象
    void visit(Computer computer);
    // 访问 Mouse 对象
    void visit(Mouse mouse);
    // 访问 Keyboard 对象
    void visit(Keyboard keyboard);
}