package cput.ac.za.quickbite_project.controller;

import cput.ac.za.quickbite_project.domain.Item;
import cput.ac.za.quickbite_project.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {
    @Autowired
    ItemService itemService;

    @GetMapping("/getById/{id}")
    public Item getItem(@PathVariable long id){
        return itemService.findById(id);
    }

    @GetMapping
    public List<Item> getAllItems(){
        return itemService.findAll();
    }

    @PutMapping("/add")
    public Item addItem(@RequestBody Item item){
        return itemService.save(item);
    }

}
