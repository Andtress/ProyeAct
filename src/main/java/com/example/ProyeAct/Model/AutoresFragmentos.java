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
public class AutoresFragmentos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @ManyToOne
    @JoinColumn(name="ID_autores")
    private AutorP idAutor;
    
    @ManyToOne
    @JoinColumn(name="ID_fragmentos")
    private Fragmento idArticulo;
    
    private LocalDate created_at;
    
    public AutoresFragmentos() {
    }

    public AutoresFragmentos(long id, AutorP idAutor, Fragmento idArticulo, LocalDate created_at) {
        this.id = id;
        this.idAutor = idAutor;
        this.idArticulo = idArticulo;
        this.created_at = created_at;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public AutorP getIdAutor() {
        return idAutor;
    }

    public void setidAutor(AutorP idAutor) {
        this.idAutor = idAutor;
    }
    
    public Fragmento getidArticulo() {
        return idArticulo;
    }

    public void setidArticulo(Fragmento idArticulo) {
        this.idArticulo = idArticulo;
    }
    
    public LocalDate getcreated_at(){
        return created_at;
    }
    
            @Override
    public String toString() {
        return "Profesor{" +
                "id=" + id +
                ", idAutor ='" + idAutor + '\'' +
                ", idArticulo ='" + idArticulo + '\'' +
                ", Created_at ='" + created_at + '\'' +
                '}';
    }
}
