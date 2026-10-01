package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Order;
import com.app.repository.OrderRepositoryI;

@Service
public class OrderService {

    @Autowired
    OrderRepositoryI orderRepository;

    // Place Order
    public Order placeOrder(Order order) {

        if (order.getQuantity() <= 0) {
            throw new RuntimeException("Quantity must be greater than 0");
        }

        // Calculate total
        double total = order.getPrice() * order.getQuantity();

        order.setTotalAmount(total);

        // Initial status
        order.setStatus("PLACED");

        return orderRepository.save(order);
    }

    // Calculate Order Total
    public double calculateOrderTotal(int id) {

        Order order = orderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Order not found"));

        return order.getPrice() * order.getQuantity();
    }

    // Get All Orders
    public List<Order> getAllOrders() {

        return orderRepository.findAll();
    }

    // Get Order By ID
    public Order getOrderById(int id) {

        return orderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Order not found"));
    }

    // Update Order Status
    public Order updateOrderStatus(int id, String status) {

        Order order = getOrderById(id);

        order.setStatus(status);

        return orderRepository.save(order);
    }

    // Cancel Order
    public Order cancelOrder(int id) {

        Order order = getOrderById(id);

        if (order.getStatus().equals("PLACED")
                || order.getStatus().equals("CONFIRMED")) {

            order.setStatus("CANCELLED");

            return orderRepository.save(order);
        }

        throw new RuntimeException(
                "Order cannot be cancelled at this stage");
    }
}