package com.example.facturesApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Factapi/v1/")
public class FactureController {

    private final FactureRepository factureRepository;

    @Autowired
    public FactureController(FactureRepository factureRepository) {
        this.factureRepository = factureRepository;
    }

    @GetMapping("/{refTT}")
    public ResponseEntity<Facture> getFactureSuspendu(@PathVariable("refTT") String refTT){
        Facture facture = this.factureRepository.getFactureSuspendu(refTT);
        return new ResponseEntity<>(facture , HttpStatus.OK);
    }


}
