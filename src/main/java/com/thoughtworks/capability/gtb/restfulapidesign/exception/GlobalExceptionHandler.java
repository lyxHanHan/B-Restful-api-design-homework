package com.thoughtworks.capability.gtb.restfulapidesign.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    public ResponseEntity<ErrorResult> handle(MethodArgumentNotValidException ex) {
//        String message = ex.getBindingResult().getFieldError().getDefaultMessage();
//        ErrorResult errorResult = new ErrorResult(message);
//        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResult);
//    }

//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    public ResponseEntity<ErrorResult> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex){
//        ErrorResult errorResult = new ErrorResult( "用户名不合法");
//        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResult);
//    }

    @ExceptionHandler(StudentAlreadyExistException.class)
    public ResponseEntity<ErrorResult> handle(StudentAlreadyExistException ex) {
        ErrorResult errorResult = new ErrorResult(ex.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResult);
    }

    @ExceptionHandler(StudentNotExistException.class)
    public ResponseEntity<ErrorResult> handle(StudentNotExistException ex) {
        ErrorResult errorResult = new ErrorResult(ex.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResult);
    }

    @ExceptionHandler(TeamNotExistException.class)
    public ResponseEntity<ErrorResult> handle(TeamNotExistException ex) {
        ErrorResult errorResult = new ErrorResult(ex.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResult);
    }
}
