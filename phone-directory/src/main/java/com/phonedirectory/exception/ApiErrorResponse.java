package com.phonedirectory.exception;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(value=Include.NON_EMPTY, content=Include.NON_NULL)
public class ApiErrorResponse {

	
    private int status;
    private int code;
    private String apiPath;
    private String message;
    private String description;
    private LocalDateTime dateTime;

    public ApiErrorResponse(int status, int code, String apiPath, String message) {
        this.status = status;
        this.code = code;
        this.apiPath = apiPath;
        this.message = message;
        this.dateTime = LocalDateTime.now();
    }
    
    public ApiErrorResponse(int status, int code, String apiPath, String message,String description) {
        this.status = status;
        this.code = code;
        this.message = message;
        this.description = description;
        this.dateTime = LocalDateTime.now();
    }

    public int getStatus() {
        return status;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
    public String getMessage() {
        return message;
    }
    
    public LocalDateTime getDateTime() {
        return dateTime;
    }
    public String getApiPath() {
        return apiPath;
    }

    @Override
    public String toString() {
        return "ApiErrorResponse{" +
                "status: " + status +
                ", code: " + code +
                ", message: " + message +
                ", DateTime: " + dateTime +
                '}';
    }
}
