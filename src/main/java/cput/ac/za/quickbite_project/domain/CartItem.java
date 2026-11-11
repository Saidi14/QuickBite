package cput.ac.za.quickbite_project.domain;

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
    private ShoppingCart cart;

    @OneToOne
    @JoinColumn(name = "itemId", referencedColumnName = "itemId")
    private Item item;

    private int quantity;
}
