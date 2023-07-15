package com.example.Mapping.Practice.Repository;

import com.example.Mapping.Practice.Model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository<Laptop, String> {
}
