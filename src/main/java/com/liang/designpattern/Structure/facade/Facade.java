package com.liang.designpattern.Structure.facade;

/**
 * ClassName: Facade
 * Package: com.liang.designpattern.Structure.facade
 * Description:
 *
 * @Author liang
 * @Create 2025/5/12 17:21
 */
public class Facade {
    //后面使用这个门面
    private ExternalServiceImpl1 externalServiceImpl1 =new ExternalServiceImpl1();
    private  ExternalServiceImpl2 externalServiceImpl2 = new ExternalServiceImpl2();
    public void doSomething1(){
        externalServiceImpl1.doSomething();
    }
    public void doSomething2(){
        externalServiceImpl2.doSomething();
    }
}
