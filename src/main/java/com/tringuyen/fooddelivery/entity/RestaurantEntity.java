package com.tringuyen.fooddelivery.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "restaurant")
public class RestaurantEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String image;
    private String name;

    @OneToMany(mappedBy = "restaurantEntity")
    private Set<RestaurantReviewEntity> restaurantReviewEntities;

    public Set<RestaurantReviewEntity> getRestaurantReviewEntities() {
        return restaurantReviewEntities;
    }

    public void setRestaurantReviewEntities(Set<RestaurantReviewEntity> restaurantReviewEntities) {
        this.restaurantReviewEntities = restaurantReviewEntities;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
