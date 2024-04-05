package hn.unah.lenguajes.matricula.demo.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.matricula.demo.dtos.AlumnoDTO;
import hn.unah.lenguajes.matricula.demo.entities.Alumnos;
import hn.unah.lenguajes.matricula.demo.entities.Asignaturas;
import hn.unah.lenguajes.matricula.demo.repositories.AlumnosRepository;
import hn.unah.lenguajes.matricula.demo.repositories.AsignaturasRepository;
import hn.unah.lenguajes.matricula.demo.repositories.CarreraRepository;
import hn.unah.lenguajes.matricula.demo.services.AlumnosServices;

@Service
public class AlumnosServiceImpl  implements AlumnosServices{
    
    @Autowired
    private AlumnosRepository alumnosRepository;

    @Autowired
    private AsignaturasRepository asignaturasRepository;

    @Autowired
    private CarreraRepository carreraRepository;

    @Override
    public Alumnos crearAlumno(AlumnoDTO alumno) {
        Alumnos alumnoGuardar = new Alumnos();
        if(alumno.getCodigoAsignatura()!=0){
            if(alumno.getCodigoCarrera()!=0){
                List<Asignaturas> ListaAsignaturas = new ArrayList();
         Asignaturas asignatura = this.asignaturasRepository.findById(alumno.getCodigoAsignatura()).get();
    ListaAsignaturas.add(asignatura);
    alumnoGuardar.setCarrera(this.carreraRepository.findById(alumno.getCodigoCarrera()).get());
    alumnoGuardar.setAsignaturas(ListaAsignaturas);
            }
        }
        if(alumno.getCodigoAsignatura()==0){
            if(alumno.getCodigoCarrera()==0){
                alumnoGuardar.setCarrera(alumno.getCarrera());
                alumnoGuardar.setAsignaturas(alumno.getAsignaturas());
            }
        }
        alumnoGuardar.setNumeroCuenta(alumno.getNumeroCuenta());
        alumnoGuardar.setNombre(alumno.getNombre());
        alumnoGuardar.setApellido(alumno.getApellido());
        alumnoGuardar.setCorreo(alumno.getCorreo());
        alumnoGuardar.setTelefono(alumno.getTelefono());
        return this.alumnosRepository.save(alumnoGuardar);
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
