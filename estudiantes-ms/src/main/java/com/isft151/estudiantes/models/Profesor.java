package com.isft151.estudiantes.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;



@Table(name = "profesor")
@Entity
@Getter
@Setter
public class Profesor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @one
    to one
    private Persona persona;
    @one
    to many
    private Materia materia;
}