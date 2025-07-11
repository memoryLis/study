package com.liang.designpattern.creational.prototype;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 * ClassName: DeepCopy
 * Package: com.liang.designpattern.creational.prototype
 * Description:
 *
 * @Author liang
 * @Create 2025/5/10 20:08
 */
public class DeepCopy {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(byteArrayOutputStream);
        ShallowCopy shallowCopy = new ShallowCopy(1, "l;asf");
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        oos.writeObject(shallowCopy);

    }
}
