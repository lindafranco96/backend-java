package com.franco.backend_api.repository;

import com.franco.backend_api.model.Mensaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MensajeRepository extends JpaRepository<Mensaje, Long> {
    // Listo, ya sabe guardar mensajes.
}