/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ProyeAct.Model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
@Entity
public class Seccion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombreSeccion;
    
    @OneToMany(mappedBy = "idSeccion", cascade = CascadeType.ALL,orphanRemoval = true  )
    private List<SeccionFragmento> fragmentoSeccion = new ArrayList<>();
    
    @OneToMany(mappedBy = "ID_Seccion", cascade = CascadeType.ALL,orphanRemoval = true  )
    private List<SubSeccion> subSeccion = new ArrayList<>();
    
    public Seccion() {
    }

    public Seccion(long id, String nombreSeccion) {
        this.id = id;
        this.nombreSeccion = nombreSeccion;
    }
    
    public long getId() {
        return id;
    }
    
    public String getNombreSeccion() {
        return nombreSeccion;
    }

    public void setNombreSeccion(String nombreSeccion) {
        this.nombreSeccion = nombreSeccion;
    }
    
            @Override
    public String toString() {
        return "Profesor{" +
                "id=" + id +
                ", autor='" + nombreSeccion + '\'' +
                '}';
    }
    
}
