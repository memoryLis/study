package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * ClassName: ${NAME}
 * Package: com
 * Description:
 *
 * @Author liang
 * @Create 2025/3/28 9:49
 * @Version jdk17.0
 */
@SpringBootApplication
@EnableAspectJAutoProxy
@MapperScan("com.mybatisplus.mapper")
public class Main{
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }
}