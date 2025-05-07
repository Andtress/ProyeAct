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
public class Anotaciones {
        
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String anotaciones;
    private LocalDate created_at;
    
    
    @OneToOne
    @JoinColumn(name="ID_planteamiento")
    private Planteamiento idPlanteamiento;
    
    public Anotaciones() {
    }

    public Anotaciones(long id, String anotaciones, LocalDate created_at, Planteamiento idPlanteamiento) {
        this.anotaciones = anotaciones;
        this.id = id;
        this.created_at = created_at;
        this.idPlanteamiento = idPlanteamiento;
    }
    
    public long getId() {
        return id;
    }
    
    public String getAnotaciones() {
        return anotaciones;
    }
    
    public void setAnotaciones(String anotaciones){
        this.anotaciones = anotaciones;
    }

    public LocalDate getCreated_at() {
        return created_at;
    }
    
    public Planteamiento getIdPlanteamiento(){
        return idPlanteamiento;
    }

            @Override
    public String toString() {
        return "Profesor{" +
                "id=" + id +
                ", anotaciones=' " + anotaciones + '\'' +
                ", fecha de creacion=' " + created_at + '\'' +
                ", idPlanteamiento=' " + idPlanteamiento + '\'' +
                '}';
    }
}
