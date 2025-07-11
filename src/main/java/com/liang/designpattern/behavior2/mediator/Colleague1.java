package com.liang.designpattern.behavior2.mediator;

// 具体同事1
class Colleague1 extends Colleague {
    public Colleague1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        mediator.send(message, this);
    }

    @Override
    public void notify(String message) {
        System.out.println("Colleague1 receives message: " + message);
    }
}
