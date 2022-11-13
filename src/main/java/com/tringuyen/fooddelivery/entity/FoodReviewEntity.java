package com.tringuyen.fooddelivery.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity(name = "food_review")
public class FoodReviewEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_food")
    private FoodEntity foodEntity;

    public FoodEntity getFood() {
        return foodEntity;
    }

    public void setFood(FoodEntity foodEntity) {
        this.foodEntity = foodEntity;
    }
    @ManyToOne
    @JoinColumn(name = "id_user")
    private UserEntity userEntity;

    public UserEntity getUser() {
        return userEntity;
    }

    public void setUser(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    @Column(name = "content")
    private String content;
    @Column(name = "create_date")
    private String createDate;
    @Column(name = "rate")
    private float rate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }
}
