package com.example.services;

import java.util.List;

public interface BasketService {
    void add(int ...id);

    List<Integer> get();
}