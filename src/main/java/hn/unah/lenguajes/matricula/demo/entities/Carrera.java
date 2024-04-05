package hn.unah.lenguajes.matricula.demo.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="carrera")
@Data
public class Carrera {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigocarrera")
    private long codigoCarrera;

    private String nombre;

    @OneToMany(mappedBy = "carrera", cascade = CascadeType.ALL)
    private List<Alumnos> alumnos;

    
}
