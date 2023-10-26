package com.codekul.july18spring.manytomany.repository;

import com.codekul.july18spring.manytomany.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Long> {
}
