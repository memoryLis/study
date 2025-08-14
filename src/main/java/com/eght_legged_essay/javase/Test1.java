package com.eght_legged_essay.javase;


public class Test1 {
    private   int a1 = 10;
    public static void main(String[] args) {
        Test1 t = new Test1();
        t.test(16);
    }

    // 局部final变量a,b
    public void test(final int b) {// jdk8在这⾥做了优化, 不⽤写,语法糖，但实际上也是有的，也不能修改
        final int a = 10;
        // 匿名内部类
        int c = 20;
        // c = 30; 解开注释报错
        new Thread() {
            @Override
            public void run() {
                System.out.println(a);
                System.out.println(a1);
                System.out.println(b);
                System.out.println(c);
            }
        }.start();
    }
}