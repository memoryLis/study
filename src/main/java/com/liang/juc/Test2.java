package com.liang.juc;

/**
 * ClassName: Test2
 * Package: com.liang.juc
 * Description:
 *
 * @Author liang
 * @Create 2025/3/31 11:07
 * @Version jdk17.0
 */
public class Test2 {
    public static void main(String[] args) {
        try {
            float i = 1/0;
            System.out.println(1);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("异常 catch");
        }

        System.out.println("正常执行");
    }
    public static void test(){
        System.out.println("hello world");

    }
}
