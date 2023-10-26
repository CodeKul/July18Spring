package com.codekul.july18spring.manytomany.controller;

import com.codekul.july18spring.manytomany.model.Courses;
import com.codekul.july18spring.manytomany.repository.CoursesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("course")
public class CourseController {

    @Autowired
    private CoursesRepo coursesRepo;

    @PostMapping("save")
    public String saveCourses(@RequestBody Courses courses) {
        coursesRepo.save(courses);
        return "saved successfully";
    }

}
/**
 *
 * {
 *     "rollNumber":1,
 *     "name":"Raj",
 *     "coursesList":[
 *         {
 *             "id":1
 *         },
 *         {
 *             "id":2
 *         }
 *     ]
 * }
 */
