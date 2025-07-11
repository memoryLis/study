package com.liang.designpattern.behabvior.responsitychain;

/**
 * ClassName: HandlerChain
 * Package: com.liang.designpattern.behabvior.responsitychain
 * Description:
 *
 * @Author liang
 * @Create 2025/5/15 16:27
 */
public class HandlerChain {
   private Handler head;
   private Handler tail;
    public void  addHandler(Handler handler){
        if(head == null && tail == null ){
            head = handler;
            tail = handler;
        }
        tail.setNext(handler);
        tail = handler;

    }
    public void doHandler(){
        if(head !=null){
            head.handler();
        }
    }
    public static void main(String[] args) {
        AHandler aHandler = new AHandler();
        BHandler bHandler = new BHandler();
        HandlerChain handlerChain = new HandlerChain();
        handlerChain.addHandler(aHandler);
        handlerChain.addHandler(bHandler);
        handlerChain.doHandler();

    }
}
