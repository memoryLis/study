package com.liang.juc.util;

import javafx.scene.input.DataFormat;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * ClassName: Test4
 * Package: com.liang.juc.util
 * Description:
 *
 * @Author liang
 * @Create 2025/4/21 15:45
 * @Version jdk11
 */
public class Test4 {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newScheduledThreadPool(2);
        //字符串转换为日期，日期转换为字符串
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String format = simpleDateFormat.format(date);
        System.out.println(format);
    }
}
