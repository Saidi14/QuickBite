package cput.ac.za.quickbite_project.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
public class ShoppingCart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long shoppingCartId;

    @OneToOne
    @JoinColumn(name = "userId", nullable = false, unique = true)
    User user;
}
