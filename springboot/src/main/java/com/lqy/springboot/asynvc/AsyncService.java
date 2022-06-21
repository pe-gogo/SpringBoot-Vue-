package com.lqy.springboot.asynvc;


import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {

    @Async
    public void getMessage(){
        System.out.println(Thread.currentThread().getName());

    }
}
