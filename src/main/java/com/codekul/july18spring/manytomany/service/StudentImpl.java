package com.codekul.july18spring.manytomany.service;

import com.codekul.july18spring.manytomany.dto.StudentRequestDto;
import com.codekul.july18spring.manytomany.model.Student;
import com.codekul.july18spring.manytomany.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public String saveStudent(StudentRequestDto requestDto) {
        var student = new Student();
        student.setName(requestDto.getName());
        student.setRollNumber(requestDto.getRollNumber());
        student.setCoursesList(requestDto.getCoursesList());
        studentRepo.save(student);
        return "saved successfully";
    }
}
