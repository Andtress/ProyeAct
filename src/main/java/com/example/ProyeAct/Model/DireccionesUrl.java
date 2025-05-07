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

/**
 *
 * @author user
 */
@Entity
public class DireccionesUrl {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String direccionUrl;
    
    @ManyToOne
    @JoinColumn(name="ID_fragmento")
    private Fragmento idFragmento;
    
    public DireccionesUrl() {
    }

    public DireccionesUrl(long id, String direccionUrl, Fragmento idFragmento) {
        this.id = id;
        this.direccionUrl = direccionUrl;
        this.idFragmento = idFragmento;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public String getnombreUrl() {
        return direccionUrl;
    }

    public void setnombreUrl(String direccionUrl) {
        this.direccionUrl = direccionUrl;
    }
    
    public Fragmento getidFragmento() {
        return idFragmento;
    }
    
            @Override
    public String toString() {
        return "Profesor{" +
                "id =" + id +
                ", direccion Url ='" + direccionUrl + '\'' +
                ", ID Fragmento ='" + idFragmento + '\'' +
                '}';
    }
}
