package hn.unah.lenguajes.matricula.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.matricula.demo.entities.Carrera;
import hn.unah.lenguajes.matricula.demo.services.impl.CarreraServiceImpl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;




@RestController
@RequestMapping("/api")
public class CarreraController {
    
@Autowired
private CarreraServiceImpl carreraServiceImpl;

    @PostMapping("/carrera/crear")
    public Carrera crearCarrera(@RequestBody Carrera carrera) {
       return this.carreraServiceImpl.crearCarrera(carrera);
    }
    
    @GetMapping("/carrera/obtener")
    public List<Carrera> obtenerCarreras() {
        return this.carreraServiceImpl.obtenerCarreras();
    }
    
    @GetMapping("/carrera/buscar")
    public Carrera obtenerCarreraPorId(@RequestParam long carrera) {
        return this.obtenerCarreraPorId(carrera);
    }
    
}
