package com.liang.designpattern.behabvior.observer.subscribe;

import java.util.HashMap;

/**
 * ClassName: Main
 * Package: com.liang.designpattern.behabvior.subscribe
 * Description:
 *
 * @Author liang
 * @Create 2025/5/13 16:27
 */
public class Main {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        ConcreteASubscriber concreteASubscriber = new ConcreteASubscriber();
        ConcreteBSubscriber concreteBSubscriber = new ConcreteBSubscriber();
        eventBus.register("key",concreteASubscriber);
        eventBus.register("key",concreteBSubscriber);
        WeatherStation weatherStation = new WeatherStation(eventBus);
        weatherStation.changTemperature("key",new HashMap<String,String>());
    }

}
