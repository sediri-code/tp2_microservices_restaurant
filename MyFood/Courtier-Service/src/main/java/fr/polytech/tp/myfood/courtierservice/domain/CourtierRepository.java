package fr.polytech.tp.myfood.courtierservice.domain;

import fr.polytech.tp.myfood.courtierservice.entity.Courtier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourtierRepository extends JpaRepository<Courtier, String> {
}
