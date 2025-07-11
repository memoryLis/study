package com.liang.designpattern.Structure.proxy.dynamic;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Proxy;

/**
 * ClassName: Main
 * Package: com.liang.designpattern.proxy.dynamic
 * Description:
 *
 * @Author liang
 * @Create 2025/5/11 12:00
 */
@Slf4j
public class Main {
    public static void main(String[] args) {
        //jdk实现动态代理  被代理类需要实现接口

        //1 获取类加载器
     ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        //2 获取接口数组
      Class[] interfaces = new Class[]{IPeople.class};
        //3 invocationHandler
     CacheProxy cacheProxy = new CacheProxy();

     //开始代理
     IPeople peopleProxy = (IPeople)Proxy.newProxyInstance(contextClassLoader, interfaces, cacheProxy);
     String result = peopleProxy.eat();//该方法被cacheProxy对象代理，进行增强，实际调用的是cacheProxy中invoke方法
     log.debug("第一次调用 {}",result);



    }
}
