package fr.polytech.tp.myfood.kitchenservice.rest;

import fr.polytech.tp.myfood.kitchenservice.domain.KitchenService;
import fr.polytech.tp.myfood.kitchenservice.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kitchen-service/v1")
public class KitchenController {

    @Autowired
    private KitchenService kitchenService;

    @PostMapping("/create")
    public ResponseEntity<Ticket> createTicket(@RequestBody Ticket ticket) {
        Ticket createdTicket = kitchenService.createTicket(ticket);
        return new ResponseEntity<>(createdTicket, HttpStatus.CREATED);
    }

    @PutMapping("/accept/{ticketId}")
    public ResponseEntity<String> acceptTicket(@PathVariable Long ticketId) {
        kitchenService.acceptTicket(ticketId);
        return new ResponseEntity<>("Ticket accepted successfully", HttpStatus.OK);
    }

    @PutMapping("/ready/{ticketId}")
    public ResponseEntity<String> readyForPickUp(@PathVariable Long ticketId) {
        kitchenService.readyForPickUp(ticketId);
        return new ResponseEntity<>("Ticket is ready for pick up", HttpStatus.OK);
    }
}
