package com.franco.backend_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "MENSAJES")
public class Mensaje {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    private String email;
    private String texto;
    
    // ✅ CAMBIO CORRECTO: Inicializamos la fecha aquí directo.
    private LocalDateTime fecha = LocalDateTime.now();

    // 1. Constructor Vacío (OBLIGATORIO para JPA)
    public Mensaje() {} 

    // 2. Constructor con datos (Opcional, pero útil si creas mensajes manuales)
    public Mensaje(String nombre, String email, String texto) {
        this.nombre = nombre;
        this.email = email;
        this.texto = texto;
        // Ya no hace falta poner this.fecha = now() aquí, porque se pone sola arriba.
    }

    // --- 3. GETTERS Y SETTERS (OBLIGATORIOS) ---
    // Sin esto, Spring no puede leer ni escribir en el objeto.

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTexto() { return texto; }
    public void setTexto(String texto) { this.texto = texto; }

    public LocalDateTime getFecha() { return fecha; }
    public void setFecha(LocalDateTime fecha) { this.fecha = fecha; }
}