/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ProyeAct.Model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
@Entity
public class Fragmento {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String titulo;
    private String resumen;
    private String titular;
    private String abstracto;
    private String tipo;
    private String contenido;
    
    @ManyToOne
    @JoinColumn(name="ID_Idioma")
    private Idioma idIdioma;
    
    @ManyToOne
    @JoinColumn(name="ID_Fecha")
    private FechaP idFecha;
    
    @ManyToOne
    @JoinColumn(name="ID_kicker")
    private Referencia idReferencia;
    
    @OneToMany(mappedBy = "ID_Fragmento", cascade = CascadeType.ALL,orphanRemoval = true  )
    private List<EstrellasFragmento> estrellasFragmento = new ArrayList<>();
    
    @OneToMany(mappedBy = "idArticulo", cascade = CascadeType.ALL,orphanRemoval = true  )
    private List<AutoresFragmentos> autoresFragmento;
    
    @OneToMany(mappedBy = "idFragmento", cascade = CascadeType.ALL,orphanRemoval = true  )
    private List<EntidadesFragmento> fragmentoEntidades = new ArrayList<>();
    
    @OneToMany(mappedBy = "idFragmento", cascade = CascadeType.ALL,orphanRemoval = true  )
    private List<SeccionFragmento> fragmentoSeccion = new ArrayList<>();
    
    @OneToMany(mappedBy = "idFragmento", cascade = CascadeType.ALL,orphanRemoval = true  )
    private List<TematicaFragmento> fragmentoTematica = new ArrayList<>();
    
    public Fragmento() {
    }

    public Fragmento(long id, String titulo, String resumen, String titular, String abstracto, String tipo, String contenido, Idioma idIdioma, FechaP idFecha, Referencia idReferencia) {
        this.id = id;
        this.titulo = titulo;
        this.resumen = resumen;
        this.titular = titular;
        this.abstracto = abstracto;
        this.tipo = tipo;
        this.contenido = contenido;
        this.idIdioma = idIdioma;
        this.idFecha = idFecha;
        this.idReferencia = idReferencia;
        
    }
    
    public long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getResumen() {
        return resumen;
    }
    
    public void setResumen(String resumen) {
        this.resumen = resumen;
    }
    
    public String gettitular() {
        return titular;
    }

    public void settitular(String titular) {
        this.titular = titular;
    }
    
    public String getabstracto() {
        return abstracto;
    }

    public void setabstracto(String abstracto) {
        this.abstracto = abstracto;
    }
   
    public String gettipo() {
        return tipo;
    }

    public void settipo(String tipo) {
        this.tipo = tipo;
    }
    public String getcontenido() {
        return contenido;
    }

    public void setcontenido(String contenido) {
        this.contenido = contenido;
    }
    
    public Idioma getidIdioma() {
        return idIdioma;
    }

    public FechaP getidFecha() {
        return idFecha;
    }
    
    public Referencia getidReferencia(){
        return idReferencia;
    }
    
        @Override
    public String toString() {
        return "Profesor{" +
                "id=" + idFecha +
                ", titulo='" + titulo + '\'' +
                ", resumen='" + resumen + '\''+
                ", titular='" + titular + '\''+
                ", abstracto='" + abstracto + '\''+
                ", tipo='" + tipo + '\''+
                ", contenido='" + contenido + '\''+
                ", ID_Idioma='" + idIdioma + '\''+
                ", ID_Fecha='" + idFecha + '\''+
                '}';
    }
    
}

