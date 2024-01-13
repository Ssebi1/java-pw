package com.sebi.deliver.controller;

import com.sebi.deliver.model.CartItem;
import com.sebi.deliver.model.User;
import com.sebi.deliver.service.CartService;
import com.sebi.deliver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/cart")
public class CartController {
    private final CartService cartService;

    @Autowired
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("{id}")
    public List<CartItem> getCart(@PathVariable Long id) {
        return cartService.getCart(id);
    }

    @DeleteMapping("{id}/{product_id}")
    public CartItem deleteProductFromCart(@PathVariable Long id, @PathVariable Long product_id) {
        return cartService.deleteProductFromCart(id, product_id);
    }

    @PostMapping("{id}/{product_id}")
    public CartItem addProductToCart(@PathVariable Long id, @PathVariable Long product_id) {
        return cartService.addProductToCart(id, product_id);
    }

    @DeleteMapping("{id}")
    public void deleteCart(@PathVariable Long id) {
        cartService.deleteCart(id);
    }
}
