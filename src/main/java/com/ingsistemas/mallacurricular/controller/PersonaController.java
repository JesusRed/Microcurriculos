package com.ingsistemas.mallacurricular.controller;

import com.ingsistemas.mallacurricular.dto.PersonaDto;
import com.ingsistemas.mallacurricular.serviceImpl.PersonaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * The type Persona controller.
 */
@RestController
@RequestMapping("persona")
public class PersonaController implements ControllerGeneric<PersonaDto, Integer> {
    @Autowired
    private PersonaServiceImpl service;


    /**
     * Instantiates a new Persona controller.
     *
     * @param service the service
     */
    public PersonaController(PersonaServiceImpl service) {
        this.service = service;
    }

    @Override
    @GetMapping("/getById")
    public ResponseEntity<PersonaDto> getById(Integer id) throws Exception {
        return new ResponseEntity<>(
                service.getOne(id),
                HttpStatus.OK);
    }

    @Override
    @GetMapping("/getAll")
    @Secured({"ROLE_ADMIN"})
    public ResponseEntity<List<PersonaDto>> getAll() throws Exception {
        return new ResponseEntity<>(
                service.getAll(),
                HttpStatus.OK);
    }

    @Override
    @Secured({"ROLE_ADMIN"})
    @PostMapping("/save")
    public ResponseEntity<PersonaDto> crearOActualizar(@RequestBody PersonaDto dto) throws Exception {
        return new ResponseEntity<>(
                service.crearOActualizar(dto),
                HttpStatus.OK);
    }

    @Override
    @Secured({"ROLE_ADMIN"})
    @DeleteMapping("/delete")
    public void eliminar(Integer UUID) throws Exception {
        service.eliminar(UUID);

    }

    /**
     * Cambiar permiso.
     *
     * @param idCodigo the id codigo
     */
    @Secured({"ROLE_ADMIN"})
    @PostMapping("/cambiarPermiso")
    public void cambiarPermiso(Integer idCodigo) {
        service.cambiarPermiso(idCodigo);


    }


}
