package fr.polytech.tp.myfood.kitchenservice.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private TicketState state;

    private Long restaurantId;
    private LocalDateTime preparingTime;
    private LocalDateTime pickedUpTime;
}
