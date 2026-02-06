package com.franco.backend_api;

import com.franco.backend_api.model.Proyecto;
import com.franco.backend_api.repository.ProyectoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CargaDatos {

    @Bean
    CommandLineRunner initDatabase(ProyectoRepository repository) {
        return args -> {
            // Aquí creamos tus proyectos "reales" para la base de datos
            // Fíjate que usamos el constructor que hiciste ayer
            
            Proyecto p1 = new Proyecto(
                "Portafolio Personal", 
                "Mi web profesional construida con React y Spring Boot", 
                "https://via.placeholder.com/300", // Imagen temporal
                "https://github.com/lindafranco96/portfolio", 
                "https://lindafranco.netlify.app"
            );

            Proyecto p2 = new Proyecto(
                "Todo-List App", 
                "Gestor de tareas clásico usando LocalStorage", 
                "https://via.placeholder.com/300", 
                "https://github.com/lindafranco96/todo-list", 
                "https://lindafranco96.github.io/React-todo-list/"
            );

            // Guardamos en la Base de Datos H2
            repository.save(p1);
            repository.save(p2);

            System.out.println("✅ Datos de prueba cargados en H2 correctamente!");
        };
    }
}