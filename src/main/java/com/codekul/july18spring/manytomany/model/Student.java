package com.codekul.july18spring.manytomany.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long rollNumber;

    private String name;

    @ManyToMany
    @JoinTable(name = "stud_courses",
            joinColumns = {@JoinColumn(name = "stud_id",referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "course_id",referencedColumnName = "id")})
    private List<Courses> coursesList;

}
