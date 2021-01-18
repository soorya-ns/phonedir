package com.phonedirectory.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomizedExceptionHandling extends ResponseEntityExceptionHandler {

    @ExceptionHandler(NoDataFoundException.class)
    public ResponseEntity<Object> handleExceptions( NoDataFoundException exception, WebRequest webRequest) {
    	ApiErrorResponse response = new ApiErrorResponse(404, 4041, webRequest.getContextPath(), exception.getMessage());
        ResponseEntity<Object> entity = new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
        return entity;
    }
    
    @ExceptionHandler(DatabaseSQLException.class)
    public ResponseEntity<Object> dbsSQLHandleExceptions( DatabaseSQLException exception, WebRequest webRequest) {
    	ApiErrorResponse response = new ApiErrorResponse(409, 4091, webRequest.getContextPath(), exception.getMessage(), exception.getDescription());
        ResponseEntity<Object> entity = new ResponseEntity<>(response,HttpStatus.CONFLICT);
        return entity;
    }
    
    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<Object> badRequestHandleExceptions( BadRequestException exception, WebRequest webRequest) {
    	ApiErrorResponse response = new ApiErrorResponse(400, 4001, webRequest.getContextPath(), exception.getMessage());
        ResponseEntity<Object> entity = new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
        return entity;
    }
    
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleExceptions( Exception exception, WebRequest webRequest) {
    	ApiErrorResponse response = new ApiErrorResponse(500, 5002, webRequest.getContextPath(), exception.getMessage(), exception.getStackTrace().toString());
        ResponseEntity<Object> entity = new ResponseEntity<>(response,HttpStatus.INTERNAL_SERVER_ERROR);
        return entity;
    }
}
