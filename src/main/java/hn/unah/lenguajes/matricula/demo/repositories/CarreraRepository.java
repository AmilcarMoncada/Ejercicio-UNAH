package hn.unah.lenguajes.matricula.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import hn.unah.lenguajes.matricula.demo.entities.Carrera;

public interface CarreraRepository extends CrudRepository<Carrera, Long>{
    
}
