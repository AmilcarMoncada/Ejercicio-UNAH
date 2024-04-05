package hn.unah.lenguajes.matricula.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes.matricula.demo.entities.Carrera;

@Repository
public interface CarreraRepository extends CrudRepository<Carrera, Long>{
    
}
