package com.liang.designpattern.Structure.decorator.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * ClassName: Test
 * Package: com.liang.designpattern.decorator.io
 * Description:
 *
 * @Author liang
 * @Create 2025/5/11 19:40
 */
public class Test {
    public static void main(String[] args) throws IOException {
        InputStream  ip = new FileInputStream("src/main/java/com/liang/designpattern/decorator/io/a.txt");
        byte[] bytes = new byte[1024];
        int length;
        while ((length = ip.read(bytes))>-1){
            System.out.println(new String(bytes,0,length));
        }
        ip.close();
     }
}
