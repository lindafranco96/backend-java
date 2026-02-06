package com.franco.backend_api.controller;

import com.franco.backend_api.model.Mensaje;
import com.franco.backend_api.model.Proyecto;
import com.franco.backend_api.repository.MensajeRepository;
import com.franco.backend_api.repository.ProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class SaludoController {

    // INYECCIÓN DE DEPENDENCIAS
    // Le pedimos a Spring que nos "preste" el repositorio listo para usar
    @Autowired
    private ProyectoRepository proyectoRepository;

    @Autowired // <--- Inyectamos el nuevo repositorio
    private MensajeRepository mensajeRepository;

    @GetMapping("/api/proyectos")
    public List<Proyecto> obtenerProyectos() {
        // Usamos el repositorio para ir a la DB Real
        // Esto ejecuta un "SELECT * FROM PROYECTOS" automático
        return proyectoRepository.findAll();
    }
    
    // Dejé el saludo simple solo para probar que sigue vivo
    @GetMapping("/api/hola")
    public String saludar() {
        return "Backend conectado a Base de Datos H2 💾";
    }

    // --- NUEVO: RECIBIR DATOS (POST) ---
    @PostMapping("/api/contacto") // <--- OJO: Es POST, no GET
    public Mensaje guardarMensaje(@RequestBody Mensaje mensajeRecibido) {
        // @RequestBody le dice a Java: "El JSON que viene de React, conviértelo a objeto Java"
        
        // Guardamos en BD
        Mensaje mensajeGuardado = mensajeRepository.save(mensajeRecibido);
        
        return mensajeGuardado; // Devolvemos confirmación
    }
}