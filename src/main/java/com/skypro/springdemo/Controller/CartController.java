package com.skypro.springdemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/store/order")
public class CartController {
    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/add")

    public void add(@RequestParam int... ids) {
        cartService.add(ids);

    }

    @GetMapping("/get")
    public Collection<Integer> get() {
        return cartService.getItems();


    }
}
