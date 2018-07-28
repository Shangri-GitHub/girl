package com.hanxing.girl.intercept;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HttpIntercepter {
    @Pointcut("execution(public * com.hanxing.girl.controller.GirlController.*(..))")
    public void log() {

    }
    @Before("log()")
    public void doBefore(){
        
    }


}
