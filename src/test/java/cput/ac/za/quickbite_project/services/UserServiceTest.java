package cput.ac.za.quickbite_project.services;

import cput.ac.za.quickbite_project.domain.User;
import org.instancio.Instancio;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.instancio.Select.field;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserServiceTest {
    @Autowired
    UserService userService;

    User user = Instancio.of(User.class)
            .ignore(field(User::getUserId))
            .create();
    @Test
    void save() {
        System.out.println(userService.save(user));
    }

    @Test
    void deleteById() {
    }

    @Test
    void update() {
    }

    @Test
    void findById() {
    }

    @Test
    void findAll() {
    }
}