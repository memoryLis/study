package com.liang.designpattern.creational.factorymethod;

import com.liang.designpattern.creational.factorymethod.impl.ClassPathResourceLoader;
import com.liang.designpattern.creational.factorymethod.impl.HttpResourceLoader;
import com.liang.designpattern.creational.simplefactory.Resource;
import com.liang.designpattern.creational.simplefactory.ResourceException;
import com.liang.designpattern.creational.simplefactory.ResourceFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * ClassName: ResouceLoader
 * Package: com.liang.designpattern.creational.simplefactory
 * Description:
 *
 * @Author liang
 * @Create 2025/5/8 15:18
 */
public class ResourceLoader {
    Map<String,IResourceLoader> map = new HashMap<>();
    {
        InputStream resourceAsStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("resourcefactory.properties");
        Properties properties = new Properties();
        try {
            properties.load(resourceAsStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //读取配置文件，从配置文件中加载资源工厂

    }
  IResourceLoader resourceLoader;

    public Resource load(String url){
      String urlPrefix = getPrefix(url);
        Resource resource = null;
        if (urlPrefix.equals("http")) {
            //...一系列复杂操作
            resourceLoader = new HttpResourceLoader();
        } else if (urlPrefix.equals("classPath")) {

            //...一系列复杂操作
            resourceLoader = new ClassPathResourceLoader();
        }

        return  resourceLoader.load(url);
    }



    private String getPrefix(String url) {
        if(url == null || "".equals(url) || !url.contains(":")){
            throw  new ResourceException("url错误");
        }
        //进行分割字符，获取：前面部分
        String[] split = url.split(":");
        return split[0];
    }
}
