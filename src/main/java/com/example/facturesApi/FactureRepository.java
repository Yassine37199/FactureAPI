package com.example.facturesApi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FactureRepository extends JpaRepository<Facture , Long> {

    @Query("SELECT f FROM Facture f " +
    "WHERE f.refTT = ?1 AND f.suspendu = true")
    Facture getFactureSuspendu(String refTT);

}
