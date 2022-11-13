package com.tringuyen.fooddelivery.entity;

import com.tringuyen.fooddelivery.embedded.FoodOrderKey;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity(name = "food_order")
public class FoodOrderEntity {
    @EmbeddedId
    private FoodOrderKey foodOrderKey;

    public FoodOrderKey getFoodOrderKey() {
        return foodOrderKey;
    }

    public void setFoodOrderKey(FoodOrderKey foodOrderKey) {
        this.foodOrderKey = foodOrderKey;
    }
    @JsonIgnore
    @ManyToOne
    @MapsId("idFood")
    @JoinColumn(name = "id_food")
    private FoodEntity foodEntity;
    public FoodEntity getFoodEntity() {
        return foodEntity;
    }

    public void setFoodEntity(FoodEntity foodEntity) {
        this.foodEntity = foodEntity;
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

    @Column(name = "price")
    private float price;
    @Column(name = "quality")
    private int quality;
    @Column(name = "id_promo")
    private int id_promo;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public int getId_promo() {
        return id_promo;
    }

    public void setId_promo(int id_promo) {
        this.id_promo = id_promo;
    }
}
