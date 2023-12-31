package com.isft151.estudiantes.dtos;

import lombok.Data;

@Data
public class PersonaRequest { //EN DTO SOLO LOS ATRIBUTOS
    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;
    private String mail;
    private String direccion;
}
