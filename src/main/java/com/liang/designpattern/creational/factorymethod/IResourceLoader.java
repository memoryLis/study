package com.liang.designpattern.creational.factorymethod;

import com.liang.designpattern.creational.simplefactory.Resource;

/**
 * ClassName: ResourceLoader
 * Package: com.liang.designpattern.creational.factorymethod
 * Description:
 *
 * @Author liang
 * @Create 2025/5/8 16:10
 */
public interface IResourceLoader {
    Resource load(String url);
}
