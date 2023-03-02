package com.ingsistemas.mallacurricular.controller;

import com.ingsistemas.mallacurricular.dto.AreaFormacionDto;
import com.ingsistemas.mallacurricular.filters.AreaFormacionFilter;
import com.ingsistemas.mallacurricular.service.AreaFormacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * The type Area formacion controller.
 */
@RestController
@RequestMapping("areaFormacion")
public class AreaFormacionController implements ControllerGeneric<AreaFormacionDto, String> {
    /**
     * The Service.
     */
    @Autowired
    AreaFormacionService service;


    @Override
    @Secured({"ROLE_DIRECTOR"})
    @GetMapping("/getById")
    public ResponseEntity<AreaFormacionDto> getById(@RequestParam String id) throws Exception {
        AreaFormacionDto d = service.getOne(UUID.fromString(id));
        return new ResponseEntity<>(d, HttpStatus.OK);
    }


    @Override
    @Secured({"ROLE_DIRECTOR"})
    @GetMapping("/getAll")
    public ResponseEntity<List<AreaFormacionDto>> getAll() throws Exception {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @Override
    @Secured({"ROLE_DIRECTOR"})
    @PostMapping("/save")
    public ResponseEntity<AreaFormacionDto> crearOActualizar(@RequestBody AreaFormacionDto dto) throws Exception {
        return new ResponseEntity<>(service.crearOActualizar(dto), HttpStatus.OK);
    }

    @Override
    @Secured({"ROLE_DIRECTOR"})
    @DeleteMapping("/delete")
    public void eliminar(@RequestParam String uuid) {
        service.eliminar(UUID.fromString(uuid));

    }

    /**
     * Filter response entity.
     *
     * @param filter the filter
     * @return the response entity
     * @throws Exception the exception
     */
    @DeleteMapping("/filter")
    @Secured({"ROLE_DIRECTOR"})
    public ResponseEntity<List<AreaFormacionDto>> filter(@RequestBody AreaFormacionFilter filter) throws Exception {
        return new ResponseEntity<>(service.filter(filter), HttpStatus.OK);
    }


}
