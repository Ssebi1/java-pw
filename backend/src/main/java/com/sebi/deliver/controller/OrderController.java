package com.sebi.deliver.controller;

import com.sebi.deliver.model.Order;
import com.sebi.deliver.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/orders")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("{id}")
    public List<Order> getUserOrders(@PathVariable Long id) {
        return orderService.getUserOrders(id);
    }

    @PostMapping("{id}")
    public Order addOrder(@PathVariable Long id, @RequestBody Order order) {
        return orderService.addOrder(id, order);
    }
}
