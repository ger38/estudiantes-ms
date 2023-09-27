package com.isft151.estudiantes.services;

import com.isft151.estudiantes.dtos.PersonaRequest;
import com.isft151.estudiantes.mappers.PersonaMapper;
import com.isft151.estudiantes.models.Persona;
import com.isft151.estudiantes.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Autowired
    private PersonaMapper personaMapper;

    public ResponseEntity setPersona(PersonaRequest personaRequest) {

        Persona persona = personaMapper.personaRequestToPersona(personaRequest);
        personaRepository.save(persona);
        return ResponseEntity.ok("Persona guardada: " + persona.getNombre() + " " + persona.getApellido());
    }

}
