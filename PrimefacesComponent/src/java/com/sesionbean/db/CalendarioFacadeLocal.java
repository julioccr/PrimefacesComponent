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

    void create(Calendario calendario); //addEvent

    void edit(Calendario calendario); //updateEvent

    void remove(Calendario calendario); //deleteEvent

    Calendario find(Object id); //ScheduleEvent : Seleccion por item event

    List<Calendario> findAll(); //getEvents

    List<Calendario> findRange(int[] range); // buscar por rango de numeros

    int count(); //getEventCount
    
}
