package hn.unah.lenguajes.matricula.demo.services;

import java.util.List;

import hn.unah.lenguajes.matricula.demo.entities.Asignaturas;

public interface AsignaturasService {
    
    public Asignaturas crearAsignatura(Asignaturas asignaturas);

    public List<Asignaturas> obtenerAsignaturas();

    public Asignaturas obtenerPorCodigo(long codigo);
}
