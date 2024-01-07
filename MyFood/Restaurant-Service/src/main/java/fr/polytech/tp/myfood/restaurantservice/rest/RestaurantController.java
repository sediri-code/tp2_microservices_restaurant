package fr.polytech.tp.myfood.restaurantservice.rest;

import fr.polytech.tp.myfood.restaurantservice.domain.RestaurantService;
import fr.polytech.tp.myfood.restaurantservice.entity.Adresse;
import fr.polytech.tp.myfood.restaurantservice.entity.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurant-service/v1")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping("/findAvailable/{ville}")
    public ResponseEntity<List<Adresse>> findAvailableRestaurants(@PathVariable String ville) {
        List<Adresse> restaurants = restaurantService.findAvailableRestaurants(ville);
        return new ResponseEntity<>(restaurants, HttpStatus.OK);
    }

    @GetMapping("/menus/find/{keyword}")
    public ResponseEntity<List<Menu>> findRestaurantMenu(@PathVariable String keyword) {
        List<Menu> menus = restaurantService.findRestaurantMenu(keyword);
        return new ResponseEntity<>(menus, HttpStatus.OK);
    }
}
