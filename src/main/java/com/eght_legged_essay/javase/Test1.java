package com.eght_legged_essay.javase;


public class Test1 {
    public static void main(String[] args) {
        System.out.println(test());
    }
    public static int test(){
        try {
            int ret = 1/0;
            System.out.println("try");
            return 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 1;
        } finally {
            System.out.println("finally");
        }
    }
}