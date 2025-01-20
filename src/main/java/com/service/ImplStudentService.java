package com.service;

import com.exception.ServiceException;
import org.springframework.stereotype.Service;

@Service
public class ImplStudentService implements StudentService {
    @Override
    public String processRequest(String data) {

        if (!data.equals("123")) {
            throw new ServiceException("Service processing failed");
        }

        return "Success";
    }

}
