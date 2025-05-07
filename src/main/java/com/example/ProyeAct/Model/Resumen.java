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
public class Resumen {
           
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String resumen;
    private LocalDate created_at;
    
    
    @OneToOne
    @JoinColumn(name="ID_planteamiento")
    private Planteamiento idPlanteamiento;
    
    public Resumen() {
    }

    public Resumen(long id, String resumen, LocalDate created_at, Planteamiento idPlanteamiento) {
        this.id = id;
        this.resumen = resumen;
        this.created_at = created_at;
        this.idPlanteamiento = idPlanteamiento;
    }
    
    public long getId() {
        return id;
    }
    
    public String getresumen() {
        return resumen;
    }

    public void setresumen(String resumen) {
        this.resumen = resumen;
    }
    
    public LocalDate getcreated_at() {
        return created_at;
    }

    public Planteamiento getIdPlanteamiento(){
        return idPlanteamiento;
    }
    
            @Override
    public String toString() {
        return "Pais{" +
                "id=" + id +
                ", resumen='" + resumen + '\'' +
                ", created_at='" + created_at + '\'' +
                ", idPlanteamiento='" + idPlanteamiento + '\'' +
                '}';
    }
}
