package com.liang.designpattern.behabvior.observer.subscribe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName: EventBus
 * Package: com.liang.designpattern.behabvior.subscribe
 * Description:
 *
 * @Author liang
 * @Create 2025/5/13 16:02
 */
public class EventBus {
        private Map<String, List<Subscriber>>  subscribers= new HashMap();

    /**
     * 往消息代理中加入订阅者
     * @param key 事件
     * @param subscriber
     */
     public void register(String key,Subscriber subscriber){
            subscribers.computeIfAbsent(key,k -> new ArrayList<Subscriber>());
            List<Subscriber> sbss = subscribers.get(key);
            sbss.add(subscriber);
        }

    /**
     * 删除相应事件订阅者
     * @param key 事件
     * @param subscriber
     */
    public  void remove(String key,Subscriber subscriber){
            List<Subscriber> sbss = subscribers.get(key);
            sbss.remove(subscriber);
        }

    /**
     * @param key 事件
     * @param data
     */
    public void convey(String key,Map<String,String> data){
            List<Subscriber> ssbs = subscribers.get(key);
            for (Subscriber ssb : ssbs) {
                ssb.onEvent(key,data);
            }

        }
}
