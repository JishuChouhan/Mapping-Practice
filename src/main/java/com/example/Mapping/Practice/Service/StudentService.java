package com.example.Mapping.Practice.Service;

import com.example.Mapping.Practice.Model.Student;
import com.example.Mapping.Practice.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public void deleteStudent(String id) {
        studentRepository.deleteById(id);
    }

    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();

    }

    public Student getStudentById(String id) {
        return studentRepository.findById(id).orElse(null);
    }
}
