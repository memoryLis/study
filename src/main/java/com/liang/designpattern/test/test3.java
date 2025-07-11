package com.liang.designpattern.test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: test3
 * Package: com.liang.designpattern.test
 * Description:
 *
 * @Author liang
 * @Create 2025/5/6 17:22
 * @Version jdk11
 */
public class test3 {

    public static void main(String[] args) {
        String [] a = new String[5];
           for (int i =0;i<5;i++){
               a[i]=i+"i";
           }
           test3.get(a);

    }
     public static  <T>  void get(T value){
         System.out.println(value.toString());
     }
}
