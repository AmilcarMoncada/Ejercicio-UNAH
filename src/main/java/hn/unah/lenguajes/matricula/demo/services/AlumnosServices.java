package hn.unah.lenguajes.matricula.demo.services;

import java.util.List;

import hn.unah.lenguajes.matricula.demo.dtos.AlumnoDTO;
import hn.unah.lenguajes.matricula.demo.entities.Alumnos;

public interface AlumnosServices {
    
    public Alumnos crearAlumno(AlumnoDTO alumnos);

    public List<Alumnos> obtenerAlumnos();

    public Alumnos obtenerAlumnoPorCuenta(String cuenta);

    public Alumnos agregarAsignaturaAlumno(String cuenta,
                                           long codigoAsignatura);

}
