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
public class Detalle {
            
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @ManyToOne
    @JoinColumn(name="id_Localidad")
    private Localidad id_Localidad;
    private long latitud;
    private long longitud;
    private LocalDate created_at;
    
    public Detalle() {
    }

    public Detalle(long id, Localidad id_Localidad, long latitud, long longitud, LocalDate created_at) {
        this.id = id;
        this.id_Localidad = id_Localidad;
        this.latitud = latitud;
        this.longitud = longitud;
        this.created_at = created_at;
    }
    
    public long getId() {
        return id;
    }

    public Localidad getidLocalidad(){
        return id_Localidad;
    }
    
    public void setlatitud(long latitud) {
        this.latitud = latitud;
    }
    
    public long getlatitud() {
        return latitud;
    }

    public void setlongitud(long longitud) {
        this.longitud = longitud;
    }
        
    public long getlongitud() {
        return longitud;
    }

    public LocalDate getcreated_at() {
        return created_at;
    }

    
            @Override
    public String toString() {
        return "Pais{" +
                "id=" + id +
                ", latitud='" + latitud + '\'' +
                ", longitud='" + longitud + '\'' +
                ", created_at='" + created_at + '\'' +
                '}';
    }

}
