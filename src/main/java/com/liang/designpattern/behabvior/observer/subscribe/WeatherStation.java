package com.liang.designpattern.behabvior.observer.subscribe;

import java.util.Map;

/**
 * ClassName: WeatherStation
 * Package: com.liang.designpattern.behabvior.subscribe
 * Description:
 *
 * @Author liang
 * @Create 2025/5/13 16:21
 */
public class WeatherStation {
      private EventBus eventBus;
      private Float temperature;
    public   WeatherStation(EventBus eventBus){
     this.eventBus = eventBus;
    }


    public void changTemperature(String key , Map<String,String> data){
        data.put("1","hello subscriber");
         eventBus.convey(key,data);
    }

    public static void main(String[] args) {

    }
}
