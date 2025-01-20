package com.controller;

import com.exception.InvalidFieldException;
import com.model.Student;
import com.service.StudentService;
import io.micrometer.common.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.security.Provider;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping
    public String saveStudentInfo(@RequestBody Student student) {
        if(StringUtils.isBlank(student.getLastName())){
            throw new InvalidFieldException("Last Name is missing");
        }
        return "Data is Saved";
    }


    @GetMapping("/{id}")
    public ResponseEntity<String> getExample(@PathVariable(name = "id") String studentId) {
        String status = studentService.processRequest(studentId);
        return new ResponseEntity<>(status, HttpStatus.OK);
    }


}
