package com.tringuyen.fooddelivery.services;

import com.tringuyen.fooddelivery.entity.FoodOrderEntity;
import com.tringuyen.fooddelivery.repository.FoodOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FoodOrderServiceImp implements FoodOrderService{

    @Autowired
    FoodOrderRepository foodOrderRepository;
    @Override
    public List<FoodOrderEntity> getAllFoodOrders() {
        return foodOrderRepository.findAll();
    }
}
