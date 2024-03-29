package com.example.Mapping.Practice.Controller;

import com.example.Mapping.Practice.Model.Address;
import com.example.Mapping.Practice.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class AddressController {
    private final AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping
    public List<Address> getAllAddresss() {
        return addressService.getAllAddresss();
    }

    @GetMapping("/{id}")
    public Address getAddressById(@PathVariable("id") String id) {
        return addressService.getAddressById(id);
    }

    @PostMapping
    public Address createAddress(@RequestBody Address address) {
        return addressService.createAddress(address);
    }

    @PutMapping("/{id}")
    public Address updateAddress(@PathVariable("id") Long id, @RequestBody Address address) {
        address.setAddressId(id);
        return addressService.updateAddress(address);
    }

    @DeleteMapping("/{id}")
    public void deleteAddress(@PathVariable("id") String id) {
        addressService.deleteAddress(id);
    }
}
