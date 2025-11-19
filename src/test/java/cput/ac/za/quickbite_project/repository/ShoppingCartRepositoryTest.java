package cput.ac.za.quickbite_project.repository;

import cput.ac.za.quickbite_project.domain.ShoppingCart;
import org.instancio.Instancio;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.instancio.Select.field;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShoppingCartRepositoryTest {
    @Autowired
    private ShoppingCartRepository shoppingCartRepository;

    ShoppingCart shoppingCart = Instancio.of(ShoppingCart.class)
            .ignore(field(ShoppingCart::getShoppingCartId))
            .create();

    @Test
    void testInsertShoppingCart() {
        System.out.println(shoppingCartRepository.save(shoppingCart));
    }
}