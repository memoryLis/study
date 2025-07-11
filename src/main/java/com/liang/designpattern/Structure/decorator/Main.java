package com.liang.designpattern.Structure.decorator;

public class Main {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component = new ConcreteDecoratorA(component);
        component=new ConcreteDecoratorB(component);
        component.operation();
    }
}