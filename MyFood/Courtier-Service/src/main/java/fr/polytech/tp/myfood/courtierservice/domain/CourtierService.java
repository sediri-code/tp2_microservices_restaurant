package fr.polytech.tp.myfood.courtierservice.domain;

import fr.polytech.tp.myfood.courtierservice.entity.Courtier;
import fr.polytech.tp.myfood.courtierservice.entity.Location;
import fr.polytech.tp.myfood.courtierservice.exception.CourtierNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CourtierService {

    @Autowired
    private CourtierRepository courtierRepository;

    public void updateLocation(String courtierId, Location location) {
        Courtier courtier = courtierRepository.findById(courtierId)
                .orElseThrow(() -> new CourtierNotFoundException("Courtier not found with id: " + courtierId));

        Location existingLocation = Optional.ofNullable(courtier.getLocation())
                .orElse(new Location());

        existingLocation.setLongitude(location.getLongitude());
        existingLocation.setLatitude(location.getLatitude());

        courtier.setLocation(existingLocation);

        courtierRepository.save(courtier);
    }
}
