package com.liang.designpattern.behavior2.mediator;

// 同事接口
abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void send(String message);
    public abstract void notify(String message);
}