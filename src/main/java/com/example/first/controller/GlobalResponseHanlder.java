package com.example.first.controller;

import com.example.first.bean.ApiReturn;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

//@ControllerAdvice(annotations = {RestController.class})
public class GlobalResponseHanlder implements ResponseBodyAdvice<Object> {
    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
        final String returnTypeName = returnType.getParameterType().getName();
        return !ApiReturn.class.getName().equals(returnTypeName);
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        final String returnTypeName = returnType.getParameterType().getName();
        if("void".equals(returnTypeName)){
            return ApiReturn.success(null);
        }
        if(!selectedContentType.includes(MediaType.APPLICATION_JSON)) {
            return body;
        }
        if(ApiReturn.class.getName().equals(returnTypeName)) {
            return body;
        }
        return ApiReturn.success(body);
    }


}
