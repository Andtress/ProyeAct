/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ProyeAct.Service;

import com.example.ProyeAct.Model.Departamento;
import com.example.ProyeAct.Repository.DepartamentoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class DepartamentoService {
    
    @Autowired
    private DepartamentoRepository departamentoRepository;
    
    public void guardarDepartamento(Departamento departamento){
        departamentoRepository.save(departamento);
    }
    
    public long siExiste(String x){
        List<Departamento> departamento = departamentoRepository.findAll();
        for(Departamento dep : departamento){
            if(dep.getDepartamento().equals(x)){
                return dep.getId();
            } else {
               
            }
            
        }
        return 0;
    }
    
}

