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
public class AutoresOrganizacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @ManyToOne
    @JoinColumn(name="ID_Autores")
    private AutorP idAutor;
    
    @ManyToOne
    @JoinColumn(name="ID_Organizaciones")
    private Organizacion idOrganizacion;
    
    
    private LocalDate created_at;
    
    
    public AutoresOrganizacion() {
    }

    public AutoresOrganizacion(long id, AutorP idAutor, Organizacion idOrganizacion, LocalDate created_at) {
        this.id = id;
        this.idAutor = idAutor;
        this.idOrganizacion = idOrganizacion;
        this.created_at = created_at;
    }
    
    public long getId() {
        return id;
    }
    
    public Organizacion getOrganizacion() {
        return idOrganizacion;
    }
    
    public AutorP getAutor(){
        return idAutor;
    }
    
    public LocalDate getcreated_at(){
        return created_at;
    }
    
            @Override
    public String toString() {
        return "Profesor{" +
                "id=" + id +
                ", Autor ='" + idAutor + '\'' +
                ", Organizacion ='" + idOrganizacion + '\'' +
                ", Created_at ='" + created_at + '\'' +
                '}';
    }
}
