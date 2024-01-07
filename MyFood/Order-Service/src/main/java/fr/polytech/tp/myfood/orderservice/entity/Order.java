package fr.polytech.tp.myfood.orderservice.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "orders")
@Setter
@Getter
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private OrderState state;
    private Long consumerId;
    private Long restaurantId;
    @OneToOne(cascade = CascadeType.ALL)
    private DeliveryInfo deliveryInfo;
}

