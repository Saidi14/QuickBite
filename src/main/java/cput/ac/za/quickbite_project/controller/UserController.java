package cput.ac.za.quickbite_project.controller;

import cput.ac.za.quickbite_project.domain.User;
import cput.ac.za.quickbite_project.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getById{id}")
    public User getById(@PathVariable long id){
        return userService.findById(id);
    }

    @GetMapping("getAll")
    public List<User> getAll(){
        return userService.findAll();
    }

    @PostMapping("/add")
    public User add(@RequestBody User user){
        return userService.save(user);
    }

    @DeleteMapping("deleteById/{id}")
    public boolean  delete(@PathVariable long id){
        return userService.deleteById(id);
    }
}
