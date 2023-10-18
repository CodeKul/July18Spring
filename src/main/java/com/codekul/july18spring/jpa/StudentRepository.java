package com.codekul.july18spring.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {

   Student findByIdAndName(Long id, String name);
}
//https://docs.spring.io/spring-data/jpa/docs/current/reference/html/