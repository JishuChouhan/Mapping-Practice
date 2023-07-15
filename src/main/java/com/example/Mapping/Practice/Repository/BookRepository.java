package com.example.Mapping.Practice.Repository;

import com.example.Mapping.Practice.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, String> {
}
