/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ProyeAct.Model;

import jakarta.persistence.*;
import java.time.LocalDate;

/**
 *
 * @author user
 */
@Entity
public class Municipio {
            
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @ManyToOne
    @JoinColumn(name="id_Departamento")
    private Departamento id_departamento;
    private String nombreMunicipio;
    private LocalDate created_at;
    
    public Municipio() {
    }

    public Municipio(long id, Departamento id_departamento , String nombreMunicipio, LocalDate created_at) {
        this.id = id;
        this.id_departamento = id_departamento;
        this.nombreMunicipio = nombreMunicipio;
        this.created_at = created_at;
    }
    
    public long getId() {
        return id;
    }
    
    public Departamento getId_Departamento(){
        return id_departamento;
    }
    
    public void setId_Departamento(Departamento idDepartamento){
        this.id_departamento = idDepartamento;
    }
    
    public String getnombreMunicipio() {
        return nombreMunicipio;
    }

    public void setnombreMunicipio(String nombreMunicipio) {
        this.nombreMunicipio = nombreMunicipio;
    }
    
    public LocalDate getcreated_at() {
        return created_at;
    }

    
            @Override
    public String toString() {
        return "Pais{" +
                "id=" + id +
                ", Nombre del Municipio='" + nombreMunicipio + '\'' +
                ", created_at='" + created_at + '\'' +
                '}';
    }
}
