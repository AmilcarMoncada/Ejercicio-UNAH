package hn.unah.lenguajes.matricula.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import hn.unah.lenguajes.matricula.demo.entities.Alumnos;

public interface AlumnosRepository extends CrudRepository<Alumnos, String>{
    
}
