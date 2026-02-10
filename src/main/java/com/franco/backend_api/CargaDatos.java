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
            if (repository.count() == 0) {
                
                Proyecto p1 = new Proyecto(
                    "Portafolio Personal", 
                    "Mi web profesional construida con React y Spring Boot", 
                    "Java, React, DB",
                    "https://via.placeholder.com/300", 
                    "https://github.com/lindafranco96/portfolio", 
                    "https://lindafranco.netlify.app"
                );

                Proyecto p2 = new Proyecto(
                    "Todo-List App", 
                    "Gestor de tareas clásico usando LocalStorage", 
                    "React, LocalStorage, Hooks",
                    "https://via.placeholder.com/300", 
                    "https://github.com/lindafranco96/todo-list", 
                    "https://lindafranco96.github.io/React-todo-list/"
                );

                repository.save(p1);
                repository.save(p2);

                System.out.println("Datos de prueba cargados correctamente!");
            } else {
                System.out.println("La base de datos ya tiene información. No se cargaron datos duplicados.");
            }
        };
    }
}