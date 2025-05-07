/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ProyeAct.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDate;

/**
 *
 * @author user
 */
@Entity
public class SubSeccion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private String nombreSeccion;
    private LocalDate created_at;
    
    @ManyToOne
    @JoinColumn(name="ID_Seccion")
    private Seccion ID_Seccion;
    
    public SubSeccion(){
        
    }
    
    public SubSeccion(long id, String nombreSeccion, LocalDate created_at, Seccion id_Seccion){
        this.id = id;
        this.nombreSeccion = nombreSeccion;
        this.created_at = created_at;
        this.ID_Seccion = id_Seccion;
    }
    
    public long getid(){
        return id;
    }
    
    public String getNombreSeccion(){
        return nombreSeccion;
    }
    
    public void setNombreSeccion(String nombreSeccion) {
        this.nombreSeccion = nombreSeccion;
    }
    
    public LocalDate getcreated_at(){
        return created_at;
    }
    
    
    @Override
    public String toString(){
        return " ID = "+id+
                " Nombre = "+nombreSeccion+
                " Created_at = "+created_at+
                " Seccion = "+ID_Seccion; 
    }
}
