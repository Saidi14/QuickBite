package cput.ac.za.quickbite_project.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int addressId;
    private String Line1;
    private String Line2;
    private String City;
    private String Province;
    private String Country;
}
