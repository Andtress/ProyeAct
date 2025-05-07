/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ProyeAct.Model;

import jakarta.persistence.*;
import java.sql.Timestamp;

/**
 *
 * @author user
 */
@Entity
public class FechaD {
    
        
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Timestamp fecha;
    
    public FechaD() {
    }

    public FechaD(long id, Timestamp fecha) {
        this.id = id;
        this.fecha = fecha;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }
    
            @Override
    public String toString() {
        return "Profesor{" +
                "id=" + id +
                ", fecha='" + fecha + '\'' +
                '}';
    }
}
