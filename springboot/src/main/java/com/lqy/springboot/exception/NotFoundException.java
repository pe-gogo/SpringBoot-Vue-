package com.lqy.springboot.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Data
public class NotFoundException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    private String customMsg;
    private Long code;

    public NotFoundException(Long code,String customMsg){
        super();
        this.code=code;
        this.customMsg=customMsg;
    }
}
