package com.example.restaurantsearch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import main.java.com.example.restaurantsearch.model.Restaurant;
import main.java.com.example.restaurantsearch.service.RestaurantService;

@RestController
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping("/restaurants")
    public List<Restaurant> getRestaurants(
            @RequestParam("city") String city,
            @RequestParam("type") String type) {
        return restaurantService.getRestaurants(city, type);
    }
}