/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.zavrsnilp.controller;

import hr.edunova.zavrsnilp.model.Dobavljac;
import hr.edunova.zavrsnilp.util.ObracunException;
import hr.edunova.zavrsnilp.util.Pomocno;


/**
 *
 * @author Polaznik
 */
public abstract class ObradaDobavljac<T extends Dobavljac> extends Obrada<T>{
    
    public ObradaDobavljac(T entitet) {
        super(entitet);
    }  

    public ObradaDobavljac() {
        super();
    }
    
    

    @Override
    protected void kontrolaCreate() throws ObracunException {
        kontrolaOib();
        kontrolaEmail();
    }

    @Override
    protected void kontrolaUpdate() throws ObracunException {
        
    }

    @Override
    protected void kontrolaDelete() throws ObracunException {
        
    }

    private void kontrolaOib() throws ObracunException{
        if(!Pomocno.isOibValjan(entitet.getOib())){
            throw new ObracunException("OIB nije valjan");
        }
    }

    protected void kontrolaEmail()  throws ObracunException{
       
    }

    
    
}
    


