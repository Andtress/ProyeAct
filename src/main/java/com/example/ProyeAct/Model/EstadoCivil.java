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
public class EstadoCivil {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private String estadoCivil;
    
    public EstadoCivil(){
        
    }
    public EstadoCivil(long id, String estadoCivil){
        this.id = id;
        this.estadoCivil = estadoCivil;
    }
    
    public long getid(){
        return id;
    }
    
    public String getestadoCivil(){
        return estadoCivil;
    }
    
    @Override
    public String toString(){
        return " id = "+
                " estado civil = "+estadoCivil;
    }
}
