package com.example.Mapping.Practice.Repository;

import com.example.Mapping.Practice.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, String> {
}
