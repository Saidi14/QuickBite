package cput.ac.za.quickbite_project.controller;

import cput.ac.za.quickbite_project.domain.Invoice;
import cput.ac.za.quickbite_project.services.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/invoice")
public class InvoiceController {
    @Autowired
    InvoiceService invoiceService;

    @GetMapping("/getById/{id}")
    public Invoice getById(@PathVariable long id){
        return invoiceService.findById(id);
    }

    @GetMapping("/getALl")
    public List<Invoice> getAll(){
        return invoiceService.findAll();
    }

    @PutMapping("/add")
    public Invoice add(@RequestBody Invoice invoice){
        return invoiceService.save(invoice);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable long id){
        return invoiceService.deleteById(id);
    }
}
