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
public class Asunto {
        
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombreAsunto;
    private LocalDate created_at;
    
    public Asunto() {
    }

    public Asunto(long id, String nombreAsunto, LocalDate created_at) {
        this.id = id;
        this.nombreAsunto = nombreAsunto;
        this.created_at = created_at;
    }
    
    public long getId() {
        return id;
    }

    public String getAsunto() {
        return nombreAsunto;
    }
    
    public LocalDate getCreated_at() {
        return created_at;
    }
    
            @Override
    public String toString() {
        return "Profesor{" +
                "id=" + id +
                ", Nombre del asunto='" + nombreAsunto + '\'' +
                '}';
    }
}
