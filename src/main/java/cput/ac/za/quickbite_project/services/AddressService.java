package cput.ac.za.quickbite_project.services;

import cput.ac.za.quickbite_project.domain.Address;
import cput.ac.za.quickbite_project.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService implements IAddressService{

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public Address save(Address address) {
        addressRepository.save(address);
        return address;
    }

    @Override
    public boolean deleteById(Long id) {
        addressRepository.deleteById(id);
        return true;
    }

    @Override
    public Address update(Address address) {
        addressRepository.save(address);
        return address;
    }

    @Override
    public Address findById(Long id) {
        return addressRepository.findById(id).orElse(null);
    }

    @Override
    public List<Address> findAll() {
        return addressRepository.findAll();
    }
}
