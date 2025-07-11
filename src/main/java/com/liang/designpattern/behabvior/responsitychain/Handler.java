package com.liang.designpattern.behabvior.responsitychain;

/**
 * ClassName: Handler
 * Package: com.liang.designpattern.behabvior.responsitychain
 * Description:
 *
 * @Author liang
 * @Create 2025/5/15 16:23
 */
public abstract  class Handler {
    protected  Handler next;
    public void setNext(Handler handler){
        next = handler;
    }
     public  abstract void handler();
}
