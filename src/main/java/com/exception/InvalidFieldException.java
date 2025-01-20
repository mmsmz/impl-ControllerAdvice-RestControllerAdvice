package com.exception;

public class InvalidFieldException extends RuntimeException{

    private static final long SERIAL_VERSION_UID = 1L;
//    private String message;
    public InvalidFieldException(String message){
       super(message);
    }

//    @Override
//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }
}
