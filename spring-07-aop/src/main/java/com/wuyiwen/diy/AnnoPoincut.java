package com.wuyiwen.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AnnoPoincut {


    @Before("execution(* com.wuyiwen.service.UserServiceImpl.*(..)) ")
    public void before(){
        System.out.println("defofreee =======");
    }

    @Around("execution(* com.wuyiwen.service.UserServiceImpl.*(..)) ")
    public void aroud(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("qian");
        System.out.println("qianming "+ jp.getSignature());


        Object proceed = jp.proceed();
        System.out.println("hou ");
        System.out.println(proceed);
    }


}
