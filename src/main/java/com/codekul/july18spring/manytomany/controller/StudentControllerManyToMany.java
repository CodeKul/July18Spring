package com.codekul.july18spring.manytomany.controller;

import com.codekul.july18spring.manytomany.dto.StudentRequestDto;
import com.codekul.july18spring.manytomany.model.Student;
import com.codekul.july18spring.manytomany.repository.StudentRepo;
import com.codekul.july18spring.manytomany.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentControllerManyToMany {

    @Autowired
    private StudentService service;

    @PostMapping("save")
    public String saveStudent(@RequestBody StudentRequestDto requestDto) {
       return service.saveStudent(requestDto);
    }
}
