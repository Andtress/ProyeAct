/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.ProyeAct.Repository;

import com.example.ProyeAct.Model.Anotaciones;
import com.example.ProyeAct.Model.Asunto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author user
 */

@Repository
public interface AsuntoRepository extends JpaRepository<Asunto, Long>{
    
}
