package com.liang.juc.unsafe;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * ClassName: test
 * Package: com.liang.juc.unsafe
 * Description:
 *
 * @Author liang
 * @Create 2025/4/18 15:23
 * @Version jdk11
 */
public class test {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class<Unsafe> unsafeClass = Unsafe.class;
        Field theUnsafe = unsafeClass.getDeclaredField("theUnsafe");
        theUnsafe.setAccessible(true);
        Unsafe unsafe = (Unsafe)theUnsafe.get(null);
        System.out.println(unsafe);
        //获取偏移量，然后进行操作
    }



    class Teacher{
        public  int id;
        public  String name;
    }
}
