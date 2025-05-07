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
public class Tematica {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombreTematica;
    
    @OneToMany(mappedBy = "idTematica", cascade = CascadeType.ALL,orphanRemoval = true  )
    private List<TematicaFragmento> fragmentoTematica = new ArrayList<>();
    
    public Tematica() {
    }

    public Tematica(long id, String nombreTematica) {
        this.id = id;
        this.nombreTematica = nombreTematica;
    }
    
    public long getId() {
        return id;
    }

    public String getnombreTematica() {
        return nombreTematica;
    }
    
    public void setnombreTematica(String nombreTematica){
        this.nombreTematica = nombreTematica;
    }

    
            @Override
    public String toString() {
        return "Profesor{" +
                "id =" + id +
                ", nombre de la tematica ='" + nombreTematica + '\'' +
                '}';
    }
}

   
