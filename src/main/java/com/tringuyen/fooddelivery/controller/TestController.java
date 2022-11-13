package com.tringuyen.fooddelivery.controller;

import com.tringuyen.fooddelivery.entity.*;
import com.tringuyen.fooddelivery.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("")
public class TestController {

    @Autowired
    CategoryService categoryService;
    @Autowired
    FoodService foodService;
    @Autowired
    FoodAddOnsService foodAddOnsService;
    @Autowired
    FoodDetailService foodDetailService;
    @Autowired
    FoodOrderService foodOrderService;
    @Autowired
    FoodReviewService foodReviewService;
    @Autowired
    MaterialService materialService;
    @Autowired
    RestaurantService restaurantService;
    @Autowired
    RestaurantReviewService restaurantReviewService;
    @Autowired
    OrderService orderService;
    @Autowired
    StatusService statusService;

    @Autowired
    LoginService loginService;

    @GetMapping("/categories")
    public List<CategoryEntity> getCategories(){
        return categoryService.getAll();
    }

    @GetMapping("/foods")
    public List<FoodEntity> getAllFoods(){ return foodService.getAllFoods();}

    @GetMapping("/food-add-ons")
    public List<FoodAddOnsEntity> getAllFoodAddOns(){ return foodAddOnsService.getAllFoodAddOns();}

    @GetMapping("/food-details")
    public List<FoodDetailEntity> getAllFoodDetails(){ return foodDetailService.getAllFoodDetails();}

    @GetMapping("/food-orders")
    public List<FoodOrderEntity> getAllFoodOrders(){ return foodOrderService.getAllFoodOrders();}

    @GetMapping("/food-reviews")
    public  List<FoodReviewEntity> getAllFoodReviews(){return foodReviewService.getAllFoodReviews();}

    @GetMapping("/materials")
    public  List<MaterialEntity> getAllMaterials(){return materialService.getALlMaterials();}

    @GetMapping("/restaurants")
    public List<RestaurantEntity> getAllRestaurants(){ return restaurantService.getAllRestaurants();}

    @GetMapping("/restaurant-reviews")
    public List<RestaurantReviewEntity> getALlRestaurantReviews(){return  restaurantReviewService.getAllRestaurantReviews();}

    @GetMapping("/status")
    public List<StatusEntity> getALlStatus(){ return statusService.getALlStatus();}

    @GetMapping("/orders")
    public List<OrderEntity> getAllOrders(){
        return  orderService.getAllOrders();
    }
    @GetMapping("/users")
    public List<UserEntity> getAllUsers(){ return loginService.getAllUsers();}
    @GetMapping("/user-details")
    public List<UserDetailEntity> getAllUserDetails() {return loginService.getAllUserDetails();}
}
