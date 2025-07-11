package com.liang.designpattern.behavior2.mediator;

// 客户端代码
public class MediatorPatternDemo {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        Colleague1 colleague1 = new Colleague1(mediator);
        Colleague2 colleague2 = new Colleague2(mediator);

        mediator.setColleague1(colleague1);
        mediator.setColleague2(colleague2);

        colleague1.send("Hello, Colleague2!");
        colleague2.send("Hi, Colleague1! How are you?");
        colleague1.send("I'm fine, thank you!");
        colleague2.send("Great, have a nice day!");
    }
}