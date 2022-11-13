package com.tringuyen.fooddelivery.services;

import com.tringuyen.fooddelivery.entity.FoodAddOnsEntity;
import com.tringuyen.fooddelivery.repository.FoodAddOnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FoodAddOnsServiceImp implements FoodAddOnsService{

    @Autowired
    FoodAddOnRepository foodAddOnRepository;
    @Override
    public List<FoodAddOnsEntity> getAllFoodAddOns() {
        return foodAddOnRepository.findAll();
    }
}
