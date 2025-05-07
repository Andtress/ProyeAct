/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ProyeAct.Model;

import jakarta.persistence.*;

/**
 *
 * @author user
 */
@Entity
public class AutorE {
        
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String autor;
    
    public AutorE() {
    }

    public AutorE(long id, String autor) {
        this.id = id;
        this.autor = autor;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
            @Override
    public String toString() {
        return "Profesor{" +
                "id=" + id +
                ", autor='" + autor + '\'' +
                '}';
    }
}
