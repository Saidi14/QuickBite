package cput.ac.za.quickbite_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface ShoppingCartRepository extends JpaRepository<cput.ac.za.quickbite_project.domain.ShoppingCart, Long> {
}
