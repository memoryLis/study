package com.liang.designpattern.creational.factorymethod2;
import com.liang.designpattern.creational.factorymethod2.productfactory.IResource;

/**
 * ClassName: ResourceLoader
 * Package: com.liang.designpattern.creational.factorymethod
 * Description:
 *
 * @Author liang
 * @Create 2025/5/8 16:10
 */
public interface IResourceLoader {
    IResource load(String url);
}
