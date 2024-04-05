package hn.unah.lenguajes.matricula.demo.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Id;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="alumnos")
@Data
public class Alumnos {
    
    @Id
    @Column(name = "numerocuenta")
    private String numeroCuenta;

    private String nombre;

    private String apellido;

    private String correo;

    private String telefono;


    @ManyToOne
    @JoinColumn(name = "codigocarrera", referencedColumnName = "codigocarrera")
    private Carrera carrera;

    @JsonBackReference
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="alumno_asignatura",
    joinColumns = @JoinColumn(name="numerocuenta"),
    inverseJoinColumns = @JoinColumn(name="codigoasignatura"))
    private List<Asignaturas> asignaturas;

}
