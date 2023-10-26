//package com.codekul.july18spring.jpa;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.time.LocalDate;
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//public class StudentController {
//
//    @Autowired
//    private StudentRepository studentRepository;
//
//    @PostMapping("saveStudent")
//    public String saveStudent(@RequestBody Student student) {
//        Student student1 = studentRepository.save(student);
//        return student1.getName() + "student saved successfully";
//    }
//
//    @GetMapping("getAllStudents")
//    public List<Student> saveStudent() {
//        return studentRepository.findAll();
//    }
//
//    @GetMapping("getStudentById/{id}/{name}")
//    public Student getStudentById(@PathVariable("id") Long id, @PathVariable("name") String name) {
//        return studentRepository.findByIdAndName(id, name);
//    }
//
//    @GetMapping("getStudentById1/{id}")
//    public Optional<Student> getStudentById1(@PathVariable("id") Long id) {
//        return studentRepository.findById(id);
//    }
//
//    @PutMapping("updateStudent")
//    public Student updateStudent(@RequestBody Student student) {
//
//        Student student1 = studentRepository.getReferenceById(student.getId());
//        student1.setId(student.getId());
//        student1.setName(student.getName());
//        student1.setAddress(student.getAddress());
//
//        return studentRepository.save(student1);
//    }
//
//    @DeleteMapping("deleteStudent")
//    public String deleteStudent(@RequestBody Student student) {
//        studentRepository.delete(student);
//        return "student deleted.";
//    }
//
//    @DeleteMapping("deleteStudentById/{id}")
//    public String deleteStudentById(@PathVariable(value = "id",required = false) Long id) {
//        studentRepository.deleteById(id);
//        return "student deleted.";
//    }
//    @GetMapping("findByDob")
//    public List<Student> findByDob(@RequestParam(required = false) LocalDate firstDate,@RequestParam LocalDate secondDate) {
//       return studentRepository.findByDobBetween(firstDate, secondDate);
//    }
//    @GetMapping("findByMarksLessThan")
//    public List<Student> findByMarksLessThan(@RequestParam(required = true) String name) {
//       return studentRepository.findStudentOrderBy(name);
//    }
//
//}
