package com.codekul.july18spring.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
//@EnableAspectJAutoProxy
public class Human {

    //advice            //pointcut
//    @After(value = "pointcut()")
//    public void wakUp(){
//        System.out.println("Wake up");
//    }
//    @Before(value = "pointcut()")
//    public void wakUp1(){
//        System.out.println("Wake up");
//    }

    @Pointcut("execution(public * study*())")
    public void pointcut(){
    }

    @AfterReturning(value = "pointcut()",returning = "value")
    public void getValue(int value) {
        System.out.println("return value is ->"+value);
    }

    @AfterThrowing(value = "pointcut()",throwing = "value")
    public void getException(MyException value){
        System.out.println(value);
    }

}
