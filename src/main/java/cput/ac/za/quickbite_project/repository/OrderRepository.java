package cput.ac.za.quickbite_project.repository;

import cput.ac.za.quickbite_project.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
