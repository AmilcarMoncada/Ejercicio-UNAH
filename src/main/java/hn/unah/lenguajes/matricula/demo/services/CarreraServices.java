package hn.unah.lenguajes.matricula.demo.services;

import java.util.List;
import hn.unah.lenguajes.matricula.demo.entities.Carrera;

public interface CarreraServices {
    

    public Carrera crearCarrera(Carrera carrera);

    public List<Carrera> obtenerCarreras();

    public Carrera obtenerCarreraPorId(long carrera);

}
