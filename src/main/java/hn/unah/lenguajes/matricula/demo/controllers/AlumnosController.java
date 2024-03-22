package hn.unah.lenguajes.matricula.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.matricula.demo.entities.Alumnos;
import hn.unah.lenguajes.matricula.demo.services.impl.AlumnosServiceImpl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/api")
public class AlumnosController {
    
    @Autowired
    private AlumnosServiceImpl alumnosServiceImpl;

    @PostMapping("/alumnos/crear")
    public Alumnos crearAlumno(@RequestBody Alumnos alumnos) {
        return this.alumnosServiceImpl.crearAlumno(alumnos);
    }
    

}
