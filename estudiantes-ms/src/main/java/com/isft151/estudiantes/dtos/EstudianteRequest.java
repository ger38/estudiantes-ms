package com.isft151.estudiantes.dtos;

import lombok.Data;

@Data
public class EstudianteRequest { //EN DTO SOLO LOS ATRIBUTOS
    private long idEstudiante;
    private long idPersona;
    private Integer legajo;
}

