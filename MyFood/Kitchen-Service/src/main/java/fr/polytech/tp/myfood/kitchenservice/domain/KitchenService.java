package fr.polytech.tp.myfood.kitchenservice.domain;

import fr.polytech.tp.myfood.kitchenservice.entity.Ticket;
import fr.polytech.tp.myfood.kitchenservice.entity.TicketState;
import fr.polytech.tp.myfood.kitchenservice.exception.TicketNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KitchenService {

    @Autowired
    private KitchenRepository kitchenRepository;

    public Ticket createTicket(Ticket ticket) {
        ticket.setState(TicketState.CREATED);
        return kitchenRepository.save(ticket);
    }

    public void acceptTicket(Long ticketId) {
        Ticket ticket = kitchenRepository.findById(ticketId)
                .orElseThrow(() -> new TicketNotFoundException("Ticket not found with id: " + ticketId));
        ticket.setState(TicketState.ACCEPTED);
        kitchenRepository.save(ticket);
    }

    public void readyForPickUp(Long ticketId) {
        Ticket ticket = kitchenRepository.findById(ticketId)
                .orElseThrow(() -> new TicketNotFoundException("Ticket not found with id: " + ticketId));
        ticket.setState(TicketState.READY);
        kitchenRepository.save(ticket);
    }
}
