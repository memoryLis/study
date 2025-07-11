package com.liang.designpattern.Structure.Bridge;

abstract class Abstraction {
    protected Implementor implementor;

    // 抽象依赖实现的接口，而不依赖实现本身
    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    abstract void operation();
}
