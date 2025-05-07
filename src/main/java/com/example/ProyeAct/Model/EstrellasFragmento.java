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
import java.sql.Timestamp;

/**
 *
 * @author user
 */
@Entity
public class EstrellasFragmento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @ManyToOne
    @JoinColumn(name="ID_Fragmento")
    private Fragmento ID_Fragmento;
     
    @ManyToOne
    @JoinColumn(name="ID_Estrella")
    private Estrellas ID_Estrella;
    
    private Timestamp created_at;
    
    public EstrellasFragmento() {
    }

    public EstrellasFragmento   (long id, Fragmento ID_Fragmento, Estrellas ID_Estrella, Timestamp created_at) {
        this.id = id;
        this.ID_Fragmento = ID_Fragmento;
        this.ID_Estrella = ID_Estrella;
        this.created_at = created_at;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public Fragmento getidFragmento() {
        return ID_Fragmento;
    }
    
    public void setidFragmento(Fragmento frag){
        this.ID_Fragmento = frag;
    } 
    
    public Estrellas getidEstrellas() {
        return ID_Estrella;
    }
    
    public void setidEstrellas(Estrellas ests){
        this.ID_Estrella = ests;
    }
    
    public Timestamp getcreated_at(){
        return created_at;
    }
    
            @Override
    public String toString() {
        return "Profesor{" +
                "id=" + id +
                ", ID Fragmento ='" + ID_Fragmento + '\'' +
                ", ID Estrellas ='" + ID_Estrella + '\'' +
                '}';
    }
}
