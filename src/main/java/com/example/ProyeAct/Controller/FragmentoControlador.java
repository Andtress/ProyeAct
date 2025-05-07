/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ProyeAct.Controller;

import com.example.ProyeAct.Model.Fragmento;
import com.example.ProyeAct.Service.FragmentoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author user
 */

@RestController
@RequestMapping("/Fragmento")
public class FragmentoControlador {
    
    @Autowired
    private FragmentoService fragmentoService;
    
    
    @GetMapping("/listar")
    public List<Fragmento> listar() {
        return fragmentoService.listar();

    }
    
    @GetMapping("/cargar")
    public ResponseEntity<String> cargarFragmentos(){
        fragmentoService.cargarDesdeApi();
        return ResponseEntity.ok("Fragmentos cargados desde NYT ");
    }

    @PostMapping("/guardar")
    public Fragmento guardar(@RequestBody Fragmento profesor) {
        return fragmentoService.guardar(profesor);
    }

    /**
    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable  long id){
        articuloService.eliminar(id);

    }
    * */
    
    @PutMapping("/articulo/{id}")
    public Fragmento actualizarArticulo(@PathVariable Long id, @RequestBody Fragmento nuevoArticulo){
        return fragmentoService.actualizar(id, nuevoArticulo);
    }
}
