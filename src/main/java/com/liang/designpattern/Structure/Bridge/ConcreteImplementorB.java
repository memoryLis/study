package com.liang.designpattern.Structure.Bridge;

class ConcreteImplementorB implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("具体实现B");
    }
}
