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
public class FechaP {
        
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDate fecha;
    private LocalDate pub_date;
    private LocalDate create_date;
    private LocalDate update_date;
    
    public FechaP() {
    }

    public FechaP(long id, LocalDate fecha, LocalDate pub_date, LocalDate create_date, LocalDate update_date ) {
        this.id = id;
        this.fecha = fecha;
        this.pub_date = pub_date;
        this.create_date = create_date;
        this.update_date = update_date;
    }
    
    public long getId() {
        return id;
    }
    
    public LocalDate getfecha(){
        return fecha;
    }

    public LocalDate getpub_date() {
        return pub_date;
    }
    
    public void setpub_date(LocalDate pub_date) {
        this.pub_date = pub_date;
    }
    
    
    public LocalDate getcreate_date() {
        return create_date;
    }
    
    public void setcreate_date(LocalDate create_date) {
        this.create_date = create_date;
    }
    
    public LocalDate getupdate_date() {
        return update_date;
    }
    
    
    public void setupdate_date(LocalDate update_date) {
        this.update_date = update_date;
    }

    
            @Override
    public String toString() {
        return "Profesor{" +
                "id=" + id +
                ", fecha='" + fecha + '\'' +
                ", pub_date='" + pub_date + '\'' +
                ", create_date='" + create_date + '\'' +
                ", update_date='" + update_date + '\'' +
                '}';
    }
}
