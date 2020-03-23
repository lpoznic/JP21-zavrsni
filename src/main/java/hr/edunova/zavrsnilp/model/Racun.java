 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.zavrsnilp.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author lpozn
 */
@Entity
@Table(name = "racun")
public class Racun extends Entitet{
    
    private Date datum;
    @OneToOne
    private Kupac kupac;
    private int BrojRadnika;
    @ManyToOne
    private Radnik radnik;
    private int komada;
    private BigDecimal cijena;

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Kupac getKupac() {
        return kupac;
    }

    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }

    public int getBrojRadnika() {
        return BrojRadnika;
    }

    public void setBrojRadnika(int BrojRadnika) {
        this.BrojRadnika = BrojRadnika;
    }

    public Radnik getRadnik() {
        return radnik;
    }

    public void setRadnik(Radnik radnik) {
        this.radnik = radnik;
    }

    public int getKomada() {
        return komada;
    }

    public void setKomada(int komada) {
        this.komada = komada;
    }

    public BigDecimal getCijena() {
        return cijena;
    }

    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }
    
    
}
