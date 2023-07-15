package com.example.Mapping.Practice.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    @Id
    private String CourseId;
    private String title;
    private String description;
    private String duration;

    @ManyToMany
    List<Student> studentList;
}
