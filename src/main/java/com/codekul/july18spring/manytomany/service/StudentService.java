package com.codekul.july18spring.manytomany.service;

import com.codekul.july18spring.manytomany.dto.StudentRequestDto;
import com.codekul.july18spring.manytomany.model.Student;

public interface StudentService {

    String saveStudent(StudentRequestDto student);

}
