package hn.unah.lenguajes.matricula.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes.matricula.demo.entities.Asignaturas;

@Repository
public interface AsignaturasRepository extends CrudRepository<Asignaturas, Long>{
    
}
