package com.tringuyen.fooddelivery.services;

import com.tringuyen.fooddelivery.entity.FoodReviewEntity;
import com.tringuyen.fooddelivery.repository.FoodReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FoodReviewServiceImp implements FoodReviewService {
    @Autowired
    FoodReviewRepository foodReviewRepository;
    @Override
    public List<FoodReviewEntity> getAllFoodReviews() {
        return foodReviewRepository.findAll();
    }
}
