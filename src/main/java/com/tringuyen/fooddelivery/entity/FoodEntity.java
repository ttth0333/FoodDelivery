package com.tringuyen.fooddelivery.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "food")
public class FoodEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "image")
    private String image;

    @Column(name = "price")
    private int price;

    @ManyToOne
    @JoinColumn(name = "id_category")
    private CategoryEntity categoryEntity;
    public CategoryEntity getCategoryEntity() {
        return categoryEntity;
    }

    public void setCategoryEntity(CategoryEntity categoryEntity) {
        this.categoryEntity = categoryEntity;
    }

    @ManyToOne
    @JoinColumn(name = "id_restaurant")
    private RestaurantEntity restaurantEntity;
    public RestaurantEntity getRestaurantEntity() {
        return restaurantEntity;
    }

    public void setRestaurantEntity(RestaurantEntity restaurantEntity) {
        this.restaurantEntity = restaurantEntity;
    }
    @JsonIgnore
    @OneToOne(mappedBy = "foodEntity")
    private FoodDetailEntity foodDetailEntity;

    public FoodDetailEntity getFoodDetailEntity() {
        return foodDetailEntity;
    }

    public void setFoodDetailEntity(FoodDetailEntity foodDetailEntity) {
        this.foodDetailEntity = foodDetailEntity;
    }

    //    @OneToMany(mappedBy = "foodEntity")
//    private Set<FoodReview> foodReviews;
//
//    public Set<FoodReview> getFoodReviews() {
//        return foodReviews;
//    }
//
//    public void setFoodReviews(Set<FoodReview> foodReviews) {
//        this.foodReviews = foodReviews;
//    }

    @OneToMany(mappedBy = "foodEntity")
    private Set<FoodOrderEntity> foodOrderEntities;

    public Set<FoodOrderEntity> getFoodOrderEntities() {
        return foodOrderEntities;
    }

    public void setFoodOrderEntities(Set<FoodOrderEntity> foodOrderEntities) {
        this.foodOrderEntities = foodOrderEntities;
    }

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


}
