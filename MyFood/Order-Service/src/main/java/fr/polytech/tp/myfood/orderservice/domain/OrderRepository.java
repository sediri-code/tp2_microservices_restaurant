package fr.polytech.tp.myfood.orderservice.domain;

import fr.polytech.tp.myfood.orderservice.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}