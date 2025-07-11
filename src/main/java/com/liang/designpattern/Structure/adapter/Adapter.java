package com.liang.designpattern.Structure.adapter;

/**
 * ClassName: Adapter
 * Package: com.liang.designpattern.Structure.adapter
 * Description:
 * @Author liang
 * @Create 2025/5/12 22:28
 */

public class Adapter implements IEat{
    private BigEat bigEat;
    public Adapter(BigEat bigEat){
        this.bigEat = bigEat;
    };


    @Override
    public void eat() {
        bigEat.bigEat();
    }
}
