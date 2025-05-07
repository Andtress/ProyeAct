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
public class Rol {
          
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombreRol;
    private LocalDate created_at;
    
    @OneToMany(mappedBy = "idRol", cascade = CascadeType.ALL,orphanRemoval = true  )
    private List<AutoresRol> autoresRol = new ArrayList<>();
    
    public Rol() {
    }

    public Rol(long id, String nombreRol, LocalDate created_at) {
        this.id = id;
        this.nombreRol = nombreRol;
        this.created_at = created_at;
    }
    
    public long getId() {
        return id;
    }
    
    public String getnombreRol() {
        return nombreRol;
    }

    public void setnombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }
    
    public LocalDate getcreated_at(){
        return created_at;
    }
    
            @Override
    public String toString() {
        return "Profesor{" +
                "id=" + id +
                ", nombre del rol='" + nombreRol + '\'' +
                ", created at ='" + created_at + '\'' +
                '}';
    }
}
