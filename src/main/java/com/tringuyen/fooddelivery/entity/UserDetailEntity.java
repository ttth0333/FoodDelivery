package com.tringuyen.fooddelivery.entity;

import javax.persistence.*;

@Entity(name = "user_detail")
public class UserDetailEntity {
    @Id
    @Column(name = "id_user")
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @OneToOne
    @MapsId
    @JoinColumn(name = "id_user")
    private UserEntity user;

    public UserEntity getUserEntity() {
        return user;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.user = userEntity;
    }

    private String address;
    @Column(name = "mobile_phone")
    private String mobilePhone;
    private String state;
    private String city;
    private String street;



    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
