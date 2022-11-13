package com.tringuyen.fooddelivery.entity;

import javax.persistence.*;

@Entity(name = "food_addon")
public class FoodAddOnsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "image")
    private String image;
    @Column(name = "price")
    private int price;
    @OneToOne
    @JoinColumn(name = "id_food",referencedColumnName = "id")
    private FoodEntity foodEntity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public FoodEntity getFood() {
        return foodEntity;
    }

    public void setFood(FoodEntity foodEntity) {
        this.foodEntity = foodEntity;
    }
}
