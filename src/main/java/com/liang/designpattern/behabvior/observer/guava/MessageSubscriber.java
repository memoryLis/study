package com.liang.designpattern.behabvior.observer.guava;

import com.google.common.eventbus.Subscribe;

public class MessageSubscriber {
    @Subscribe
    public void handleMessageEvent(MessageEvent event) {
        System.out.println("收到消息: " + event.getMessage());
    }
}