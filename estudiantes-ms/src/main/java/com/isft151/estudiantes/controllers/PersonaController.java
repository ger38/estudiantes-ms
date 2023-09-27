package com.isft151.estudiantes.controllers;

import com.isft151.estudiantes.dtos.PersonaRequest;
import com.isft151.estudiantes.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.ws.rs.Produces;

@RequestMapping("/estudiantes")
@Controller
public class PersonaController {

    @Autowired
    private PersonaService personaService;


    @PostMapping("/nuevaPersona")
    @Produces(MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity nuevaPersona(@RequestBody PersonaRequest personaRequest) {

        return personaService.setPersona(personaRequest);
    }
}

