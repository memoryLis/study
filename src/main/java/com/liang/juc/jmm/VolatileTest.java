package com.liang.juc.jmm;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;

/**
 * ClassName: Volatile
 * Package: com.liang.juc.jmm
 * Description:
 *
 * @Author liang
 * @Create 2025/4/14 11:31
 * @Version jdk11
 */
public class VolatileTest {
    //volatile 易变 加了volatile ，线程读取时就不能从工作内存中缓存读取
    volatile static  boolean run =true;
    static Path path1 = Paths.get(System.getProperty("user.dir"), "setting", "电芯SOC-OCV数据","SOC-OCV.csv");

    public static void main(String[] args) {
//        EnumTest value = EnumTest.values()[1];
        Path path = Paths.get(System.getProperty("user.dir"), "setting", "ParaInit.json"); // 自动适配系统分隔符
        System.out.println(path1);



    }

}
