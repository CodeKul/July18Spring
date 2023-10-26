package com.codekul.july18spring.manytomany.controller;

import com.codekul.july18spring.manytomany.model.Student;
import com.codekul.july18spring.manytomany.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentControllerManyToMany {

    @Autowired
    private StudentRepo studentRepo;

    @PostMapping("save")
    public String saveStudent(@RequestBody Student student) {
        studentRepo.save(student);
        return  "saved successfully";
    }
}
