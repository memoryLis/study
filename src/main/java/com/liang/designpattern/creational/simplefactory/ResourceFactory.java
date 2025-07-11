package com.liang.designpattern.creational.simplefactory;

/**
 * ClassName: ResourceFactory
 * Package: com.liang.designpattern.creational.simplefactory
 * Description:
 *
 * @Author liang
 * @Create 2025/5/8 15:32
 */
public class ResourceFactory {

    public static Resource createResource(String urlPrefix,String url) {
        Resource resource = null;
        if (urlPrefix.equals("http")) {
            //...一系列复杂操作
            resource = new Resource(url);
        } else if (urlPrefix.equals("classPath")) {

            //...一系列复杂操作
            resource = new Resource(url);
        }
        return resource;
    }
}
