/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ProyeAct.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;

/**
 *
 * @author user
 */
@Entity
public class Idioma {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String Idioma;
    private String IdiomaRef;
    private LocalDate created_at;
    
    public Idioma() {
    }

    public Idioma(long id, String Idioma, String IdiomaRef,LocalDate created_at) {
        this.id = id;
        this.Idioma = Idioma;
        this.IdiomaRef = IdiomaRef;
        this.created_at = created_at;
    }
    
    public long getId() {
        return id;
    }
    
    public String getIdioma() {
        return Idioma;
    }

    public void setIdioma(String Idioma) {
        this.Idioma = Idioma;
    }
    
    public String getIdiomaRef() {
        return IdiomaRef;
    }

    public void setIdiomaRef(String IdiomaRef) {
        this.IdiomaRef = IdiomaRef;
    }
    
    public LocalDate created_at(){
        return created_at;
    }
    
            @Override
    public String toString() {
        return "Profesor{" +
                "id=" + id +
                ", Idioma ='" + Idioma + '\'' +
                ", Idioma de Ref='" + IdiomaRef + '\'' +
                ", Created at='" + created_at + '\'' +
                '}';
    }
}