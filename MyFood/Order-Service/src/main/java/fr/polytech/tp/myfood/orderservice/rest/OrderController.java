package fr.polytech.tp.myfood.orderservice.rest;

import fr.polytech.tp.myfood.orderservice.domain.OrderService;
import fr.polytech.tp.myfood.orderservice.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order-service/v1")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/create")
    public ResponseEntity<Order> createOrder(@RequestBody Order order) {
        Order createdOrder = orderService.createOrder(order);
        return new ResponseEntity<>(createdOrder, HttpStatus.CREATED);
    }

    @PutMapping("/cancel/{orderId}")
    public ResponseEntity<String> cancelOrder(@PathVariable Long orderId) {
        orderService.cancelOrder(orderId);
        return new ResponseEntity<>("Order canceled successfully", HttpStatus.OK);
    }

    @PutMapping("/revise/{orderId}")
    public ResponseEntity<Order> reviseOrder(@PathVariable Long orderId, @RequestBody Order order) {
        Order updatedOrder = orderService.updateOrder(orderId, order);
        return new ResponseEntity<>(updatedOrder, HttpStatus.OK);
    }
}
