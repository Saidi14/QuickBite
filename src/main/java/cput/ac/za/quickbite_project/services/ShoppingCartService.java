package cput.ac.za.quickbite_project.services;

import cput.ac.za.quickbite_project.domain.ShoppingCart;
import cput.ac.za.quickbite_project.domain.User;
import cput.ac.za.quickbite_project.repository.ShoppingCartRepository;
import cput.ac.za.quickbite_project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCartService implements IShoppingCartService{
    ShoppingCartRepository shoppingCartRepository;
    UserRepository userRepository;

    @Autowired
    public ShoppingCartService(ShoppingCartRepository shoppingCartRepository, UserRepository userRepository) {
        this.shoppingCartRepository = shoppingCartRepository;
        this.userRepository = userRepository;
    }
    @Override
    public ShoppingCart save(ShoppingCart shoppingCart) {
        return shoppingCartRepository.save(shoppingCart);
    }

    public ShoppingCart saveForUser(Long userId){
        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User Not Found"));
        if(shoppingCartRepository.existsByUser(user)){
            throw new RuntimeException("User already has a shopping cart");
        }
        return shoppingCartRepository.save(
                ShoppingCart.builder()
                .user(user)
                .build()) ;
    }
    @Override
    public boolean deleteById(Long shoppingCartId) {
        shoppingCartRepository.deleteById(shoppingCartId);
        return true;
    }

    @Override
    public ShoppingCart update(ShoppingCart shoppingCart) {
        return shoppingCartRepository.save(shoppingCart);
    }

    @Override
    public ShoppingCart findById(Long shoppingCartId) {
        return shoppingCartRepository.findById(shoppingCartId).orElse(null);
    }

    @Override
    public List<ShoppingCart> findAll() {
        return shoppingCartRepository.findAll();
    }
}
