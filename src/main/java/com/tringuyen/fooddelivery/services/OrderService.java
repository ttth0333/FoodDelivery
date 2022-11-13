package com.tringuyen.fooddelivery.services;

import com.tringuyen.fooddelivery.entity.OrderEntity;

import java.util.List;

public interface OrderService {
    public List<OrderEntity> getAllOrders();
}
