/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ProyeAct.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.sql.Timestamp;
import java.time.LocalDate;

/**
 *
 * @author user
 */
@Entity
public class Planteamiento {
        
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDate created_at;
    
    public Planteamiento() {
    }

    public Planteamiento(long id,LocalDate created_at) {
        this.id = id;
        this.created_at = created_at;
    }
    
    public long getId() {
        return id;
    }

    public LocalDate getcreated_at() {
        return created_at;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "id=" + id +
                ", created_at='" + created_at + '\'' +
                '}';
    }
}
