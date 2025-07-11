package com.liang.designpattern.behabvior.responsitychain;

/**
 * ClassName: AHandler
 * Package: com.liang.designpattern.behabvior.responsitychain
 * Description:
 *
 * @Author liang
 * @Create 2025/5/15 16:24
 */
public class BHandler extends Handler {
    @Override
   public void handler() {
     System.out.println("B handler......");
     if(next != null){
      next.handler();
     }

    }

}
