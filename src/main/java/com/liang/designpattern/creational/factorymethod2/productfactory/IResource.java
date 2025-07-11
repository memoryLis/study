package com.liang.designpattern.creational.factorymethod2.productfactory;

import java.io.InputStream;

/**
 * ClassName: IResource
 * Package: com.liang.designpattern.creational.factorymethod2.productfactory
 * Description:
 *
 * @Author liang
 * @Create 2025/5/8 17:08
 */
public abstract class IResource {
    public abstract InputStream getInputStream();
}
