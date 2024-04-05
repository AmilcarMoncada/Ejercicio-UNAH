package hn.unah.lenguajes.matricula.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.matricula.demo.dtos.AlumnoDTO;
import hn.unah.lenguajes.matricula.demo.entities.Alumnos;
import hn.unah.lenguajes.matricula.demo.services.impl.AlumnosServiceImpl;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/api")
public class AlumnosController {
    
    @Autowired
    private AlumnosServiceImpl alumnosServiceImpl;

    @PostMapping("/alumnos/crear")
    public Alumnos crearAlumno(@RequestBody AlumnoDTO alumnos) {
        return this.alumnosServiceImpl.crearAlumno(alumnos);
    }
    
    @GetMapping("/alumnos/obtener")
    public List<Alumnos> obtenerAlumnos() {
        return this.alumnosServiceImpl.obtenerAlumnos();
    }

    @GetMapping("/alumnos/obtenerxcuenta")
    public Alumnos obtenerAlumnoPorCuenta(@RequestParam String cuenta) {
        return this.alumnosServiceImpl.obtenerAlumnoPorCuenta(cuenta);
    }
    
    @PutMapping("/alumnos/agregarasignatura")
    public Alumnos agregarAsignaturaAlumnos(@RequestParam String cuenta, @RequestParam long codigoAsignatura) {
        return this.alumnosServiceImpl.agregarAsignaturaAlumno(cuenta, codigoAsignatura);
    }
    
}
