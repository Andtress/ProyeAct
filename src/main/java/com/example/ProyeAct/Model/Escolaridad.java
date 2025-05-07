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
public class Escolaridad {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private String escolaridad;
    
    public Escolaridad(){
        
    }
    
    public Escolaridad(long id, String escolaridad){
        this.id = id;
        this.escolaridad = escolaridad;
    }
    
    public long getid(){
        return id;
    }
    
    public String getEscolaridad(){
        return escolaridad;
    }
}
