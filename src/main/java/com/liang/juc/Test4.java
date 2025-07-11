package com.liang.juc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * ClassName: Test
 * Package: com.liang.juc
 * Description:
 *
 * @Author liang
 * @Create 2025/4/1 15:17
 * @Version jdk17.0
 */
public class Test4 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        Date parse = simpleDateFormat.parse("2024-12-22 5-12-20");
        System.out.println(parse);
    }

    private static void extracted() {
        int i =2 ;
        try {
            int i1 = i / 0;
        }catch (Exception e){
            System.out.println("出现异常");
            throw  new RuntimeException("自己抛出异常");
        }
        System.out.println(i);//这里不会执行
    }
}
