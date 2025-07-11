package com.liang.designpattern.creational.single;

import javafx.scene.input.DataFormat;
import org.junit.Test;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * ClassName: test
 * Package: com.liang.designpattern.single
 * Description:
 *
 * @Author liang
 * @Create 2025/5/7 16:23
 * @Version jdk11
 */
public class test {
    public static void main(String[] args) throws IOException {
        LazySingle instance = LazySingle.getInstance();
        Path test = Paths.get("D:", "test","test.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(test.toString());
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(instance);

    }

    @Test
    public void test1(){
        Calendar instance = Calendar.getInstance();
        System.out.println(instance);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        String format = simpleDateFormat.format(new Date());
        System.out.println(format);


    }

}
