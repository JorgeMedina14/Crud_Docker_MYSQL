package com.crudsql.cruddocker.dao;

import com.crudsql.cruddocker.entities.Estudiante;
import org.springframework.data.repository.CrudRepository;


public interface EstudianteDAO extends CrudRepository<Estudiante, Long> {
    Estudiante findByNombre(String nombre);
}
