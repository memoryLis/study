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
public class DoubleCheckLockSingle {
    private  volatile  static DoubleCheckLockSingle instance = null;
    private DoubleCheckLockSingle(){}
    public  static DoubleCheckLockSingle getInstance(){
        if(instance == null){
            synchronized (DoubleCheckLockSingle.class){
                if(instance == null ){
                    instance = new DoubleCheckLockSingle();
                }
                return  instance;

            }
        }
        return instance;

    }
}
