/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sesionbean.db;

import com.entidad.jpa.db.Calendario;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author JCortorreal
 */
@Stateless
public class CalendarioFacade extends AbstractFacade<Calendario> implements CalendarioFacadeLocal {
    @PersistenceContext(unitName = "PrimefacesComponentPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CalendarioFacade() {
        super(Calendario.class);
    }
    
}
