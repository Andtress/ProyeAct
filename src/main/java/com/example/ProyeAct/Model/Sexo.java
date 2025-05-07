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
public class Sexo {
       
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private String sexo;
    
    public Sexo(){
    }
    
    public Sexo(long id, String sexo){
        this.id = id;
        this.sexo = sexo;
    }
    
    public long getid(){
        return id;
    }
    
    public String getsexo(){
        return sexo;
    }
    
    @Override
    public String toString(){
        return "id = "+id+
                "sexo = "+sexo;
    }
}
