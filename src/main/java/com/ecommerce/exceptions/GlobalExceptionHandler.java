package com.ecommerce.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String >> methodArgumentNotValidException(MethodArgumentNotValidException m){
        Map<String , String> map = new HashMap<>();
        m.getBindingResult().getAllErrors().forEach(
                err -> {
                    String fieldName = ((FieldError)err).getField();
                    String message = err.getDefaultMessage();
                    map.put(fieldName,message);
                }
        );
        return new ResponseEntity<Map<String, String>>(map, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<String> resourceNotFoundException(ResourceNotFoundException r){
        String message = r.getMessage();
        return new ResponseEntity<String>(message,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(APIException.class)
    public ResponseEntity<String> apiException(APIException a){
        String message = a.getMessage();
        return new ResponseEntity<String>(message,HttpStatus.BAD_REQUEST);
    }
}
