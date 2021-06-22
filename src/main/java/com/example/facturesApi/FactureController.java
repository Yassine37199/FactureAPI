package com.example.facturesApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("facture/")
public class FactureController {

    private final FactureRepository factureRepository;

    @Autowired
    public FactureController(FactureRepository factureRepository) {
        this.factureRepository = factureRepository;
    }

    @GetMapping("get/impaye/{refTT}")
    public ResponseEntity<List<Facture>> getFactureImpayeByRefTT(@PathVariable("refTT") String refTT){
        List<Facture> factures = this.factureRepository.getFactureImpayeByRefTT(refTT);
        return new ResponseEntity<>(factures , HttpStatus.OK);
    }

    @GetMapping("get/impaye")
    public ResponseEntity<List<Facture>> getFactureImpaye(){
        List<Facture> factures = this.factureRepository.getFactureImpaye();
        return new ResponseEntity<>(factures , HttpStatus.OK);
    }

    @GetMapping("get/{refTT}")
    public ResponseEntity<List<Facture>> getFactureByRefTT(@PathVariable("refTT") String refTT){
        List<Facture> factures = this.factureRepository.getFactureByRefTT(refTT);
        return new ResponseEntity<>(factures , HttpStatus.OK);
    }

    @GetMapping("get/paye/{refTT}")
    public ResponseEntity<List<Facture>> getFacturePaye(@PathVariable("refTT") String refTT){
        List<Facture> factures = this.factureRepository.getFacturePaye(refTT);
        return new ResponseEntity<>(factures , HttpStatus.OK);
    }


}
