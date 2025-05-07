/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ProyeAct.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
@Entity
public class Organizacion {
          
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombreOrganizacion;
    private LocalDate created_at; 
    
    @OneToMany(mappedBy = "idOrganizacion", cascade = CascadeType.ALL,orphanRemoval = true  )
    private List<AutoresOrganizacion> autoresOrganizacion = new ArrayList<>();
    
    public Organizacion() {
    }

    public Organizacion(long id, String nombreOrganizacion, LocalDate created_at) {
        this.id = id;
        this.nombreOrganizacion = nombreOrganizacion;
        this.created_at = created_at;
    }
    
    public long getId() {
        return id;
    }

    public String getnombreOrganizacion() {
        return nombreOrganizacion;
    }

    public void setnombreOrganizacion(String nombreOrganizacion) {
        this.nombreOrganizacion = nombreOrganizacion;
    }
    
    public LocalDate getcreated_at(){
        return created_at;
    }
    
            @Override
    public String toString() {
        return "Profesor{" +
                " Id=" + id +
                ", Nombre de la organizacion='" + nombreOrganizacion + '\'' +
                ", Created at='" + created_at + '\'' +
                '}';
    }
}

