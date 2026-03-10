package cput.ac.za.quickbite_project.controller;

import cput.ac.za.quickbite_project.domain.ShoppingCart;
import cput.ac.za.quickbite_project.services.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/shoppingCart")
public class ShoppingCartController {
    @Autowired
    ShoppingCartService shoppingCartService;

    @GetMapping("/getById/{id}")
    public ShoppingCart getById(@PathVariable long id) {
        return shoppingCartService.findById(id);
    }

    @GetMapping("/getAll")
    public List<ShoppingCart> getAll() {
        return shoppingCartService.findAll();
    }

    @PostMapping("/add")
    public ShoppingCart add(@RequestBody ShoppingCart shoppingCart) {
        return shoppingCartService.save(shoppingCart);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable long id) {
        return shoppingCartService.deleteById(id);
    }

    //TODO: add and test update method
}
