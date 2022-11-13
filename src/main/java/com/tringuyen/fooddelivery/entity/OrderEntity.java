package com.tringuyen.fooddelivery.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "t_order")
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne
    @JoinColumn(name = "id_user")
    private UserEntity userEntity;

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    @OneToMany(mappedBy = "orderEntity")
    private Set<FoodOrderEntity> foodOrderEntities;

    public Set<FoodOrderEntity> getFoodOrderEntities() {
        return foodOrderEntities;
    }

    public void setFoodOrderEntities(Set<FoodOrderEntity> foodOrderEntities) {
        this.foodOrderEntities = foodOrderEntities;
    }

    @OneToMany(mappedBy = "orderEntity")
    private Set<OrderStatusEntity> orderStatusEntities;

    public Set<OrderStatusEntity> getOrderStatusEntities() {
        return orderStatusEntities;
    }

    public void setOrderStatusEntities(Set<OrderStatusEntity> orderStatusEntities) {
        this.orderStatusEntities = orderStatusEntities;
    }

    @Column(name = "estimate_ship")
    private String estimateShip;
    @Column(name = "deliver_address")
    private String deliverAddress;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getEstimateShip() {
        return estimateShip;
    }

    public void setEstimateShip(String estimateShip) {
        this.estimateShip = estimateShip;
    }

    public String getDeliverAddress() {
        return deliverAddress;
    }

    public void setDeliverAddress(String deliverAddress) {
        this.deliverAddress = deliverAddress;
    }
}
