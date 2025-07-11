package com.liang.designpattern.Structure.proxy.dynamic;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * ClassName: CacheProxy
 * Package: com.liang.designpattern.proxy.dynamic
 * Description:
 *
 * @Author liang
 * @Create 2025/5/11 12:07
 */
public class CacheProxy implements InvocationHandler {
     People people = new People();
    //对方法进行代理
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().equals("eat")){
            System.out.println("是eat方法");
            String result = (String)method.invoke(people, null);
            return result+"222";
        }
        return null;
    }
}
