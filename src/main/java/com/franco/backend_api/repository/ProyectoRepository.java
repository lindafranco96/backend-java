package com.franco.backend_api.repository;

import com.franco.backend_api.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends JpaRepository<Proyecto, Long> {
    // ¡ESTO ES TODO! 🤯
    // Al extender de JpaRepository, esta interfaz ya sabe hacer:
    // .findAll() (SELECT *)
    // .save()    (INSERT / UPDATE)
    // .delete()  (DELETE)
    // Sin que escribas una sola línea de SQL.
}