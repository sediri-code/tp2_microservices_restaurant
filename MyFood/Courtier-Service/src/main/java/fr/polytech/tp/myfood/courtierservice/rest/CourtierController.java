package fr.polytech.tp.myfood.courtierservice.rest;

import fr.polytech.tp.myfood.courtierservice.domain.CourtierService;
import fr.polytech.tp.myfood.courtierservice.entity.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/courtier-service/v1")
public class CourtierController {

    @Autowired
    private CourtierService courtierService;

    @PutMapping("/update/{courtierId}")
    public ResponseEntity<String> updateLocation(@PathVariable String courtierId, @RequestBody Location location) {
        courtierService.updateLocation(courtierId, location);
        return new ResponseEntity<>("Location updated successfully", HttpStatus.OK);
    }
}
