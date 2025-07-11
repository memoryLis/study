package com.liang.designpattern.behavior2.visitor;

// 具体元素
class Computer implements ComputerPart {
    // 子元素数组
    ComputerPart[] parts;

    public Computer() {
        // 初始化子元素数组
        parts = new ComputerPart[]{new Mouse(), new Keyboard()};
    }

    // 接受访问者的访问
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        // 遍历所有子元素并接受访问者的访问
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        // 访问 Computer 对象本身
        computerPartVisitor.visit(this);
    }
}