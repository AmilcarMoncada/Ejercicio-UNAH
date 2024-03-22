package hn.unah.lenguajes.matricula.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import hn.unah.lenguajes.matricula.demo.entities.Asignaturas;

public interface AsignaturasRepository extends CrudRepository<Asignaturas, Long>{
    
}
