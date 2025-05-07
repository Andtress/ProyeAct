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
public class Contenido {
        
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String indicador;
    private String undMedida;
    private String lineaBase;
    private String añoLineaBase;
    private String fuenteLineaBase;
    private String metaProductoCuatrienio;
    private String descripcionMetaCuatrienio;
    private String lider;
    private LocalDate created_at;
    
    
    @ManyToOne
    @JoinColumn(name="ID_planteamiento")
    private Planteamiento idPlanteamiento;
    
    public Contenido() {
    }

    public Contenido(long id,String indicador,String undMedida,String lineaBase,String añoLineaBase,String fuenteLineaBase,String metaProductoCuatrienio,String descripcionMetaCuatrienio,String lider, LocalDate created_at, Planteamiento idPlanteamiento) {
    this.id = id;
    this.indicador = indicador;
    this.undMedida = undMedida;
    this.lineaBase = lineaBase;
    this.añoLineaBase = añoLineaBase;
    this.fuenteLineaBase = fuenteLineaBase;
    this.metaProductoCuatrienio = metaProductoCuatrienio;
    this.descripcionMetaCuatrienio = descripcionMetaCuatrienio;
    this.lider = lider;
    this.created_at = created_at;
    this.idPlanteamiento = idPlanteamiento;
    }
    
    public long getId() {
        return id;
    }

    public void setindicador(String indicador) {
        this.indicador = indicador;
    }
    
    public void setundMedida(String undMedida) {
        this.undMedida = undMedida;
    }
    
    public String getlineaBase() {
        return lineaBase;
    }

    public void setlineaBase(String lineaBase) {
        this.lineaBase = lineaBase;
    }
    
    public String getañoLineaBase() {
        return añoLineaBase;
    }

    public void setañoLineaBase(String añoLineaBase) {
        this.añoLineaBase = añoLineaBase;
    }
    
    public String getfuenteLineaBase() {
        return fuenteLineaBase;
    }

    public void setfuenteLineaBase(String fuenteLineaBase) {
        this.fuenteLineaBase = fuenteLineaBase;
    }
   
    public String getmetaProductoCuatrienio() {
        return metaProductoCuatrienio;
    }
    public void setmetaProductoCuatrienio(String metaProductoCuatrienio) {
        this.metaProductoCuatrienio = metaProductoCuatrienio;
    }
    
    public String getdescripcionMetaCuatrienio() {
        return descripcionMetaCuatrienio;
    }

    public void setdescripcionMetaCuatrienio(String descripcionMetaCuatrienio) {
        this.descripcionMetaCuatrienio = descripcionMetaCuatrienio;
    }
    
    public String getlider() {
        return lider;
    }

    public void setlider(String lider) {
        this.lider = lider;
    }
    
     
    public LocalDate getCreated_at() {
        return created_at;
    }
    
    public Planteamiento getIdPlanteamiento() {
        return idPlanteamiento;
    }

    
        @Override
    public String toString() {
        return "Profesor{" +
                "id=" + id +
                ", indicador='" + indicador + '\''+
                ", undMedida='" + undMedida + '\''+
                ", lineaBase='" + lineaBase + '\''+
                ", añoLineaBase='" + añoLineaBase + '\''+
                ", fuenteLineaBase='" + fuenteLineaBase + '\''+
                ", metaProductoCuatrienio='" + metaProductoCuatrienio + '\''+
                ", descripcionMetaCuatrienio='" + descripcionMetaCuatrienio + '\''+
                ", lider='" + lider + '\''+
                ", created_at ='" + created_at + '\''+
                ", idPlanteamiento='" + idPlanteamiento + '\''+
                '}';
 
    }

}
