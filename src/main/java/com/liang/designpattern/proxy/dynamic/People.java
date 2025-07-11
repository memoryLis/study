package com.liang.designpattern.proxy.dynamic;

import com.liang.designpattern.Structure.proxy.dynamic.IPeople;

/**
 * ClassName: People
 * Package: com.liang.designpattern.proxy.dynamic
 * Description:
 *
 * @Author liang
 * @Create 2025/5/11 11:59
 */
public class People implements IPeople {
    @Override
    public String eat() {
        System.out.println("111");
        return  "111";
    }
}