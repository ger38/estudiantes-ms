package com.isft151.estudiantes.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "estudiantes")
@Entity
@Getter
@Setter
public class Estudiante {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")

    private long idEstudiante;
    private long idPersona;
    private Integer legajo;


}
