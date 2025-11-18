package cput.ac.za.quickbite_project.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashMap;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
public class ShoppingCart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int shoppingCartId;
    @ElementCollection
    HashMap<Item, Integer> Items;

}
