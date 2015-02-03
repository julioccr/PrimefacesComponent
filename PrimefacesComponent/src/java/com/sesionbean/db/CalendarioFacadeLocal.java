/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sesionbean.db;

import com.entidad.jpa.db.Calendario;
import java.util.List;
import javax.ejb.Local;

/**
 * esta interfaces esta conectada las transacciones de mantenimientos de tb calendario
 * @author JCortorreal
 */
@Local
public interface CalendarioFacadeLocal {

    void create(Calendario calendario);

    void edit(Calendario calendario);

    void remove(Calendario calendario);

    Calendario find(Object id);

    List<Calendario> findAll();

    List<Calendario> findRange(int[] range);

    int count();
    
}
