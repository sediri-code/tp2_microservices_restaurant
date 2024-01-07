package fr.polytech.tp.myfood.courtierservice.exception;

public class CourtierNotFoundException extends RuntimeException {

    public CourtierNotFoundException(String message) {
        super(message);
    }
}
