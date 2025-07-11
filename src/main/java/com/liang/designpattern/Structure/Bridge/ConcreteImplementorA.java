package com.liang.designpattern.Structure.Bridge;

class ConcreteImplementorA implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("具体实现A");
    }
}