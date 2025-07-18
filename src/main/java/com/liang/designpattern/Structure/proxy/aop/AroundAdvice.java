package com.liang.designpattern.Structure.proxy.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


/**
 * ClassName: AroudAdvice
 * Package: com.liang.advice
 * Description:
 *
 * @Author liang
 * @Create 2024/7/28 16:54
 * @Version jdk17.0
 */
@Aspect
@Component
public class AroundAdvice {
    /**
     * 环绕通知 ,需要你在通知中，定义目标方法的执行
     * @param joinPoint
     * @return 目标方法的返回值
     */
    public  Object  around(ProceedingJoinPoint joinPoint){

        return null;
    }

    // 使用@Around注解标明环绕通知方法
    @Around(value = "execution(* com..impl.*.*(..))")
    public Object manageTransaction(
            // 通过在通知方法形参位置声明ProceedingJoinPoint类型的形参，
            // Spring会将这个类型的对象传给我们
            ProceedingJoinPoint joinPoint) {


        // 通过ProceedingJoinPoint对象获取外界调用目标方法时传入的实参数组
        Object[] args = joinPoint.getArgs();

        // 通过ProceedingJoinPoint对象获取目标方法的签名对象
        Signature signature = joinPoint.getSignature();

        // 通过签名对象获取目标方法的方法名
        String methodName = signature.getName();

        // 声明变量用来存储目标方法的返回值
        Object targetMethodReturnValue = null;

        try {

            // 在目标方法执行前：开启事务（模拟）


            // 过ProceedingJoinPoint对象调用目标方法
            // 目标方法的返回值一定要返回给外界调用者
            targetMethodReturnValue = joinPoint.proceed(args);

            // 在目标方法成功返回后：提交事务（模拟）

        }catch (Throwable e){
            throw new RuntimeException(e); //这里异常需要再抛出

            // 在目标方法抛异常后：回滚事务（模拟）


        }finally {

            // 在目标方法最终结束后：释放数据库连接


        }

        return targetMethodReturnValue;
    }
}
