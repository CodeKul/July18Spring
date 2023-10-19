package com.codekul.july18spring.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {

   Student findByIdAndName(Long id, String name);
   Student findByIdOrName(Long id,String name);
   Student findDistinctByIdOrName(Long id,String name);
   Student findByName(String name);
   List<Student> findByDobBetween(LocalDate firstDate, LocalDate secondDate);
   List<Student> findByMarksLessThanEqual(Integer marks);
   @Query(value = "select * from student where name= ?1",nativeQuery = true)
   List<Student> findStudentOrderBy(@Param("Name") String name);

}
//https://docs.spring.io/spring-data/jpa/docs/current/reference/html/