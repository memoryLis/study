package com.liang.designpattern.behavior2.visitor;



// 具体访问者
class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    // 访问 Computer 对象
    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    // 访问 Mouse 对象
    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    // 访问 Keyboard 对象
    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }
}