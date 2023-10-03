package com.libertech.blog.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFundException extends RuntimeException{
    private String resourceName;
    private String fieldName;
    private String filedValue;


    public ResourceNotFundException(String resourceName, String fieldName, String filedValue) {
        super(String.format("%s not found with %s : '%s'", resourceName, fieldName, filedValue));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.filedValue = filedValue;
    }
    public String getResourceName() {
        return resourceName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getFiledValue() {
        return filedValue;
    }
}
