package hn.unah.lenguajes.matricula.demo.dtos;

import java.util.List;

import org.springframework.stereotype.Component;

import hn.unah.lenguajes.matricula.demo.entities.Asignaturas;
import hn.unah.lenguajes.matricula.demo.entities.Carrera;
import lombok.Data;

@Component
@Data
public class AlumnoDTO {
    private String numeroCuenta;

    private String nombre;

    private String apellido;

    private String correo;

    private String telefono;

    private long codigoCarrera;

    private Carrera carrera;

    private long codigoAsignatura;

    private List<Asignaturas> asignaturas;
}
