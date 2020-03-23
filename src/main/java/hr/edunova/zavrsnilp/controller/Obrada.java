/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.zavrsnilp.controller;

import hr.edunova.zavrsnilp.util.ObracunException;
import hr.edunova.zavrsnilp.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Profesor
 */
public abstract class Obrada<T> {
    
    protected T entitet;
    protected Session session;
    protected abstract void kontrolaCreate() throws ObracunException;
    protected abstract void kontrolaUpdate() throws ObracunException;
    protected abstract void kontrolaDelete() throws ObracunException;
    public abstract List<T> getPodaci();
    protected abstract void nakonSpremanja() throws ObracunException;
    
    public Obrada(T entitet){
        this();
        this.entitet=entitet;
    }

    public Obrada() {
        session = HibernateUtil.getSessionFactory().openSession();
    }
    
    
    
    public T create() throws ObracunException{
        kontrolaCreate();
        save();
        nakonSpremanja();
        return entitet;
    }
    
    public void createAll(List<T> lista) throws ObracunException{
    
        session.beginTransaction();
        for(T sl : lista){
            this.entitet=sl;
            kontrolaCreate();
            session.save(sl);
            nakonSpremanja();
        }
        session.getTransaction().commit();
        
        
    }
    
    public T update() throws ObracunException{
        kontrolaUpdate();
        save();
        nakonSpremanja();
        return entitet;
    }
    
    public boolean delete() throws ObracunException{
        kontrolaDelete();
        session.beginTransaction();
        session.delete(entitet);
        session.getTransaction().commit();
        //provjeriti da li je obrisano. Vjerojatno će entitet.getSifra biti null
        return true;
    }
    
    private void save(){
        session.beginTransaction();
        session.save(entitet);
        session.getTransaction().commit();
    }
    
}
