package hn.unah.lenguajes.matricula.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.matricula.demo.entities.Alumnos;
import hn.unah.lenguajes.matricula.demo.entities.Carrera;
import hn.unah.lenguajes.matricula.demo.repositories.AlumnosRepository;
import hn.unah.lenguajes.matricula.demo.repositories.CarreraRepository;
import hn.unah.lenguajes.matricula.demo.services.CarreraServices;

@Service
public class CarreraServiceImpl implements CarreraServices{

@Autowired
private CarreraRepository carreraRepository;

@Autowired
private AlumnosRepository alumnosRepository;

    @Override
    public Carrera crearCarrera(Carrera carrera) {
        Carrera carrera2=this.carreraRepository.save(carrera);
        if(carrera.getAlumnos()!=null){
            List<Alumnos>Alumnos=carrera.getAlumnos();
            for (Alumnos alumnos2 : Alumnos) {
                alumnos2.setCarrera(carrera2);
                alumnosRepository.save(alumnos2);
            }
        }
    return carrera2;
    }

    @Override
    public List<Carrera> obtenerCarreras() {
        return (List<Carrera>) this.carreraRepository.findAll();
    }

    @Override
    public Carrera obtenerCarreraPorId(long carrera) {
    return this.carreraRepository.findById(carrera).get();
    }
    
}
