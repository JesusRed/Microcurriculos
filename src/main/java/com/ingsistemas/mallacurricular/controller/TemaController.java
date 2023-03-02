package com.ingsistemas.mallacurricular.controller;

import com.ingsistemas.mallacurricular.dto.TemaDto;
import com.ingsistemas.mallacurricular.service.TemaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * The type Tema controller.
 */
@RestController
@RequestMapping("tema")
public class TemaController implements ControllerGeneric<TemaDto, UUID> {
    /**
     * The Service.
     */
    TemaService service;

    @Override
    @GetMapping("/getById")
    @Secured({"ROLE_DIRECTOR"})
    public ResponseEntity<TemaDto> getById(@RequestParam UUID id) throws Exception {

        return new ResponseEntity<>(service.getOne(id), HttpStatus.OK);
    }

    @Override
    @GetMapping("/getAll")
    @Secured({"ROLE_DIRECTOR"})
    public ResponseEntity<List<TemaDto>> getAll() throws Exception {
        // TODO Auto-generated method stub
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @Override
    @PostMapping("/save")
    @Secured({"ROLE_DIRECTOR"})
    public ResponseEntity<TemaDto> crearOActualizar(@RequestBody TemaDto dto) throws Exception {
        return new ResponseEntity<>(service.crearOActualizar(dto), HttpStatus.OK);
    }

    @Override
    @DeleteMapping("/delete")
    @Secured({"ROLE_DIRECTOR"})
    public void eliminar(@RequestParam UUID UUID) throws Exception {
        service.eliminar(UUID);

    }

}
