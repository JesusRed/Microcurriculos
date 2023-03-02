package com.ingsistemas.mallacurricular.controller;

import com.ingsistemas.mallacurricular.dto.UnidadDto;
import com.ingsistemas.mallacurricular.service.UnidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * The type Unidad controller.
 */
@RestController
@RequestMapping("unidad")
public class UnidadController {
    /**
     * The Unidad service.
     */
    @Autowired
    UnidadService unidadService;


    /**
     * Crear unidad response entity.
     *
     * @param dto the dto
     * @return the response entity
     * @throws Exception the exception
     */
    @PostMapping("/save")
    @Secured({"ROLE_DIRECTOR"})
    ResponseEntity<UnidadDto> crearUnidad(@RequestBody UnidadDto dto) throws Exception {
        return new ResponseEntity<>(
                unidadService.crearOActualizar(dto),
                HttpStatus.OK);

    }

    /**
     * Buscar individual response entity.
     *
     * @param uuid the uuid
     * @return the response entity
     * @throws Exception the exception
     */
    @GetMapping("/getById")
    @Secured({"ROLE_DIRECTOR"})
    ResponseEntity<UnidadDto> buscarIndividual(@RequestParam String uuid) throws Exception {
        return new ResponseEntity<>(
                unidadService.getOne(UUID.fromString(uuid)),
                HttpStatus.OK);

    }

    /**
     * Buscar todos response entity.
     *
     * @return the response entity
     * @throws Exception the exception
     */
    @GetMapping("/getAll")
    @Secured({"ROLE_DIRECTOR"})
    ResponseEntity<List<UnidadDto>> buscarTodos() throws Exception {
        return new ResponseEntity<>(
                unidadService.getAll(),
                HttpStatus.OK);

    }

    /**
     * Eliminar.
     *
     * @param uuid the uuid
     * @throws Exception the exception
     */
    @DeleteMapping("/delete")
    @Secured({"ROLE_DIRECTOR"})
    void eliminar(@RequestParam String uuid) throws Exception {
        unidadService.eliminar(UUID.fromString(uuid));


    }


}
