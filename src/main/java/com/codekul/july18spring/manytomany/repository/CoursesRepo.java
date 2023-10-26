package com.codekul.july18spring.manytomany.repository;

import com.codekul.july18spring.manytomany.model.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursesRepo extends JpaRepository<Courses,Long> {
}
