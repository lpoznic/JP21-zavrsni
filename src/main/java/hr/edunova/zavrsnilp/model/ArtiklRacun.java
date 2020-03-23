/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.zavrsnilp.model;

import javax.persistence.OneToMany;

/**
 *
 * @author lpozn
 */
public class ArtiklRacun {
    @OneToMany
    private Racun racun;
    @OneToMany
    private Artikl artikl;

    public Racun getRacun() {
        return racun;
    }

    public void setRacun(Racun racun) {
        this.racun = racun;
    }

    public Artikl getArtikl() {
        return artikl;
    }

    public void setArtikl(Artikl artikl) {
        this.artikl = artikl;
    }
    
    
    
}
