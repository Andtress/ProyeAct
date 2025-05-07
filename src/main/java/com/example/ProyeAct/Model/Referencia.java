/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ProyeAct.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;

/**
 *
 * @author user
 */
@Entity
public class Referencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String fuente;
    private LocalDate created_at;
    
    public Referencia() {
    }

    public Referencia(long id, String fuente, LocalDate created_at) {
        this.id = id;
        this.fuente = fuente;
        this.created_at = created_at;
    }
    
    public long getId() {
        return id;
    }

    public String getfuente() {
        return fuente;
    }

    public void setfuente(String fuente) {
        this.fuente = fuente;
    }
    
    public LocalDate getcreated_at(){
        return created_at;
    }
    
            @Override
    public String toString() {
        return "Profesor{" +
                "id=" + id +
                ", nombre de la fuente='" + fuente + '\'' +
                '}';
    }
}
