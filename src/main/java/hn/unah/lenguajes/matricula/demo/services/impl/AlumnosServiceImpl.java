package hn.unah.lenguajes.matricula.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.matricula.demo.entities.Alumnos;
import hn.unah.lenguajes.matricula.demo.repositories.AlumnosRepository;
import hn.unah.lenguajes.matricula.demo.repositories.AsignaturasRepository;
import hn.unah.lenguajes.matricula.demo.services.AlumnosServices;

@Service
public class AlumnosServiceImpl  implements AlumnosServices{
    
    @Autowired
    private AlumnosRepository alumnosRepository;

    @Autowired
    private AsignaturasRepository asignaturasRepository;

    @Override
    public Alumnos crearAlumno(Alumnos alumnos) {
        return this.alumnosRepository.save(alumnos);
    }

    @Override
    public List<Alumnos> obtenerAlumnos() {
        return (List<Alumnos>) this.alumnosRepository.findAll();
    }

    @Override
    public Alumnos obtenerAlumnoPorCuenta(String cuenta) {
        Alumnos alumno = this.alumnosRepository.findById(cuenta).orElse(null);
        return alumno;
    }

    @Override
    public Alumnos agregarAsignaturaAlumno(String cuenta, long codigoAsignatura) {
        if(this.alumnosRepository.existsById(cuenta)){
            if(this.asignaturasRepository.existsById(codigoAsignatura)){
                Alumnos alumnos = this.alumnosRepository.findById(cuenta).get();
                alumnos.getAsignaturas().add(this.asignaturasRepository.findById(codigoAsignatura).get());
                this.alumnosRepository.save(alumnos);
                return alumnos;
            }
        }
        return null;
    }

}
