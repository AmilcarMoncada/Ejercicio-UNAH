package hn.unah.lenguajes.matricula.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes.matricula.demo.entities.Alumnos;

@Repository
public interface AlumnosRepository extends CrudRepository<Alumnos, String>{
    
}
