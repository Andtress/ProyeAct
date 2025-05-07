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
public class AutoresRol {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    
    @ManyToOne
    @JoinColumn(name="ID_Autores")
    private AutorP idAutor;
    
    @ManyToOne
    @JoinColumn(name="ID_Rol")
    private Rol idRol;
    
    private LocalDate created_at;
    
    public AutoresRol(){
        
    }
    
    public AutoresRol(Long id, AutorP autorP, Rol rol){
        this.id = id;
        this.idAutor =  autorP;
        this.idRol = rol;
    }
    
    public Long getId(){
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public AutorP getIdAutor(){
        return idAutor;
    }
    
    public void setIdAutor(AutorP autorP) {
        this.idAutor = autorP;
    }
    
    public Rol getidRol(){
        return idRol;
    }
    
    public void setIdRol(Rol rol) {
        this.idRol = rol;
    }
    
}
