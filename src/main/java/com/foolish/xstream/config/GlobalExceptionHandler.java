package com.foolish.xstream.config;

import com.foolish.xstream.dto.RspDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.validation.ConstraintViolationException;
import javax.validation.ValidationException;

/**
 * @description:
 * @author：chaoxianfei
 * @date：2020/4/24 16:39
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {


    private static int DUPLICATE_KEY_CODE = 1001;
    private static int PARAM_FAIL_CODE = 1002;
    private static int VALIDATION_CODE = 1003;


    /**
     * 方法参数校验
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public RspDTO handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        //log.error(e.getMessage(), e);
        return RspDTO.builder().code(PARAM_FAIL_CODE).msg(e.getBindingResult().getFieldError().getDefaultMessage()).build();
    }

    /**
     * ValidationException
     */
    @ExceptionHandler(ValidationException.class)
    public RspDTO handleValidationException(ValidationException e) {
        log.error(e.getMessage(), e);
        return RspDTO.builder().code(VALIDATION_CODE).msg(e.getCause().getMessage()).build();
    }

    /**
     * ConstraintViolationException
     */
    @ExceptionHandler(ConstraintViolationException.class)
    public RspDTO handleConstraintViolationException(ConstraintViolationException e) {
        log.error(e.getMessage(), e);
        return RspDTO.builder().code(PARAM_FAIL_CODE).msg(e.getMessage()).build();
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    public RspDTO handlerNoFoundException(Exception e) {
        log.error(e.getMessage(), e);
        return RspDTO.builder().code(404).msg("路径不存在，请检查路径是否正确").build();
    }


    @ExceptionHandler(Exception.class)
    public RspDTO handleException(Exception e) {
        log.error(e.getMessage(), e);
        return RspDTO.builder().code(500).msg("系统繁忙,请稍后再试").build();
    }
}