package com.tringuyen.fooddelivery.services;

import com.tringuyen.fooddelivery.entity.RestaurantReviewEntity;
import com.tringuyen.fooddelivery.repository.RestaurantReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantReviewServiceImp implements RestaurantReviewService {

    @Autowired
    RestaurantReviewRepository restaurantReviewRepository;

    @Override
    public List<RestaurantReviewEntity> getAllRestaurantReviews() {
        return restaurantReviewRepository.findAll();
    }
}
