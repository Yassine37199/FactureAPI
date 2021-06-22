package com.example.facturesApi;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Facture {
    @Id
    @SequenceGenerator(name = "facture_sequence",
                        sequenceName = "facture_sequence",
                        allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
                    generator = "facture_sequence")
    private Long idFacture;
    private String typeFacture;
    private int telFac;
    private int GSMFac;
    private String refTT;
    private String Agence;
    private int periodicite;
    private Date startPeriode;
    private Date endPeriode;
    private int montant;
    private String email;
    private boolean suspendu;
    private boolean paye;



    public Facture(){
    }

    public Facture(String typeFacture,
                   int telFac,
                   int GSMFac,
                   String refTT,
                   String agence,
                   int periodicite,
                   Date startPeriode,
                   Date endPeriode,
                   int montant,
                   String email, boolean suspendu, boolean paye) {
        this.typeFacture = typeFacture;
        this.telFac = telFac;
        this.GSMFac = GSMFac;
        this.refTT = refTT;
        Agence = agence;
        this.periodicite = periodicite;
        this.startPeriode = startPeriode;
        this.endPeriode = endPeriode;
        this.montant = montant;
        this.email = email;
        this.suspendu = suspendu;
        this.paye = paye;
    }

    public Long getIdFacture() {
        return idFacture;
    }

    public void setIdFacture(Long idFacture) {
        this.idFacture = idFacture;
    }

    public String getTypeFacture() {
        return typeFacture;
    }

    public void setTypeFacture(String typeFacture) {
        this.typeFacture = typeFacture;
    }

    public int getTelFac() {
        return telFac;
    }

    public void setTelFac(int telFac) {
        this.telFac = telFac;
    }

    public int getGSMFac() {
        return GSMFac;
    }

    public void setGSMFac(int GSMFac) {
        this.GSMFac = GSMFac;
    }

    public String getRefTT() {
        return refTT;
    }

    public void setRefTT(String refTT) {
        this.refTT = refTT;
    }

    public String getAgence() {
        return Agence;
    }

    public void setAgence(String agence) {
        Agence = agence;
    }

    public int getPeriodicite() {
        return periodicite;
    }

    public void setPeriodicite(int periodicite) {
        this.periodicite = periodicite;
    }

    public Date getStartPeriode() {
        return startPeriode;
    }

    public void setStartPeriode(Date startPeriode) {
        this.startPeriode = startPeriode;
    }

    public Date getEndPeriode() {
        return endPeriode;
    }

    public void setEndPeriode(Date endPeriode) {
        this.endPeriode = endPeriode;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isSuspendu() {
        return suspendu;
    }

    public void setSuspendu(boolean suspendu) {
        this.suspendu = suspendu;
    }

    public boolean isPaye() {
        return paye;
    }

    public void setPaye(boolean paye) {
        this.paye = paye;
    }

    @Override
    public String toString() {
        return "Facture{" +
                "idFacture=" + idFacture +
                ", typeFacture='" + typeFacture + '\'' +
                ", telFac=" + telFac +
                ", GSMFac=" + GSMFac +
                ", refTT='" + refTT + '\'' +
                ", Agence='" + Agence + '\'' +
                ", periodicite=" + periodicite +
                ", startPeriode=" + startPeriode +
                ", endPeriode=" + endPeriode +
                ", montant=" + montant +
                ", email='" + email + '\'' +
                '}';
    }
}
