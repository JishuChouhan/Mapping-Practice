package com.example.Mapping.Practice.Repository;

import com.example.Mapping.Practice.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, String> {
}
