package com.liang.designpattern.behavior2.mediator;

// 具体同事2
class Colleague2 extends Colleague {
    public Colleague2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        mediator.send(message, this);
    }

    @Override
    public void notify(String message) {
        System.out.println("Colleague2 receives message: " + message);
    }
}