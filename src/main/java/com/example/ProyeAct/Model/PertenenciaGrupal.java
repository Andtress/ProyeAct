/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ProyeAct.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *
 * @author user
 */
@Entity
public class PertenenciaGrupal {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private String pertenenciaGrupal;
    
    public PertenenciaGrupal(){
        
    }
    
    public PertenenciaGrupal(long id, String pertenenciaGrupal){
        this.id = id;
        this.pertenenciaGrupal = pertenenciaGrupal;
    }
    
    public long getid(){
        return id;
    }
    
    public String getPertenenciaGrupal(){
        return pertenenciaGrupal;
    }
    @Override
    public String toString(){
        return "id = "+id+
                " pertenencia Grupal = "+pertenenciaGrupal;
    }
}
