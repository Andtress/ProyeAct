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
public class Localidad {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @ManyToOne
    @JoinColumn(name="id_Municipio")
    private Municipio id_Municipio;
    private String nombreLocalidad;
    private LocalDate created_at;
    
    public Localidad() {
    }

    public Localidad(long id, String nombreLocalidad, LocalDate created_at) {
        this.id = id;
        this.nombreLocalidad = nombreLocalidad;
        this.created_at = created_at;
    }
    
    public long getId() {
        return id;
    }

    public String getnombreLocalidad() {
        return nombreLocalidad;
    }

    public void setnombreLocalidad(String nombreLocalidad) {
        this.nombreLocalidad = nombreLocalidad;
    }
    
    public LocalDate getcreated_at() {
        return created_at;
    }

    
            @Override
    public String toString() {
        return "Pais{" +
                "id=" + id +
                ", nombre de la localidad= '" + nombreLocalidad + '\'' +
                ", created_at='" + created_at + '\'' +
                '}';
    }
}
