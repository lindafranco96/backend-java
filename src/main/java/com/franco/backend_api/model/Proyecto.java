package com.franco.backend_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;

@Entity // 1. "Soy una Tabla"
@Table(name = "PROYECTOS") // 2. "Mi nombre en BD es PROYECTOS"
public class Proyecto {

    @Id // 3. Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 4. Auto-incremental (Sequence)
    private Long id;

    private String titulo;
    private String descripcion;
    private String urlImagen;
    private String urlRepositorio;
    private String urlDespliegue;
    private LocalDate fechaCreacion;

    // --- IMPORTANTE: JPA exige un constructor vacío ---
    public Proyecto() {
    }

    // Constructor con datos (para facilitarnos la vida al crear objetos)
    public Proyecto(String titulo, String descripcion, String urlImagen, String urlRepositorio, String urlDespliegue) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.urlImagen = urlImagen;
        this.urlRepositorio = urlRepositorio;
        this.urlDespliegue = urlDespliegue;
        this.fechaCreacion = LocalDate.now(); // Se pone la fecha de hoy automático
    }

    // --- GETTERS Y SETTERS (Necesarios para que todo funcione) ---
    // Tip: En VS Code puedes generarlos auto (Click derecho > Source Action...), 
    // pero aquí te los dejo listos para copiar.
    
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getUrlImagen() { return urlImagen; }
    public void setUrlImagen(String urlImagen) { this.urlImagen = urlImagen; }

    public String getUrlRepositorio() { return urlRepositorio; }
    public void setUrlRepositorio(String urlRepositorio) { this.urlRepositorio = urlRepositorio; }

    public String getUrlDespliegue() { return urlDespliegue; }
    public void setUrlDespliegue(String urlDespliegue) { this.urlDespliegue = urlDespliegue; }

    public LocalDate getFechaCreacion() { return fechaCreacion; }
    public void setFechaCreacion(LocalDate fechaCreacion) { this.fechaCreacion = fechaCreacion; }
}