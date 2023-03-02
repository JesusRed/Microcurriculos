package com.ingsistemas.mallacurricular.controller;

import com.ingsistemas.mallacurricular.dto.SubtemaDto;
import com.ingsistemas.mallacurricular.service.SubTemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * The type Sub tema controller.
 */
@RestController
@RequestMapping("subTema")
public class SubTemaController implements ControllerGeneric<SubtemaDto, UUID> {
    /**
     * The Service.
     */
    @Autowired
    SubTemaService service;

    @Override
    @GetMapping("/getById")
    @Secured({"ROLE_DIRECTOR"})
    public ResponseEntity<SubtemaDto> getById(@RequestParam UUID id) throws Exception {
        return new ResponseEntity<>(
                service.getOne(id),
                HttpStatus.OK);
    }

    @Override
    @GetMapping("/getAll")
    @Secured({"ROLE_DIRECTOR"})
    public ResponseEntity<List<SubtemaDto>> getAll() throws Exception {
        return new ResponseEntity<>(
                service.getAll(),
                HttpStatus.OK);
    }

    @Override
    @PostMapping("/save")
    @Secured({"ROLE_DIRECTOR"})
    public ResponseEntity<SubtemaDto> crearOActualizar(@RequestBody SubtemaDto dto) throws Exception {
        return new ResponseEntity<>(
                service.crearOActualizar(dto),
                HttpStatus.OK);

    }

    @Override
    @DeleteMapping("/delete")
    @Secured({"ROLE_DIRECTOR"})
    public void eliminar(@RequestParam UUID UUID) throws Exception {
        service.eliminar(UUID);

    }


}
