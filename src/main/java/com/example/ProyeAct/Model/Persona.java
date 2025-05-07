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
public class Persona {
           
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long grupoEdad;
    private long grupoMayor;
    private long edadJudicial;
    private String cicloVital;
    private String vocacion;
    
    
    @ManyToOne
    @JoinColumn(name="ID_Sexo")
    private Sexo idsexo;
    @ManyToOne
    @JoinColumn(name="ID_estadoCivil")
    private EstadoCivil idestadoCivil;
    @ManyToOne
    @JoinColumn(name="ID_paisNaci")
    private Pais idpaisNaci;
    @ManyToOne
    @JoinColumn(name="ID_escolaridad")
    private Escolaridad idescolaridad;
    @ManyToOne
    @JoinColumn(name="ID_perteneciaGrupal")
    private PertenenciaGrupal idpertenencia;
    private LocalDate created_at;
    
    public Persona() {
    }

    public Persona( long id, int grupoEdad, int grupoMayor,int edadJudicial, String cicloVital, Sexo sexo, String vocacion, EstadoCivil idestadoCivil, Pais idpaisNaci, Escolaridad idescolaridad, PertenenciaGrupal idpertenencia, LocalDate created_at){
        this.id = id;
        this.grupoEdad = grupoEdad;
        this.grupoMayor = grupoMayor;
        this.edadJudicial = edadJudicial;
        this.cicloVital = cicloVital;
        this.vocacion = vocacion;
        this.idsexo = sexo;
        this.idestadoCivil = idestadoCivil;
        this.idpaisNaci = idpaisNaci;
        this.idescolaridad = idescolaridad;
        this.idpertenencia = idpertenencia;
        this.created_at = created_at;
        
    }
    
    
    
    public long getId() {
        return id;
    }
    
    public int getgrupoEdad() {
        return (int) grupoEdad;
    }

    public void setgrupoEdad(int grupoEdad) {
        this.grupoEdad = grupoEdad;
    }
       
    public int getgrupoMayor() {
        return (int) grupoMayor;
    }

    public void setgrupoMayor(int grupoMayor) {
        this.grupoMayor = grupoMayor;
    }   
    public int getedadJudicial() {
        return (int) edadJudicial;
    }

    public void setedadJudicial(int edadJudicial) {
        this.edadJudicial = edadJudicial;
    }   
    public String getcicloVital() {
        return cicloVital;
    }

    public void setcicloVital(String cicloVital) {
        this.cicloVital = cicloVital;
    }   
    public Sexo getsexo() {
        return idsexo;
    }

    public void setsexo(Sexo sexo) {
        this.idsexo = sexo;
    }   
    public String getvocacion() {
        return vocacion;
    }

    public void setvocacion(String vocacion) {
        this.vocacion = vocacion;
    }
    
    public EstadoCivil getidestadoCivil() {
        return idestadoCivil;
    }
    public void idestadoCivil(EstadoCivil idestadoCivil) {
        this.idestadoCivil = idestadoCivil;
    }
    
    public Pais getidpaisNaci() {
        return idpaisNaci;
    }
    public void setidpaisNaci(Pais idpaisNaci) {
        this.idpaisNaci = idpaisNaci;
    }
    
    public Escolaridad getidescolaridad() {
        return idescolaridad;
    }
    public void setidescolaridad(Escolaridad idescolaridad) {
        this.idescolaridad = idescolaridad;
    }
    public PertenenciaGrupal getidpertenencia(){
        return idpertenencia;
    }
    public void setidpertenencia(PertenenciaGrupal idpertenencia) {
        this.idpertenencia = idpertenencia;
    }
    
    public LocalDate getcreated_at() {
        return  created_at;
    }

    
            @Override
    public String toString() {
        return "Pais{" +
                "id=" + id +
                ", Grupo de edad ='" + grupoEdad + '\'' +
                ", Grupo Mayor='" + grupoMayor + '\'' +
                ", Edad Judicial ='" + edadJudicial + '\'' +
                ", ciclo Vital='" + cicloVital + '\'' +
                ", sexo ='" + idsexo + '\'' +
                ", vocacion ='" + vocacion + '\'' +
                ", idestadoCivil ='" + idestadoCivil + '\'' +
                ", idpaisNacimiento ='" + idpaisNaci + '\'' +
                ", idescolaridad  ='" + idescolaridad + '\'' +
                ", created_at='" + created_at + '\'' +
                '}';
    }
}
