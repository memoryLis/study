package com.liang.designpattern.creational.single;

import java.io.Serializable;

/**
 * ClassName: EagerSingle
 * Package: com.liang.designpattern.single
 * Description:
 *
 * @Author liang
 * @Create 2025/5/7 14:55
 * @Version jdk11
 */
public class LazySingle implements Serializable {
    private static  LazySingle instance = null;
    private LazySingle(){}
    public  static LazySingle getInstance(){
        if(instance == null ){
            instance = new LazySingle();
        }
        return  instance;
    }
}
