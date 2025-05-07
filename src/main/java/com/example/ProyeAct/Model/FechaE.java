/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ProyeAct.Model;

import jakarta.persistence.*;
import java.time.LocalDate;

/**
 *
 * @author user
 */
@Entity
public class FechaE {
    
        
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDate fecha;
    
    public FechaE() {
    }

    public FechaE(long id, LocalDate fecha) {
        this.id = id;
        this.fecha = fecha;
    }
    
    public long getId() {
        return id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
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
