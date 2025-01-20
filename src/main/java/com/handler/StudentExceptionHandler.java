package com.handler;

import com.exception.InvalidFieldException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;


//@ControllerAdvice
@RestControllerAdvice
public class StudentExceptionHandler {

    @ExceptionHandler(InvalidFieldException.class)
//    @ResponseBody
    public String handleEmptyFieldException(InvalidFieldException exception) {
        return exception.getMessage();
    }

/*    @ExceptionHandler
//    @ResponseBody
    public ResponseEntity<Map<String, Object>> handleEmptyFieldException(InvalidFieldException exception) {
        // Create a Map for error response
        Map<String, Object> errorResponse = new HashMap<>();
        errorResponse.put("timestamp", LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        errorResponse.put("status", HttpStatus.BAD_REQUEST.value());
        errorResponse.put("error", "Invalid Field");
        errorResponse.put("message", exception.getMessage()); // Custom exception message
        errorResponse.put("path", "/student");

        // Return the structured error response with status 400
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }*/
}
