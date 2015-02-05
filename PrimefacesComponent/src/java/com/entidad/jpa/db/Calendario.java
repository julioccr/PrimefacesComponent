/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entidad.jpa.db;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JCortorreal
 */
@Entity
@Table(name = "calendario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Calendario.findAll", query = "SELECT c FROM Calendario c"),
    @NamedQuery(name = "Calendario.findById", query = "SELECT c FROM Calendario c WHERE c.id = :id"),
    @NamedQuery(name = "Calendario.findByEvento", query = "SELECT c FROM Calendario c WHERE c.evento = :evento"),
    @NamedQuery(name = "Calendario.findByDescripcion", query = "SELECT c FROM Calendario c WHERE c.descripcion = :descripcion"),
    @NamedQuery(name = "Calendario.findByFechaInicio", query = "SELECT c FROM Calendario c WHERE c.fechaInicio = :fechaInicio"),
    @NamedQuery(name = "Calendario.findByHoraInicio", query = "SELECT c FROM Calendario c WHERE c.horaInicio = :horaInicio"),
    @NamedQuery(name = "Calendario.findByFechaFinal", query = "SELECT c FROM Calendario c WHERE c.fechaFinal = :fechaFinal"),
    @NamedQuery(name = "Calendario.findByHoraFinal", query = "SELECT c FROM Calendario c WHERE c.horaFinal = :horaFinal"),
    @NamedQuery(name = "Calendario.findByRepeticion", query = "SELECT c FROM Calendario c WHERE c.repeticion = :repeticion")})
public class Calendario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = true)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "EVENTO")
    private String evento;
    @Size(max = 255)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Past
    @Column(name = "FECHA_INICIO")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Column(name = "HORA_INICIO")
    @Temporal(TemporalType.DATE)
    private Date horaInicio;
    @Basic(optional = false)
    @NotNull
    @Future
    @Column(name = "FECHA_FINAL")
    @Temporal(TemporalType.DATE)
    private Date fechaFinal;
    @Column(name = "HORA_FINAL")
    @Temporal(TemporalType.DATE)
    private Date horaFinal;
    @Column(name = "REPETICION")
    private Integer repeticion;

    public Calendario() {
    }

    public Calendario(Integer id) {
        this.id = id;
    }

    public Calendario(Integer id, String evento, Date fechaInicio, Date fechaFinal) {
        this.id = id;
        this.evento = evento;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }
    
    public Calendario (String evento, String Descripcion, Date fechaInicio, Date fechaFinal){
    this.evento = evento;
    this.descripcion = Descripcion;
    this.fechaInicio = fechaInicio;
    this.fechaFinal = fechaFinal;
    
    }

     public Calendario (String evento, Date fechaInicio, Date fechaFinal){
    this.evento = evento;
    this.fechaInicio = fechaInicio;
    this.fechaFinal = fechaFinal;
    
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public Date getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(Date horaFinal) {
        this.horaFinal = horaFinal;
    }

    public Integer getRepeticion() {
        return repeticion;
    }

    public void setRepeticion(Integer repeticion) {
        this.repeticion = repeticion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Calendario)) {
            return false;
        }
        Calendario other = (Calendario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.controller.Calendario[ id=" + id + " ]";
    }
    
}
