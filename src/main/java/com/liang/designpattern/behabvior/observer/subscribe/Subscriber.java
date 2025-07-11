package com.liang.designpattern.behabvior.observer.subscribe;

import java.util.Map;

interface Subscriber {
    void onEvent(String event, Map<String,String> data);
}
