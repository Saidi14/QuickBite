package cput.ac.za.quickbite_project.controller;

import cput.ac.za.quickbite_project.domain.Address;
import cput.ac.za.quickbite_project.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/getById/{id}")
    public Address getById(@PathVariable("id")Long id){
        return addressService.findById(id);
    }

    @GetMapping("/getAll")
    public List<Address> getAll(){
        return addressService.findAll();
    }

    @PostMapping("/add")
    public Address save(@RequestBody Address address){
        return addressService.save(address);
    }

    @DeleteMapping("/deleteById/{id}")
    public boolean deleteById(@PathVariable("id")Long id){
        return addressService.deleteById(id);
    }

    //Todo add and test update method
}
