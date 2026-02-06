package com.franco.backend_api.controller;

import com.franco.backend_api.model.Mensaje;
import com.franco.backend_api.model.Proyecto;
import com.franco.backend_api.repository.MensajeRepository;
import com.franco.backend_api.repository.ProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class SaludoController {

    @Autowired
    private ProyectoRepository proyectoRepository;

    @Autowired
    private MensajeRepository mensajeRepository;

    @GetMapping("/api/proyectos")
    public List<Proyecto> obtenerProyectos() {
        return proyectoRepository.findAll();
    }
    
    @GetMapping("/api/hola")
    public String saludar() {
        return "Backend conectado a Base de Datos H2 💾";
    }

    @PostMapping("/api/contacto")
    public Mensaje guardarMensaje(@RequestBody Mensaje mensajeRecibido) {
        Mensaje mensajeGuardado = mensajeRepository.save(mensajeRecibido);
        
        return mensajeGuardado;
    }
}