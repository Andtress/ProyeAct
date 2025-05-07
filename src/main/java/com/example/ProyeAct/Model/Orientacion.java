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
public class Orientacion {
                
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String vision;
    private String mision;
    private String palabrasImportantes;
    private String descripcionPalabraImp;
    private LocalDate created_at;
    
    @ManyToOne
    @JoinColumn(name="ID_planteamiento")
    private Planteamiento idPlanteamiento;
    
    public Orientacion() {
    }

    public Orientacion(long id, String vision,String mision,String palabrasImportantes,String descripcionPalabraImp, LocalDate created_at, Planteamiento idPlanteamiento) {
        this.id = id;
        this.vision = vision;
        this.mision = mision;
        this.palabrasImportantes = palabrasImportantes;
        this.descripcionPalabraImp = descripcionPalabraImp;
        this.created_at = created_at;
        this.idPlanteamiento = idPlanteamiento;
    }
    
    public long getId() {
        return id;
    }
    
    public String getvision() {
        return vision;
    }

    public void setvision(String nombreMunicipio) {
        this.vision = nombreMunicipio;
    }
    
    public String getmision() {
        return mision;
    }
    
    public void setmision(String mision) {
        this.mision = mision;
    }
 
    public void setpalabrasImportantes(String palabrasImportantes) {
        this.palabrasImportantes = palabrasImportantes;
    }
       
    public String getpalabrasImportantes() {
        return palabrasImportantes;
    }
            
    public void setdescripcionPalabraImp(String descripcionPalabraImp) {
        this.descripcionPalabraImp = descripcionPalabraImp;
    }
       
    public String getdescripcionPalabraImp() {
        return descripcionPalabraImp;
    }
   
    public LocalDate getcreated_at() {
        return created_at;
    }

    public Planteamiento getIdPlanteamiento(){
        return idPlanteamiento;
    }
    
            @Override
    public String toString() {
        return "Pais{" +
                "id=" + id +
                ", Mision='" + vision + '\'' +
                ", Vision='" + mision + '\'' +
                ", Palabras Importantes='" + palabrasImportantes + '\'' +
                ", Descripcion de palabras Importantes='" + descripcionPalabraImp + '\'' +
                ", created_at='" + created_at + '\'' +
                '}';
    }
    
}
