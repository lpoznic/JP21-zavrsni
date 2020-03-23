/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.zavrsnilp.controller;

import hr.edunova.zavrsnilp.model.Racun;
import hr.edunova.zavrsnilp.util.ObracunException;
import java.util.List;

/**
 *
 * @author lpozn
 */
public class ObradaRacun extends Obrada<Racun>{

    public ObradaRacun(Racun entitet) {
        super(entitet);
    }

    public ObradaRacun() {
        super();
    }
    
    @Override
    public Racun create() throws ObracunException{
        kontrolaCreate();
        save();
        nakonSpremanja();
        return entitet;
    }
    
    @Override
    public Racun update() throws ObracunException{
        kontrolaUpdate();
        save();
        nakonSpremanja();
        return entitet;
    }
    
     private void save() {
        session.beginTransaction();
        session.save(entitet);
         entitet.getRadnici().forEach((c)->{
            session.save(c);
        });
        session.getTransaction().commit();
    }
    
    
    @Override
    protected void kontrolaCreate() throws ObracunException {
   
    }

    @Override
    protected void kontrolaUpdate() throws ObracunException {
        
    }

    @Override
    protected void kontrolaDelete() throws ObracunException {
       
    }
    
    @Override
    public List<Racun> getPodaci() {
         return session.createQuery("from Racun").list();
    }


    @Override
    protected void nakonSpremanja() throws ObracunException {
       
    }


    
    
    
    
    
}
