package com.hanxing.girl.intercept;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HttpIntercepter {

    private final static Logger logger = LoggerFactory.getLogger(HttpIntercepter.class);

    @Pointcut("execution(public * com.hanxing.girl.controller.GirlController.*(..))")
    public void log() {

    }

    @Before("log()")
    public void doBefore() {
        logger.info("11");
    }

    @After("log()")
    public void doAftere() {
        logger.info("222");
    }


}
