package cput.ac.za.quickbite_project.controller;

import cput.ac.za.quickbite_project.domain.CartItem;
import cput.ac.za.quickbite_project.services.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cartItem")
public class CartItemController {
    @Autowired
    CartItemService cartItemService;
    
    @GetMapping("/getById{id}")
    public CartItem getById(@PathVariable("id") long id){
        return cartItemService.findById(id);
    }
    
    @GetMapping("/getAll")
    public List<CartItem> getAll(){
        return cartItemService.findAll();
    }
    
    @PostMapping("/save")
    public CartItem save(@RequestBody CartItem cartItem){
        return cartItemService.save(cartItem);
    }
    
    @DeleteMapping("/delete{id}")
    public boolean delete(@PathVariable("id") long id){
        return cartItemService.deleteById(id);
    }
    
    //TODO": add and test update function
}
