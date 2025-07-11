package com.liang.designpattern.creational.factorymethod2;




import com.liang.designpattern.creational.factorymethod2.productfactory.IResource;
import com.liang.designpattern.creational.simplefactory.ResourceException;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
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
   static Map<String, IResourceLoader> map = new HashMap<>();
   static  {
        InputStream resourceAsStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("resourcefactory2.properties");
        Properties properties = new Properties();
        try {
            properties.load(resourceAsStream);
            for (Map.Entry<Object, Object> objectObjectEntry : properties.entrySet()) {
                      String key = objectObjectEntry.getKey().toString();
                Class<?>  clazz = Class.forName(objectObjectEntry.getValue().toString());
               IResourceLoader resourceFactory = (IResourceLoader)clazz.getConstructor(null).newInstance();
               map.put(key,resourceFactory);
            }
            
        } catch (IOException | ClassNotFoundException | NoSuchMethodException | InstantiationException |
                 IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        //读取配置文件，从配置文件中加载资源工厂

    }
  IResourceLoader resourceLoader;

    public IResource load(String url){
      String urlPrefix = getPrefix(url);
        return   map.get(urlPrefix).load(url);
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
