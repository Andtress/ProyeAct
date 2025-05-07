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
public class Kicker {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String contenido;
    private String impresion;
    private LocalDate created_at;
    
    public Kicker() {
    }

    public Kicker(long id, String nombre, String contenido, String impresion, LocalDate created_at) {
        this.id = id;
        this.nombre = nombre;
        this.contenido = contenido;
        this.impresion = impresion;
        this.created_at = created_at;
    }
    
    public long getId() {
        return id;
    }
    
    public String getnombre() {
        return nombre;
    }
    
    public void setnombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getcontenido() {
        return contenido;
    }

    public void setcontenido(String contenido) {
        this.contenido = contenido;
    }
    
    public String getimpresion() {
        return impresion;
    }

    public void setimpresion(String impresion) {
        this.impresion = impresion;
    }
    
    public LocalDate created_at(){
        return created_at;
    }
    
            @Override
    public String toString() {
        return "Profesor{" +
                "id=" + id +
                ", Nombre ='" + nombre + '\'' +
                ", Contenido ='" + contenido + '\'' +
                ", Impresion ='" + impresion + '\'' +
                ", Created at='" + created_at + '\'' +
                '}';
    }
}