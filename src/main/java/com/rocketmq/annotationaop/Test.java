package com.rocketmq.annotationaop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ClassName: Test
 * Package: com.rocketmq.annotationaop
 * Description:
 *
 * @Author liang
 * @Create 2025/7/7 9:08
 * @Version jdk17.0
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("com.rocketmq.annotationaop");
        UserService userService = applicationContext.getBean(UserService.class);
        User userById = userService.getUserById(1L);

    }
}
