package com.codekul.july18spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
//@EnableAspectJAutoProxy
public class Human {

    //advice            //pointcut
    @After(value = "pointcut()")
    public void wakUp(){
        System.out.println("Wake up");
    }
    @Before(value = "pointcut()")
    public void wakUp1(){
        System.out.println("Wake up");
    }

    @Pointcut("execution(public void study())")
    public void pointcut(){
    }

}
