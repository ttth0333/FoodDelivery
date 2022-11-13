package com.tringuyen.fooddelivery.entity;

import com.tringuyen.fooddelivery.embedded.OrderStatusKey;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity(name = "order_status")
public class OrderStatusEntity {
    @EmbeddedId
    private OrderStatusKey orderStatusKey;

    public OrderStatusKey getOrderStatusKey() {
        return orderStatusKey;
    }

    public void setOrderStatusKey(OrderStatusKey orderStatusKey) {
        this.orderStatusKey = orderStatusKey;
    }

    @JsonIgnore
    @ManyToOne
    @MapsId("idOrder")
    @JoinColumn(name = "id_order")
    private OrderEntity orderEntity;

    public OrderEntity getOrderEntity() {
        return orderEntity;
    }

    public void setOrderEntity(OrderEntity orderEntity) {
        this.orderEntity = orderEntity;
    }

    @JsonIgnore
    @ManyToOne
    @MapsId("idStatus")
    @JoinColumn(name = "id_status")
    private StatusEntity statusEntity;
    public StatusEntity getStatusEntity() {
        return statusEntity;
    }

    public void setStatusEntity(StatusEntity statusEntity) {
        this.statusEntity = statusEntity;
    }

}
