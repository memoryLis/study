package com.liang.designpattern.creational.single;

/**
 * ClassName: InnerSingle
 * Package: com.liang.designpattern.single
 * Description:
 *
 * @Author liang
 * @Create 2025/5/7 15:37
 * @Version jdk11
 */
public class InnerSingle {
    private InnerSingle(){
    }

    private static  class  Instance{
        private final static InnerSingle innerSingle = new InnerSingle();
    }
    //类是懒加载的，当你使用到这个类时，才加载到内存
    public InnerSingle getInstance(){
        return  Instance.innerSingle;
    }
}
