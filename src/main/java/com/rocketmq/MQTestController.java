package com.rocketmq;

import org.apache.rocketmq.client.producer.SendCallback;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.apache.rocketmq.spring.support.RocketMQHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/mq")
public class MQTestController {
    @Resource
    private RocketMQTemplate rocketMQTemplate;

    private final String topic = "TopicTest";

    //对象消息
    Message<User> message = MessageBuilder.withPayload(
            new User("zhangsan", 12)).setHeader(RocketMQHeaders.KEYS, "key1").build();

    //基本类型：同步发送消息
    @RequestMapping("/sendMessage1")
    public String sendMessage1() {
        /**
         * 发送同步消息（阻塞当前线程，等待broker响应发送结果，这样不太容易丢失消息）
         * （msgBody也可以是对象，sendResult为返回的发送结果）
         *          */
        SendResult sendResult1 = rocketMQTemplate.syncSend(topic, "Hello, World!");
        System.out.println("同步发送字符串消息 = " + sendResult1);

        //同步发送发送对象消息
        SendResult sendResult2 = rocketMQTemplate.syncSend(topic, message);
        System.out.println("同步发送对象消息 = " + sendResult2);
        return "同步对象消息发送完成";
    }
    @GetMapping("/mscopy")
    public String sendMessage99() {
        //测试主从
       for(int i= 0 ;i<100;i++){
           SendResult sendResult1 = rocketMQTemplate.syncSend("liang", "Hello, World!");
           System.out.println("同步发送字符串消息 = " + sendResult1);
       }

        return "同步对象消息发送完成";
    }

    //基本类型：异步发送消息
    @RequestMapping("/sendMessage2")
    public String sendMessage2() {
        /**
         * 发送异步消息（通过线程池执行发送到broker的消息任务，执行完后回调：在SendCallback中可处理相关成功失败时的逻辑）
         * （适合对响应时间敏感的业务场景）
         */
        rocketMQTemplate.asyncSend(topic, message, new SendCallback() {
            @Override
            public void onSuccess(SendResult sendResult) {
                System.out.println("异步发送消息成功：" + sendResult);
            }

            @Override
            public void onException(Throwable throwable) {
                System.out.println("异步发送消息失败：" + throwable);
            }
        });
        return "异步消息发送完成";
    }

    //基本类型：单向发送
    @RequestMapping("/sendMessage3")
    public String sendMessage3() {
        //单向发送消息
        rocketMQTemplate.sendOneWay(topic, message);
        return "单向消息发送完成";
    }
    //延迟消息
    @RequestMapping("/sendMessage4")
    public String sendMessage6() {

        // syncSend(String destination, Message<?> message, long timeout, int delayLevel)

        // timeout 超时时间----跟延时时间没关系
        // int delayLevel 延时时间 1s 5s 10s 30s 1m 2m 3m 4m 5m 6m 7m 8m 9m 10m 20m 30m 1h 2h  级别 1 及 1s,最大延时 2h
        SendResult sendResult1 = rocketMQTemplate.syncSend(topic, message, 2000, 3);
        System.out.println("延迟消息 = " + sendResult1);

        return "延迟消息发送完成";
    }

    //批量消息发送，
    // 注意事项：批量发送的数据量不能超过 4 m,超过后需要将消息分割。
    @RequestMapping("/sendMessage5")
    public String sendMessage7() {
        List<Message<User>> messages = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setName("zhangsan" + (i + 1));
            user.setAge(i);
            Message<User> message = MessageBuilder.withPayload(
                    user).setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON_VALUE).build();
            messages.add(message);
        }
        SendResult sendResult1 = rocketMQTemplate.syncSend(topic, messages);
        System.out.println("批量消息 = " + sendResult1);

        return "批量消息发送完成";
    }

    //过滤消息发送，根据tag过滤
    //注意：topic 如果想添加tag,使用"topic:tag"的写法
    @RequestMapping("/sendMessage6")
    public String sendMessage10() {
        String topicTag = topic + ":TagA";
        SendResult sendResult1 = rocketMQTemplate.syncSend(topicTag, message);
        System.out.println("同步带TAG的消息 = " + sendResult1);

        return "过滤消息发送完成";
    }

   //发送事务消息
    @RequestMapping("/sendMessage7")
    public String sendMessage11() {
        String topicTag = topic + ":TagA";
        SendResult sendResult1 = rocketMQTemplate.sendMessageInTransaction(topicTag,MessageBuilder.
                withPayload(new User("adfs",1)).
                setHeader(RocketMQHeaders.TRANSACTION_ID,1).build(),"arg");
        System.out.println("同步带TAG的消息 = " + sendResult1);

        return "过滤消息发送完成";
    }
}