package com.docencia.personas.repository;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.docencia.personas.model.Direccion;
import com.docencia.personas.model.Persona;

@SpringBootTest
//@ActiveProfiles
public class PersonaRepositoryTest {

    private PersonaRepository personaRepository;
    private Persona personaColection;
    private Direccion direccion;
    private Persona personaFind;
    private String email = "un@email.com";

    @Autowired
    public void setPersonaRepository(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    @BeforeEach
    void cleanDataBase(){
        personaRepository.deleteAll();
        personaColection = new Persona("test",18,email,
        direccion = new Direccion("una calle","una ciudad","38200","Canarias"));
        personaFind = personaRepository.save(personaColection);
    }

    @Test
    void testFind(){
        Assertions.assertEquals(1, personaRepository.count());
        Assertions.assertNotNull(personaFind);
        Assertions.assertNotNull(personaFind.getId());
    }
    
    @Test
    void testFindByCiudad() {
        List<Persona> persona = personaRepository.findByCiudad(direccion.getCiudad());
        Assertions.assertEquals(personaFind,persona.get(0));
    }

    @Test
    void testFindByEdadBetween() {
        List<Persona> persona = personaRepository.findByEdadBetween(15,39);
        Assertions.assertEquals(personaFind,persona.get(0));
    }

    @Test
    void testFindByEmail() {
         Optional<Persona> personaOptional = personaRepository.findByEmail(email);
         Persona persona = personaOptional.stream().toList().get(0);
         Assertions.assertEquals(personaFind,persona);
    }

    @Test
    void testFindByNombreContainingIgnoreCase() {
        List<Persona> persona = personaRepository.findByNombreContainingIgnoreCase("TEST");
        Assertions.assertEquals(personaFind,persona.get(0));
    }

    
}
