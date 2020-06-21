package com.wanho.java146.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * 增强类
 */
@Component
@Aspect
public class WifeAdvice2 {
    @Pointcut("execution(* com.wanho.java146.service.impl.AKe.showInfo(String,int))")
    private void haha(){}

//    @Before("haha()")
    public void sayHello(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("相公，您好！！！");
    }

//    @AfterReturning(value="haha()",returning = "returnVal")
    public void sayBye(Object returnVal){
        System.out.println("方法执行结果:"+returnVal);
        System.out.println("相公，再见 ！！！");
    }

//    @AfterThrowing(value = "haha()",throwing = "t")
    public void throwing(Throwable t){
        System.out.println("异常:"+t.getMessage());
        System.out.println("相公，滚！！！");
    }

//    @After("haha()")
    public void close(){
        System.out.println("=========相公 离婚=========");
    }


    @Around("haha()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable{
        Object returnVal = null ;
        try {
            System.out.println("参数:"+Arrays.toString(pjp.getArgs()));
            returnVal = pjp.proceed();
            System.out.println("返回值："+returnVal);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("异常:"+throwable.getMessage());
        } finally {
            close();
        }
        return  returnVal ;
    }
}
