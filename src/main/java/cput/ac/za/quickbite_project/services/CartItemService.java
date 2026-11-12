package cput.ac.za.quickbite_project.services;

import cput.ac.za.quickbite_project.domain.CartItem;
import cput.ac.za.quickbite_project.domain.Item;
import cput.ac.za.quickbite_project.domain.ShoppingCart;
import cput.ac.za.quickbite_project.repository.CartItemRepository;
import cput.ac.za.quickbite_project.repository.ItemRepository;
import cput.ac.za.quickbite_project.repository.ShoppingCartRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartItemService implements ICartItemService{
    CartItemRepository cartItemRepository;
    ItemRepository itemRepository;
    ShoppingCartRepository shoppingCartRepository;

    public CartItemService(CartItemRepository cartItemRepository, ShoppingCartRepository shoppingCartRepository, ItemRepository itemRepository) {
        this.cartItemRepository = cartItemRepository;
        this.itemRepository = itemRepository;
        this.shoppingCartRepository = shoppingCartRepository;
    }

    @Override
    public CartItem save(CartItem cartItem) {
        return cartItemRepository.save(cartItem);
    }

    public CartItem saveItemToCart(long itemId, long cartId){
        ShoppingCart cart = shoppingCartRepository.findById(cartId).orElseThrow(() -> new RuntimeException("Provided cart does not exist"));
        Item item = itemRepository.findById(itemId).orElseThrow(() -> new RuntimeException("Provided item does not exist"));

        return cartItemRepository.save(
                CartItem.builder()
                        .item(item)
                        .cart(cart)
                        .quantity(1)//default
                        .build()
        );
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

    public CartItem setQuantity(Long id, int quantity ){
        CartItem cartItem = cartItemRepository.findById(id).orElseThrow(() -> new RuntimeException("CartItem doesn't exist"));
        cartItem.setQuantity(quantity);
        return cartItemRepository.save( cartItem);
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
