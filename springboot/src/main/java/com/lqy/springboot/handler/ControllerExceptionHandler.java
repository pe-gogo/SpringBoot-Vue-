package com.lqy.springboot.handler;
import com.lqy.springboot.exception.NotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice(
        //在此定义了拦截的包和类
        basePackages = {"com.lqy.springboot.controller.*"},
        annotations = {Controller.class, RestController.class}
)
public class ControllerExceptionHandler {
    //异常处理,因为我们的异常继承了Runtime异常，所以放在这里拦截
    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public Map<String,Object> exception(HttpServletRequest req,
                                        NotFoundException e){
        HashMap<String, Object> map = new HashMap<>();
        map.put("code",e.getCode());
        map.put("message",e.getCustomMsg());
        return map;
    }

}
