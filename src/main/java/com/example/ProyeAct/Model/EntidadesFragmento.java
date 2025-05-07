/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ProyeAct.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDate;

/**
 *
 * @author user
 */
@Entity
public class EntidadesFragmento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @ManyToOne
    @JoinColumn(name="ID_Fragmento")
    private Fragmento idFragmento;
     
    @ManyToOne
    @JoinColumn(name="ID_Entidad")
    private Entidad idEntidad;
    
    private LocalDate created_at;
    
    public EntidadesFragmento() {
    }

    public EntidadesFragmento(long id, Fragmento idFragmento, Entidad idEntidad, LocalDate created_at) {
        this.id = id;
        this.idFragmento = idFragmento;
        this.idEntidad = idEntidad;
        this.created_at = created_at;
    }
    
    public long getId() {
        return id;
    }

    public Fragmento getidFragmento() {
        return idFragmento;
    }
    
    public void setidFragmento(Fragmento idFragmento){
        this.idFragmento = idFragmento;
    }
    
    public Entidad getidEntidad() {
        return idEntidad;
    }
    
    public void setidEntidad(Entidad idEntidad){
        this.idEntidad = idEntidad;
    }
    
    public LocalDate created_at(){
        return created_at;
    }
            @Override
    public String toString() {
        return "Profesor{" +
                "id=" + id +
                ", ID Fragmento ='" + idFragmento + '\'' +
                ", ID Entidad ='" + idEntidad + '\'' +
                ", Created at ='" + created_at + '\'' +
                '}';
    }
}
