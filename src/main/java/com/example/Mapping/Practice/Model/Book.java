package com.example.Mapping.Practice.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book {
    @Id
    private String BookID;
    private String title;
    private String author;
    private String description;
    private String price;

    @ManyToOne
    private Student student;
}
