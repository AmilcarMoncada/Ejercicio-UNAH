package hn.unah.lenguajes.matricula.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.matricula.demo.entities.Asignaturas;
import hn.unah.lenguajes.matricula.demo.repositories.AsignaturasRepository;
import hn.unah.lenguajes.matricula.demo.services.AsignaturasService;

@Service
public class AsignaturasServiceImpl implements AsignaturasService{

@Autowired
private AsignaturasRepository asignaturasRepository;

    @Override
    public Asignaturas crearAsignatura(Asignaturas asignaturas) {
        return this.asignaturasRepository.save(asignaturas);
    }

    @Override
    public List<Asignaturas> obtenerAsignaturas() {
return (List<Asignaturas>) this.asignaturasRepository.findAll();
    }

    @Override
    public Asignaturas obtenerPorCodigo(long codigo) {
    return this.asignaturasRepository.findById(codigo).get();
    }
    
}
