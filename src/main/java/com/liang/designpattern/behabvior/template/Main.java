package com.liang.designpattern.behabvior.template;

public class Main {
    public static void main(String[] args) {
        AbstractTemplate templateA = new ConcreteTemplateA();
        AbstractTemplate templateB = new ConcreteTemplateB();

        System.out.println("Using Template A:");
        templateA.templateMethod();

        System.out.println("Using Template B:");
        templateB.templateMethod();
    }
}