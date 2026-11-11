package cput.ac.za.quickbite_project.domain;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@ToString
public class CartItem {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long cartItemId;

    @ManyToOne
    @JoinColumn(name = "shoppingCartId", nullable = false)
    private ShoppingCart cart;

    @OneToOne
    @JoinColumn(name = "itemId", nullable = false)
    private Item item;

    @Setter
    private int quantity;
}
