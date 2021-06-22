package com.example.facturesApi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FactureRepository extends JpaRepository<Facture , Long> {

    @Query("SELECT f FROM Facture f " +
    "WHERE f.refTT = ?1 AND f.paye = false")
    List<Facture> getFactureImpayeByRefTT(String refTT);

    @Query("SELECT f FROM Facture f " +
            "WHERE f.paye = false")
    List<Facture> getFactureImpaye();

    @Query("SELECT f FROM Facture f " +
            "WHERE f.refTT = ?1 AND f.paye = true ORDER BY f.idFacture")
    List<Facture>  getFacturePaye(String refTT);

    @Query("SELECT f FROM Facture f " +
            "WHERE f.refTT = ?1 ORDER BY f.idFacture")
    List<Facture>  getFactureByRefTT(String refTT);



}
