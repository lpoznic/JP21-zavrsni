/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.zavrsnilp.model;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.Table;
import hr.edunova.zavrsnilp.model.Dobavljac;
import javax.persistence.ManyToOne;

/**
 *
 * @author lpozn
 */
@Entity
@Table(name = "artikl")
public class Artikl extends Entitet{
    
    private String opis;
    private BigDecimal cijena;
    @ManyToOne
    private Dobavljac dobavljac;

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public BigDecimal getCijena() {
        return cijena;
    }

    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }

    public Dobavljac getDobavljac() {
        return dobavljac;
    }

    public void setDobavljac(Dobavljac dobavljac) {
        this.dobavljac = dobavljac;
    }
    
}
