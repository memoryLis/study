package com.liang.designpattern.creational.single;

/**
 * ClassName: EagerSingle
 * Package: com.liang.designpattern.single
 * Description:
 *
 * @Author liang
 * @Create 2025/5/7 14:55
 * @Version jdk11
 */
public class EagerSingle {
    private static final   EagerSingle  instance = new EagerSingle();
    private EagerSingle(){}
    public static EagerSingle getInstance(){
        return  instance;
    }
}
