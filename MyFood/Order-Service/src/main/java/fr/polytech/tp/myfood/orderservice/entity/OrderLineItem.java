package fr.polytech.tp.myfood.orderservice.entity;

import jakarta.persistence.*;

@Entity
public class OrderLineItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int quantity;
    private Long idMenu;
    private Long idOrder;

}

