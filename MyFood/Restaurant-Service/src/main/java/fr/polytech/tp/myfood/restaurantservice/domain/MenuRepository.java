package fr.polytech.tp.myfood.restaurantservice.domain;

import fr.polytech.tp.myfood.restaurantservice.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {
    List<Menu> findByNomContainingIgnoreCase(String keyword);
}

