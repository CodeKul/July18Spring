package com.codekul.july18spring.manytomany.dto;

import com.codekul.july18spring.manytomany.model.Courses;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class StudentRequestDto {

    private Long rollNumber;

    private String name;

    private List<Courses> coursesList;
}
