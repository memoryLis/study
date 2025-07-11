package com.liang.designpattern.creational.factorymethod.impl;

import com.liang.designpattern.creational.factorymethod.IResourceLoader;
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
    public Resource load(String url) {
        //加载http请求资源的一系列方法
        //.....
        return new Resource(url);
    }
}
