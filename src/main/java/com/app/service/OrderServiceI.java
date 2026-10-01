package com.app.service;

import java.util.List;

import com.app.model.Order;

public interface OrderServiceI {

    // Customer order place 
    Order placeOrder(Order order);

    // Order total calculate 
    double calculateOrderTotal(Long orderId);

    // Saare orders get 
    List<Order> getAllOrders();

    // Particular order get 
    Order getOrderById(Long orderId);

    // Order status update 
    Order updateOrderStatus(Long orderId, String status);

    // Eligible order cancel 
    Order cancelOrder(Long orderId);
}