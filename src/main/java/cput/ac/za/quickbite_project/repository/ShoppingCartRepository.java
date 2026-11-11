package cput.ac.za.quickbite_project.repository;

import cput.ac.za.quickbite_project.domain.ShoppingCart;
import cput.ac.za.quickbite_project.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {
    boolean existsByUser(User user);

}
