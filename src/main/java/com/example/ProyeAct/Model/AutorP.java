/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ProyeAct.Model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
@Entity
public class AutorP {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombreAutor;
    private String segundoNombre;
    private String apellido;
    private String indice;
    private String titulo;
    
    @OneToMany(mappedBy = "idAutor", cascade = CascadeType.ALL,orphanRemoval = true  )
    private List<AutoresFragmentos> autoresFragmento = new ArrayList<>();
    
    @OneToMany(mappedBy = "idAutor", cascade = CascadeType.ALL,orphanRemoval = true  )
    private List<AutoresOrganizacion> autoresOrganizacion = new ArrayList<>();
    
    @OneToMany(mappedBy = "idAutor", cascade = CascadeType.ALL,orphanRemoval = true  )
    private List<AutoresRol> autoresRol = new ArrayList<>();
    
    private LocalDate created_at;
    
    
    public AutorP() {
    }

    public AutorP(long id, String nombreAutor, String segundoNombre, String apellido, String indice, String titulo, LocalDate created_at) {
        this.id = id;
        this.nombreAutor = nombreAutor;
        this.segundoNombre = segundoNombre;
        this.apellido = apellido;
        this.indice = indice;
        this.titulo = titulo;
        this.created_at = created_at;
    }
    
    public long getId() {
        return id;
    }

    public String getnombreAutor() {
        return nombreAutor;
    }

    public void setnombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }
    
    public String getsegundoNombre() {
        return segundoNombre;
    }

    public void setsegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }
    
    public String getapellido() {
        return apellido;
    }

    public void setapellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String getindice() {
        return indice;
    }

    public void setindice(String indice) {
        this.indice = indice;
    }
    
    public String gettitulo() {
        return titulo;
    }

    public void settitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public LocalDate getcreated_at() {
        return created_at;
    }
    
            @Override
    public String toString() {
        return "Autor{" +
                "id=" + id +
                ", nombre del autor='" + nombreAutor + '\'' +
                ", segundo nombre ='" + segundoNombre + '\'' +
                ", segundo nombre ='" + apellido + '\'' +
                ", indice ='" + indice + '\'' +
                ", titulo ='" + titulo + '\'' +
                '}';
    }
}
