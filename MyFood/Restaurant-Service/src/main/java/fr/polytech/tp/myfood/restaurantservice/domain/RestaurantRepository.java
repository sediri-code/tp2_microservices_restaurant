package fr.polytech.tp.myfood.restaurantservice.domain;

import fr.polytech.tp.myfood.restaurantservice.entity.Adresse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestaurantRepository extends JpaRepository<Adresse, Long> {
    List<Adresse> findAllByVille(String ville);
}

