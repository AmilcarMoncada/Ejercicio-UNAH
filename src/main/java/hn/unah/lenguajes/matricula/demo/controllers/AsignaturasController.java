package hn.unah.lenguajes.matricula.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.matricula.demo.entities.Asignaturas;
import hn.unah.lenguajes.matricula.demo.services.impl.AsignaturasServiceImpl;

import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;





@RestController
@RequestMapping("/api")
public class AsignaturasController {
    
@Autowired
private AsignaturasServiceImpl asignaturasServiceImpl;

@PostMapping("/asignatura/crear")
public Asignaturas crearAsignatura(@RequestBody Asignaturas asignatura) {
    return this.asignaturasServiceImpl.crearAsignatura(asignatura);
}

@GetMapping("/asignatura/obtener")
public List<Asignaturas> obtenerAsignaturas() {
    return this.asignaturasServiceImpl.obtenerAsignaturas();
}

@GetMapping("/asignatura/buscar")
public Asignaturas obtenerPorCodigo(@RequestParam long codigo) {
    return this.asignaturasServiceImpl.obtenerPorCodigo(codigo);
}


}
