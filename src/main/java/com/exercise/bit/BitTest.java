package com.exercise.bit;

/**
 * ClassName: BitTest
 * Package: com.exercise.bit
 * Description:
 *
 * @Author liang
 * @Create 2025/7/20 15:15
 * @Version jdk17.0
 */
public class BitTest {
    public static void main(String[] args) {
       int n  =2132441414;
       int count = 0;
       for(int i= 0 ;i<32;i++){
           count += (n&1);
           n = n>>1;
       }
        System.out.println(count);
    }
}
