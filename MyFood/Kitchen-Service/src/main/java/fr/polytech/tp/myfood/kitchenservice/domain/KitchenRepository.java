package fr.polytech.tp.myfood.kitchenservice.domain;

import fr.polytech.tp.myfood.kitchenservice.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KitchenRepository extends JpaRepository<Ticket, Long> {
}
