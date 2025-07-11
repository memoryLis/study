package com.rocketmq.annotationaop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class TimeLogAspect {
    private static final Logger logger = LoggerFactory.getLogger(TimeLogAspect.class);

    @Around("@annotation(com.rocketmq.annotationaop.TimeLog)")
    public Object logTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        
        try {
            // 执行目标方法
            Object result = joinPoint.proceed();
            return result;
        } finally {
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;
            
            // 获取注解信息
            MethodSignature signature = (MethodSignature) joinPoint.getSignature();
            Method method = signature.getMethod();
            TimeLog timeLog = method.getAnnotation(TimeLog.class);
            String methodName = method.getName();
            
            // 记录方法执行时间
            logger.info("方法 [{}] 执行耗时: {}ms{}", 
                    methodName, 
                    duration,
                    timeLog.value().isEmpty() ? "" : " - " + timeLog.value());
        }
    }
}    