package com.ingsistemas.mallacurricular.controller;

import com.ingsistemas.mallacurricular.dto.PreRequisitoDto;
import com.ingsistemas.mallacurricular.service.PreRequisitoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * The type Pre requisito controller.
 */
@RestController
@RequestMapping("preRequisito")
public class PreRequisitoController implements ControllerGeneric<PreRequisitoDto, UUID> {

    /**
     * The Service.
     */
    @Autowired
    PreRequisitoService service;

    @Override
    @GetMapping("/getById")
    @Secured({"ROLE_DIRECTOR"})
    public ResponseEntity<PreRequisitoDto> getById(UUID id) throws Exception {
        PreRequisitoDto d = service.getOne(id);

        return new ResponseEntity<>(
                d,
                HttpStatus.OK);
    }

    @Override
    @GetMapping("/getAll")
    @Secured({"ROLE_DIRECTOR"})
    public ResponseEntity<List<PreRequisitoDto>> getAll() throws Exception {
        return new ResponseEntity<>(
                service.getAll(),
                HttpStatus.OK);
    }


    @Override
    @PostMapping("/save")
    @Secured({"ROLE_DIRECTOR"})
    public ResponseEntity<PreRequisitoDto> crearOActualizar(PreRequisitoDto dto) throws Exception {
        return new ResponseEntity<>(
                service.crearOActualizar(dto),
                HttpStatus.OK);
    }

    ;


    @Override
    @DeleteMapping("/delete")
    @Secured({"ROLE_DIRECTOR"})
    public void eliminar(UUID UUID) throws Exception {
        service.eliminar(UUID);

    }
}
