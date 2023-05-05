package com.example.controllers;

import com.example.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/order")
public class BasketController {
    private final BasketService basketService;

    @Autowired
    public BasketController (BasketServiceImpl basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add")
    public String add(@RequestParam("ID") int ...id) {
        basketService.add(id);
        return Arrays.toString(id);
    }
    @GetMapping("/get")
    public String add() {
        return basketService.get().toString();
    }
}