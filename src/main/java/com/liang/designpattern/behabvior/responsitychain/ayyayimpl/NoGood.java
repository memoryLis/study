package com.liang.designpattern.behabvior.responsitychain.ayyayimpl;

/**
 * ClassName: Good
 * Package: com.liang.designpattern.behabvior.responsitychain.ayyayimpl
 * Description:
 *
 * @Author liang
 * @Create 2025/5/15 17:43
 */
public class NoGood extends Scoring{
    @Override
    public boolean correct(int score) {
        if(score < 60){
            System.out.println("一般");
            return true;//返回true，退出责任链
        }
        return false;
    }
}
