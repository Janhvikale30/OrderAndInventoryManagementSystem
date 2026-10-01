package com.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.app.model.Order;
import com.app.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    // Customer Place Order
    @PostMapping("/place")
    public Order placeOrder(@RequestBody Order order) {
        return orderService.placeOrder(order);
    }

    // Calculate Order Total
    @GetMapping("/{id}/total")
    public double calculateOrderTotal(@PathVariable int id) {
        return orderService.calculateOrderTotal(id);
    }

    // Get All Orders
    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    // Get Order By ID
    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable int id) {
        return orderService.getOrderById(id);
    }

    // Update Order Status
    @PutMapping("/{id}/status")
    public Order updateOrderStatus(
            @PathVariable int id,
            @RequestParam String status) {

        return orderService.updateOrderStatus(id, status);
    }

    // Cancel Order
    @PutMapping("/{id}/cancel")
    public Order cancelOrder(@PathVariable int id) {
        return orderService.cancelOrder(id);
    }
}