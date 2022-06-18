package com.lqy.springboot.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Slf4j
@Configuration
@Component
@Aspect
public class UserAop {

    Logger logger= (org.slf4j.Logger)LoggerFactory.getLogger(this.getClass());

    @Pointcut("execution(public * com.lqy.springboot.controller.UserController.*(..))")
    public void pt(){

    }

    @After("pt()")
    public void after(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        logger.info(args[0].toString());
    }





}
