package com.example.Mapping.Practice.Controller;

import com.example.Mapping.Practice.Model.Course;
import com.example.Mapping.Practice.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {
    private final CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @GetMapping("/{id}")
    public Course getCourseById(@PathVariable("id") String id) {
        return courseService.getCourseById(id);
    }

    @PostMapping
    public Course createCourse(@RequestBody Course course) {
        return courseService.createCourse(course);
    }

    @PutMapping("/{id}")
    public Course updateCourse(@PathVariable("id") String id, @RequestBody Course course) {
        course.setCourseId(id);
        return courseService.updateCourse(course);
    }

    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable("id") String id) {
        courseService.deleteCourse(id);
    }
}
