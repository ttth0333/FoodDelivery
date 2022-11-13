package com.tringuyen.fooddelivery.services;

import com.tringuyen.fooddelivery.entity.FoodDetailEntity;
import com.tringuyen.fooddelivery.repository.FoodDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FoodDetailServiceImp implements FoodDetailService{
    @Autowired
    FoodDetailRepository foodDetailRepository;
    @Override
    public List<FoodDetailEntity> getAllFoodDetails() {
        return foodDetailRepository.findAll();
    }
}
