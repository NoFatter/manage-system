package org.nofat.manage.handle;

import org.nofat.manage.common.R;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * GlobalExceptionHandler 异常全局拦截器
 *
 * @author liyutao
 * @version 2023/11/14 16:43
 **/
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler
    public R<String> handlerException(Exception e){
        return R.error(e.getMessage());
    }
}
