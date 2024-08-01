package com.example.restaurantsearch.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import main.java.com.example.restaurantsearch.model.Restaurant;

@Service
public class RestaurantService {

    @Value("${google.api.key}")
    private String apiKey;

    public List<Restaurant> getRestaurants(String city, String type) {
        String url = String.format(
                "https://maps.googleapis.com/maps/api/place/textsearch/json?query=%s+restaurants+in+%s&key=%s",
                type, city, apiKey);

        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url, String.class);

        List<Restaurant> restaurants = new ArrayList<>();
        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode root = mapper.readTree(response);
            JsonNode results = root.path("results");

            for (JsonNode result : results) {
                Restaurant restaurant = new Restaurant();
                restaurant.setName(result.path("name").asText());
                restaurant.setAddress(result.path("formatted_address").asText());
                restaurant.setRating(result.path("rating").asDouble());
                restaurants.add(restaurant);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return restaurants;
    }
}