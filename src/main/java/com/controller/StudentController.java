package com.controller;

import com.exception.InvalidFieldException;
import com.model.Student;
import io.micrometer.common.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @PostMapping
    public String saveStudentInfo(@RequestBody Student student) {
        if(StringUtils.isBlank(student.getLastName())){
            throw new InvalidFieldException("Last Name is missing");
        }
        return "Data is Saved";
    }


}
