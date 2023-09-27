package com.isft151.estudiantes.mappers;

import com.isft151.estudiantes.dtos.PersonaRequest;
import com.isft151.estudiantes.models.Persona;
import org.springframework.stereotype.Service;

@Service
public class PersonaMapper {
    public Persona personaRequestToPersona(PersonaRequest personaRequest){

        Persona persona = new Persona();
        persona.setNombre(personaRequest.getNombre());
        persona.setApellido(personaRequest.getApellido());
        persona.setDni(personaRequest.getDni());
        persona.setDireccion(personaRequest.getDireccion());
        persona.setMail(personaRequest.getMail());
        persona.setTelefono(personaRequest.getTelefono());

        return persona;
    }
}
