package com.liang.designpattern.creational.factorymethod2.productfactory;

import java.io.InputStream;

/**
 * ClassName: HttpResource
 * Package: com.liang.designpattern.creational.factorymethod2.productfactory
 * Description:
 *
 * @Author liang
 * @Create 2025/5/8 17:28
 */
public class HttpResource extends  IResource{
    @Override
    public InputStream getInputStream() {
        return null;
    }
}
