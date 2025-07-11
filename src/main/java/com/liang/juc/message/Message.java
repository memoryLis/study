package com.liang.juc.message;

/**
 * ClassName: Message
 * Package: com.liang.juc.message
 * Description:
 *
 * @Author liang
 * @Create 2025/4/8 15:50
 * @Version jdk11
 */
public class Message {
    private  int id;
    private  Object message;

 public int getId() {
  return id;
 }

 public Object getMessage() {
  return message;
 }

 public Message(int id, Object message) {
  this.id = id;
  this.message = message;
 }
}
