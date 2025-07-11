package com.liang.designpattern.Structure.decorator;

public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("ConcreteDecoratorB is adding new behavior...");
        super.operation();
        System.out.println("ConcreteDecoratorB is adding new behavior...");
    }
}