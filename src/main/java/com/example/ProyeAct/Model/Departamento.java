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
public class Departamento {
            
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombreDepartamento;
    private LocalDate created_at;
    
    public Departamento() {
    }

    public Departamento(long id, String nombreDepartamento, LocalDate created_at) {
        this.id = id;
        this.nombreDepartamento = nombreDepartamento;
        this.created_at = created_at;
    }
    
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public String getDepartamento() {
        return nombreDepartamento;
    }

    public void setDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }
    
    public long getcreated_at() {
        return id;
    }

    public void setcreated_at(LocalDate created_at) {
        this.created_at = created_at;
    }
    
            @Override
    public String toString() {
        return "Pais{" +
                "id=" + id +
                ", Nombre del Departamento='" + nombreDepartamento + '\'' +
                ", created_at='" + created_at + '\'' +
                '}';
    }
}
