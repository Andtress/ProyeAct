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
public class SeccionFragmento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @ManyToOne
    @JoinColumn(name="ID_Fragmento")
    private Fragmento idFragmento;
     
    @ManyToOne
    @JoinColumn(name="ID_Seccion")
    private Seccion idSeccion;
    
    private LocalDate created_at;
    
    public SeccionFragmento() {
    }

    public SeccionFragmento(long id, Fragmento idFragmento, Seccion idSeccion, LocalDate created_at) {
        this.id = id;
        this.idFragmento = idFragmento;
        this.idSeccion = idSeccion;
        this.created_at = created_at;
    }
    
    public long getId() {
        return id;
    }

    public Fragmento getidFragmento() {
        return idFragmento;
    }
    
    public void setidFragmento(Fragmento idFragmento) {
        this.idFragmento = idFragmento;
    }
    
    public Seccion getidSeccion() {
        return idSeccion;
    }
    
    public void setidSeccion(Seccion idSeccion) {
        this.idSeccion = idSeccion;
    }
    
    public LocalDate getcreated_at(){
        return created_at;
    }
            
            @Override
    public String toString() {
        return "Profesor{" +
                "id=" + id +
                ", ID Fragmento ='" + idFragmento + '\'' +
                ", ID Seccion ='" + idSeccion + '\'' +
                ", Created_at ='" + created_at + '\'' +
                '}';
    }
}
