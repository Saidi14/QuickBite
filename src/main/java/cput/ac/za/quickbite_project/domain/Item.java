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
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long itemId;

    private String itemName;
    private String itemDescription;
    private double itemPrice;
    private String imageUrl;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ItemType itemType;
    @Setter
    private int quantity;
}
