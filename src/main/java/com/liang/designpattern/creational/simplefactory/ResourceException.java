package com.liang.designpattern.creational.simplefactory;

/**
 * ClassName: ResourceException
 * Package: com.liang.designpattern.creational.simplefactory
 * Description:
 *
 * @Author liang
 * @Create 2025/5/8 15:16
 */
public class ResourceException extends RuntimeException{
     public  ResourceException(){
       super("资源加载异常");
     }
     public ResourceException(String message){
         super(message);
     }
}
