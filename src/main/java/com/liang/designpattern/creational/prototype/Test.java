package com.liang.designpattern.creational.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Test
 * Package: com.liang.designpattern.creational.prototype
 * Description:
 *
 * @Author liang
 * @Create 2025/5/10 19:38
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        ShallowCopy shallowCopy = new ShallowCopy(2, "dfas;l");
        ShallowCopy clone = (ShallowCopy)shallowCopy.clone();
        List a =new ArrayList();
        a.toArray();
    }
}
