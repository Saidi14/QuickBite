package cput.ac.za.quickbite_project.domain;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserTest {

    @Test
    void testCreateUser() {
        User user = new User.UserBuilder()
                .email("test@gmail.com")
                .firstName("Saidi")
                .lastName("Mwamchera")
                .build();
        System.out.println(user.toString());
    }
}