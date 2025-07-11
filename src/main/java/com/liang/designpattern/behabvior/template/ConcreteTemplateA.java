package com.liang.designpattern.behabvior.template;

public class ConcreteTemplateA extends AbstractTemplate {
    @Override
    protected void step2() {
        System.out.println("Step 2 (A): Cook the dish using method A.");
    }
}

  class ConcreteTemplateB extends AbstractTemplate {
    @Override
    protected void step2() {
        System.out.println("Step 2 (B): Cook the dish using method B.");
    }
}