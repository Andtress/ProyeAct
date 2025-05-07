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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
@Entity
public class Entidad {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombreEntidad;
    
    
    @OneToMany(mappedBy = "idEntidad", cascade = CascadeType.ALL,orphanRemoval = true  )
    private List<EntidadesFragmento> fragmentoEntidades = new ArrayList<>();
    
    public Entidad() {
    }

    public Entidad(long id, String nombreEntidad) {
        this.id = id;
        this.nombreEntidad = nombreEntidad;
    }
    
    public long getId() {
        return id;
    }

    public String getnombreEntidad() {
        return nombreEntidad;
    }

    public void setnombreEntidad(String nombreEntidad) {
        this.nombreEntidad = nombreEntidad;
    }
    
            @Override
    public String toString() {
        return "Profesor{" +
                "id =" + id +
                ", nombre de la entidad ='" + nombreEntidad + '\'' +
                '}';
    }
}

   