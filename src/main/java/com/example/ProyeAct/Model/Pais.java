/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ProyeAct.Model;

import jakarta.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDate;

/**
 *
 * @author user
 */
@Entity
public class Pais {
        
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombrePais;
    private LocalDate created_at;
    
    public Pais() {
    }

    public Pais(long id, String nombrePais, LocalDate created_at) {
        this.id = id;
        this.nombrePais = nombrePais;
        this.created_at = created_at;
    }
    
    public long getId() {
        return id;
    }

    public String getnombrePais() {
        return nombrePais;
    }

    public void setnombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }
    
    public LocalDate getcreated_at() {
        return created_at;
    }

    
            @Override
    public String toString() {
        return "Pais{" +
                "id=" + id +
                ", nombrePais='" + nombrePais + '\'' +
                ", created_at='" + created_at + '\'' +
                '}';
    }
}
