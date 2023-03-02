package com.ingsistemas.mallacurricular.controller;

import com.ingsistemas.mallacurricular.dto.CompetenciaDto;
import com.ingsistemas.mallacurricular.service.CompetenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * The type Competencia controller.
 */
@RestController
@RequestMapping("competencia")
public class CompetenciaController implements ControllerGeneric<CompetenciaDto, UUID> {
    /**
     * The Service.
     */
    @Autowired
    CompetenciaService service;

    @Override
    @GetMapping("/getById")
    @Secured({"ROLE_DIRECTOR"})
    public ResponseEntity<CompetenciaDto> getById(@RequestParam UUID id) throws Exception {
        return new ResponseEntity<>(service.getOne(id), HttpStatus.OK);
    }

    @Override
    @GetMapping("/getAll")
    @Secured({"ROLE_DIRECTOR"})
    public ResponseEntity<List<CompetenciaDto>> getAll() throws Exception {
        // TODO Auto-generated method stub
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @Override
    @PostMapping("/save")
    @Secured({"ROLE_DIRECTOR"})
    public ResponseEntity<CompetenciaDto> crearOActualizar(@RequestBody CompetenciaDto dto) throws Exception {
        // TODO Auto-generated method stub
        return new ResponseEntity<>(service.crearOActualizar(dto), HttpStatus.OK);
    }

    @Override
    @DeleteMapping("/delete")
    @Secured({"ROLE_DIRECTOR"})
    public void eliminar(@RequestParam UUID UUID) throws Exception {
        service.eliminar(UUID);

    }

}
