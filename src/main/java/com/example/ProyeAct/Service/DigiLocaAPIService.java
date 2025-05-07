/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ProyeAct.Service;

import com.example.ProyeAct.Model.Departamento;
import com.example.ProyeAct.Repository.DepartamentoRepository;
import com.example.ProyeAct.Repository.LocalidadRepository;
import com.example.ProyeAct.Repository.MunicipioRepository;
import com.example.ProyeAct.Repository.PaisRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class DigiLocaAPIService {
    /**
     * 
     *          IDIOMA, PAIS, DEPARTAMENTO, MUNICIPIO, LOCALIDAD Y DETALLE (FECHAS)
     * 
     */
    @Autowired
    private PaisRepository paisRepository;
    
    @Autowired
    private DepartamentoRepository departamentoRepository;
    
    @Autowired
    private MunicipioRepository municipioRepository;
    
    @Autowired
    private LocalidadRepository localidadRepository;
    
    public void consumirApi(){
 
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url("").build();

        try(Response response = client.newCall(request).execute()){
            if(response.isSuccessful()){
                String responseBody = response.body().string();
                
                // PROCESAR LA RESPUESTA Y GUARDAR LA INFORMACION
                
                ObjectMapper mapper = new ObjectMapper();
                
                Departamento departamento = mapper.readValue(responseBody, Departamento.class);
                
                departamentoRepository.save(departamento);
                        
                }
        } catch(IOException e){
            
        }
    
        
    }
}
