package cput.ac.za.quickbite_project.services;

import cput.ac.za.quickbite_project.domain.CartItem;
import cput.ac.za.quickbite_project.repository.CartItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartItemService implements ICartItemService{
    CartItemRepository cartItemRepository;

    public CartItemService(CartItemRepository cartItemRepository) {
        this.cartItemRepository = cartItemRepository;
    }

    @Override
    public CartItem save(CartItem cartItem) {
        return cartItemRepository.save(cartItem);
    }

    @Override
    public boolean deleteById(Long cartItemId) {
        cartItemRepository.deleteById(cartItemId);
        return true;
    }

    @Override
    public CartItem update(CartItem cartItem) {
        return cartItemRepository.save(cartItem);
    }

    @Override
    public CartItem findById(Long cartItemId) {
        return cartItemRepository.findById(cartItemId).orElse(null);
    }

    @Override
    public List<CartItem> findAll() {
        return cartItemRepository.findAll();
    }
}
