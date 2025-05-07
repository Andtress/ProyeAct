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
public class AutorD {
        
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String autor;
    
    public AutorD() {
    }

    public AutorD(long id, String autor) {
        this.id = id;
        this.autor = autor;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public long getAutor() {
        return id;
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
