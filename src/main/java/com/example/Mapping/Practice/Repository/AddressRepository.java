package com.example.Mapping.Practice.Repository;

import com.example.Mapping.Practice.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, String> {
}
