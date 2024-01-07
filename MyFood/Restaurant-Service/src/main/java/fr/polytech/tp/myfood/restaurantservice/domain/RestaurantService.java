package fr.polytech.tp.myfood.restaurantservice.domain;

import fr.polytech.tp.myfood.restaurantservice.entity.Adresse;
import fr.polytech.tp.myfood.restaurantservice.entity.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    @Autowired
    private MenuRepository menuRepository;

    public List<Adresse> findAvailableRestaurants(String ville) {
        return restaurantRepository.findAllByVille(ville);
    }

    public List<Menu> findRestaurantMenu(String keyword) {
        return menuRepository.findByNomContainingIgnoreCase(keyword);
    }
}
