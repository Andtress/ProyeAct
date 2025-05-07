/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ProyeAct.Service;

import com.example.ProyeAct.Model.Departamento;
import com.example.ProyeAct.Model.Municipio;
import com.example.ProyeAct.Repository.DepartamentoRepository;
import com.example.ProyeAct.Repository.MunicipioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author user
 */
public class DigiLocaAPI1Service {
    
    @Autowired
    private RestTemplate restTemplate;
    
    @Autowired
    private DepartamentoRepository departamentoRepository;
    
    @Autowired
    private MunicipioRepository municipioRepository;
    
        public void infoAPI(){
        String url = "https://api.example.com/datos";
        Departamento departamento = new Departamento();
        Municipio municipio = new Municipio();
        
        //Extrae la informacion de la API
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
    
        if(response.getStatusCode().is2xxSuccessful()){
            String responseBody = response.getBody();
            String[] rows = responseBody.split("\n");
            
            for(String row : rows){
                String[] columns = row.split(",");
                columns[0] = replaceSpecialChars(columns[0]);
                columns[1] = replaceSpecialChars(columns[1]);
                columns[2] = replaceSpecialChars(columns[2]);
                columns[3] = replaceSpecialChars(columns[3]);
                columns[4] = replaceSpecialChars(columns[4]);
                
                //Guardar la info en la BD
                
                Departamento num = siExiste(columns[1]);
                
                if( num.getId()==0 ){
                    /***
                     *      UPDATE
                     *          INSERTAR DEPARTAMENTO
                     *      MIRAR SI SE INSERTA LA FECHA POR SI SOLA O TOCA INCLUIRLA, EL ID SE HACE POR DEFECTO
                     */
                    
                    departamento.setDepartamento(columns[1]);
                    departamentoRepository.save(departamento);
                }else{
                    /**
                     * 
                     *          INSERTAR MUNICIPIO
                     * 
                     */
                    municipio.setnombreMunicipio(columns[3]);
                    municipio.setId_Departamento(num);
                    municipioRepository.save(municipio);
                }
            }
            
        }
        
        /***
         * 
         *      FINAL DEL METODO 
         * 
         */
    }
    
        public Departamento siExiste(String x){
            Departamento n = new Departamento();
            n.setId(0);
            List<Departamento> departamento = departamentoRepository.findAll();
            for(Departamento dep : departamento){
                if(dep.getDepartamento().equals(x)){
                    return dep;
                } else {

                }
            }
            return n;
        }
    
        private String replaceSpecialChars(String str){
            return str.replaceAll("[^a-zA-Z0-9]", "*");
        }
        
}
