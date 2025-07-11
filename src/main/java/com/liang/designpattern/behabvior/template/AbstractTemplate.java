package com.liang.designpattern.behabvior.template;

public abstract class AbstractTemplate {
    // 模板方法，定义算法的骨架
    public final void templateMethod() {
        step1();
        step2();
        step3();
    }

    // 基本方法，定义算法中不会变化的步骤
    private void step1() {
        System.out.println("Step 1: Prepare the ingredients.");
    }

    // 抽象方法，定义算法中需要子类实现的步骤
    protected abstract void step2();

    // 基本方法，定义算法中不会变化的步骤
    private void step3() {
        System.out.println("Step 3: Serve the dish.");
    }
}