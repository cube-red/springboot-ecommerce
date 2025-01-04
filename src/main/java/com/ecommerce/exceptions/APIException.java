package com.ecommerce.exceptions;

public class APIException extends RuntimeException{
    String resourceName;
    String field;
    String fieldName;
    Long fieldId;

    public APIException(String resourceName, String field, String fieldName) {
        super(String.format("%s already found with %s %s",resourceName,field,fieldName));
        this.resourceName = resourceName;
        this.field = field;
        this.fieldName = fieldName;
    }

    public APIException(String resourceName, String field, Long fieldId) {
        super(String.format("%s not already with %s %d",resourceName,field,fieldId));
    }
}
