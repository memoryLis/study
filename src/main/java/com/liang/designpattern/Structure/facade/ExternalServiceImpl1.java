package com.liang.designpattern.Structure.facade;

// 外部服务实现类1
class ExternalServiceImpl1 implements ExternalService {
    @Override
    public void doSomething() {
        System.out.println("ExternalServiceImpl1.doSomething");
    }
}