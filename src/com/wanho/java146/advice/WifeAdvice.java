package com.wanho.java146.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 增强类
 */
//@Component
//@Aspect
public class WifeAdvice {
    @Pointcut("execution(* com.wanho.java146.service.impl.AKe.service())")
    private void haha(){}

    //@Before("haha()")
    public void sayHello(){
        System.out.println("相公，您好！！！");
    }

    //@AfterReturning("haha()")
    public void sayBye(){
        System.out.println("相公，再见 ！！！");
    }

    //@AfterThrowing("haha()")
    public void throwing(){
        System.out.println("相公，滚！！！");
    }

    //@After("haha()")
    public void close(){
        System.out.println("=========相公 离婚=========");
    }


    @Around("haha()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable{
        Object returnVal = null ;
        try {
            sayHello();
            returnVal = pjp.proceed();
            sayBye();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            throwing();
        } finally {
            close();
        }
        return  returnVal ;
    }
}
