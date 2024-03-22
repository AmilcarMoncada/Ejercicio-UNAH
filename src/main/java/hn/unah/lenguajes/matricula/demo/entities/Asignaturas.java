package hn.unah.lenguajes.matricula.demo.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="asignaturas")
@Data
public class Asignaturas {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoasignatura")
    private long codigoAsignatura; 

    private String nombre;

    private int uv;

    @ManyToMany(mappedBy = "asignaturas")
    private List<Alumnos> alumnos;

}
