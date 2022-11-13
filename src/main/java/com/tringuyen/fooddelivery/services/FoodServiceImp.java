package com.tringuyen.fooddelivery.services;

import com.tringuyen.fooddelivery.entity.FoodEntity;
import com.tringuyen.fooddelivery.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FoodServiceImp implements FoodService{
    @Autowired
    FoodRepository foodRepository;
    @Override
    public List<FoodEntity> getAllFoods() {
        return foodRepository.findAll();
    }
}
