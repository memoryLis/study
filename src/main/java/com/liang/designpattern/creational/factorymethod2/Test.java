package com.liang.designpattern.creational.factorymethod2;

import com.liang.designpattern.creational.factorymethod2.productfactory.IResource;
import org.springframework.web.util.pattern.PathPattern;

/**
 * ClassName: Test
 * Package: com.liang.designpattern.creational.factorymethod2
 * Description:
 *
 * @Author liang
 * @Create 2025/5/8 17:32
 */
public class Test {
    public static void main(String[] args) {
        ResourceLoader resourceLoader = new ResourceLoader();
        String url = "classPath:asf asaf/ asfda";
        IResource load = resourceLoader.load(url);
    }
}
