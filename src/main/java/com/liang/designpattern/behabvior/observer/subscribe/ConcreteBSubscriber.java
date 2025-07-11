package com.liang.designpattern.behabvior.observer.subscribe;

import java.util.Map;

class ConcreteBSubscriber implements Subscriber {


    @Override
    public void onEvent(String event, Map<String, String> data) {
        System.out.println(data);
        System.out.println(event);

    }
}