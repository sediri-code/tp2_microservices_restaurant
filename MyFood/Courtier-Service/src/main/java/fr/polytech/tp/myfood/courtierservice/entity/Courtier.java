package fr.polytech.tp.myfood.courtierservice.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Courtier {
    @Id
    private String cin;

    private String nom;
    private String telephone;
    private boolean disponible;
    @OneToOne(cascade = CascadeType.ALL)
    private Location location;
}

