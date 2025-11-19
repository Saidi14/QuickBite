package cput.ac.za.quickbite_project.repository;

import cput.ac.za.quickbite_project.domain.Item;
import org.instancio.Instancio;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.instancio.Select.field;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ItemRepositoryTest {
    @Autowired
    ItemRepository itemRepository;
    Item item = Instancio.of(Item.class)
            .ignore(field(Item::getItemId))
            .create();

    @Test
    void testInsertItem() {
        System.out.println(itemRepository.save(item));
    }
}