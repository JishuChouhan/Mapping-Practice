package com.example.Mapping.Practice.Controller;

import com.example.Mapping.Practice.Model.Student;
import com.example.Mapping.Practice.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable("id") String id) {
        return studentService.getStudentById(id);
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable("id") String id, @RequestBody Student student) {
        student.setID(id);
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable("id") String id) {
        studentService.deleteStudent(id);
    }
}
