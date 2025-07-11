package com.liang.designpattern.behabvior.responsitychain.ayyayimpl;

/**
 * ClassName: Good
 * Package: com.liang.designpattern.behabvior.responsitychain.ayyayimpl
 * Description:
 *
 * @Author liang
 * @Create 2025/5/15 17:43
 */
public class Default extends Scoring{
    @Override
    public boolean correct(int score) {
        System.out.println("99999");
        return false;
    }
}
