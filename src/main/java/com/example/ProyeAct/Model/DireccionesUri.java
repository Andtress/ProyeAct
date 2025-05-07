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
public class DireccionesUri {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private String direccionUri;
    
    @ManyToOne
    @JoinColumn(name="ID_fragmento")
    private Fragmento id_Fragmento;
    
    private LocalDate created_at;
    
    public DireccionesUri() {
    }

    public DireccionesUri(long id, String direccionUri, LocalDate created_at, Fragmento id_Fragmento) {
        this.id = id;
        this.direccionUri = direccionUri;
        this.created_at = created_at;
        this.id_Fragmento = id_Fragmento;
    }
    
    public long getId() {
        return id;
    }

    public String getdireccionUri() {
        return direccionUri;
    }

    public void setdireccionUri(String direccionUri) {
        this.direccionUri = direccionUri;
    }
    
    public Fragmento getidFragmento() {
        return id_Fragmento;
    }
    
    public LocalDate getcreated_at(){
        return created_at;
    }

    
            @Override
    public String toString() {
        return "Profesor{" +
                "id =" + id +
                ", Direccion URI ='" + direccionUri + '\'' +
                ", ID Fragmento ='" + id_Fragmento + '\'' +
                ", Created at ='" + created_at + '\'' +
                '}';
    }
}
