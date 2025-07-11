package com.liang.designpattern.creational.factorymethod2.impl;

import com.liang.designpattern.creational.factorymethod2.IResourceLoader;
import com.liang.designpattern.creational.factorymethod2.productfactory.ClassPathResource;
import com.liang.designpattern.creational.factorymethod2.productfactory.IResource;
import com.liang.designpattern.creational.simplefactory.Resource;

/**
 * ClassName: HttpResourceLoader
 * Package: com.liang.designpattern.creational.factorymethod.impl
 * Description:
 *
 * @Author liang
 * @Create 2025/5/8 16:11
 */
public class ClassPathResourceLoader implements IResourceLoader {
    @Override
    public IResource load(String url) {
        //加载http请求资源的一系列方法
        //.....
        return new ClassPathResource();
    }
}
