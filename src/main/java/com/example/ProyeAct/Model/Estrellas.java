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
public class Estrellas {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private int valor;
    private int rank;
    private String major;
    
    @OneToMany(mappedBy = "ID_Estrella", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<EstrellasFragmento> estrellasFragmento = new ArrayList<>();
    
    public Estrellas() {
    }

    public Estrellas(long id, String nombre, int valor, int rank, String major) {
        this.id = id;
        this.nombre = nombre;
        this.valor = valor;
        this.rank = rank;
        this.major = major;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getvalor() {
        return valor;
    }

    public void setvalor(int valor) {
        this.valor = valor;
    }
    
    public int getrank() {
        return rank;
    }

    public void setrank(int rank) {
        this.rank = rank;
    }
    
    public String getmajor() {
        return major;
    }

    public void setmajor(String major) {
        this.major = major;
    }
    
            @Override
    public String toString() {
        return "Profesor{" +
                "id=" + id +
                ", nombre ='" + nombre + '\'' +
                ", valor ='" + valor + '\'' +
                ", rank ='" + rank + '\'' +
                ", major ='" + major + '\'' +
                '}';
    }
}
