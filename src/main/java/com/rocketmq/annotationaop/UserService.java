package com.rocketmq.annotationaop;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    @TimeLog("获取用户详情")
    public User getUserById(Long id) {
        // 模拟业务逻辑
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return new User(id, "John Doe");
    }

    @TimeLog("保存用户信息")
    public void saveUser(User user) {
        // 模拟业务逻辑
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}    