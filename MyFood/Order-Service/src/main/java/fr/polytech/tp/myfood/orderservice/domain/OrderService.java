package fr.polytech.tp.myfood.orderservice.domain;

import fr.polytech.tp.myfood.orderservice.entity.Order;
import fr.polytech.tp.myfood.orderservice.entity.OrderState;
import fr.polytech.tp.myfood.orderservice.exception.OrderNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order createOrder(Order order) {
        order.setState(OrderState.CREATED);
        return orderRepository.save(order);
    }

    public void cancelOrder(Long orderId) {
        Order order = orderRepository.findById(orderId)
                .orElseThrow(() -> new OrderNotFoundException("Order not found with id: " + orderId));

        order.setState(OrderState.CANCELED);
        orderRepository.save(order);
    }

    public Order updateOrder(Long orderId, Order updatedOrder) {
        Order order = orderRepository.findById(orderId)
                .orElseThrow(() -> new OrderNotFoundException("Order not found with id: " + orderId));

        order.setState(updatedOrder.getState());
        order.setConsumerId(updatedOrder.getConsumerId());
        order.setRestaurantId(updatedOrder.getRestaurantId());
        order.setDeliveryInfo(updatedOrder.getDeliveryInfo());

        return orderRepository.save(order);
    }
}
