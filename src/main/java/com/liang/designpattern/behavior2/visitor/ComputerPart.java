package com.liang.designpattern.behavior2.visitor;

// 元素接口
interface ComputerPart {
    // 接受访问者的访问
    void accept(ComputerPartVisitor computerPartVisitor);
}