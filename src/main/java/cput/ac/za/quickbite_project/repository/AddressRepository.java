package cput.ac.za.quickbite_project.repository;

import cput.ac.za.quickbite_project.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {
}
