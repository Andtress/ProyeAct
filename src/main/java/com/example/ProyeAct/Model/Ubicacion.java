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
public class Ubicacion {
        
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    
    public Ubicacion() {
    }

    public Ubicacion(long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    public long getId() {
        return id;
    }
    
    public String getNombre(){
        return nombre;  
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
            @Override
    public String toString() {
        return "Profesor{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
