package com.franco.backend_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "PROYECTOS")
public class Proyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descripcion;
    private String teconologias;
    private String urlImagen;
    private String urlRepositorio;
    private String urlDespliegue;
    private LocalDate fechaCreacion;

    public Proyecto() {
    }

    public Proyecto(String titulo, String descripcion, String teconologias, String urlImagen, String urlRepositorio, String urlDespliegue) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.teconologias = teconologias;
        this.urlImagen = urlImagen;
        this.urlRepositorio = urlRepositorio;
        this.urlDespliegue = urlDespliegue;
        this.fechaCreacion = LocalDate.now();
    }
    
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getTecnologias() { return teconologias; }
    public void setTecnologias(String tecnologias) { this.teconologias = tecnologias; }

    public String getUrlImagen() { return urlImagen; }
    public void setUrlImagen(String urlImagen) { this.urlImagen = urlImagen; }

    public String getUrlRepositorio() { return urlRepositorio; }
    public void setUrlRepositorio(String urlRepositorio) { this.urlRepositorio = urlRepositorio; }

    public String getUrlDespliegue() { return urlDespliegue; }
    public void setUrlDespliegue(String urlDespliegue) { this.urlDespliegue = urlDespliegue; }

    public LocalDate getFechaCreacion() { return fechaCreacion; }
    public void setFechaCreacion(LocalDate fechaCreacion) { this.fechaCreacion = fechaCreacion; }
}