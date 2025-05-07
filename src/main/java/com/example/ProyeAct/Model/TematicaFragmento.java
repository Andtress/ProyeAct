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
public class TematicaFragmento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @ManyToOne
    @JoinColumn(name="ID_Fragmento")
    private Fragmento idFragmento;
     
    @ManyToOne
    @JoinColumn(name="ID_Tematica")
    private Tematica idTematica;
    
    private LocalDate created_at;
    
    public TematicaFragmento() {
    }

    public TematicaFragmento (long id, Fragmento idFragmento, Tematica idTematica, LocalDate created_at) {
        this.id = id;
        this.idFragmento = idFragmento;
        this.idTematica = idTematica;
        this.created_at = created_at;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public Fragmento getidFragmento() {
        return idFragmento;
    }
    
    public void setidFragmento(Fragmento idFragmento){
        this.idFragmento = idFragmento;
    }
    
    public Tematica getidTematica() {
        return idTematica;
    }
    
    public void setidTematica(Tematica idTematica){
        this.idTematica = idTematica;
    }
    
    public LocalDate created_at(){
        return created_at;
    }
    
            @Override
    public String toString() {
        return "Profesor{" +
                "id=" + id +
                ", ID Fragmento ='" + idFragmento + '\'' +
                ", ID Tematica ='" + idTematica + '\'' +
                ", Created_at ='" + created_at + '\'' +
                '}';
    }
}
