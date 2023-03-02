package com.ingsistemas.mallacurricular.controller;

import com.ingsistemas.mallacurricular.converter.PensumConverter;
import com.ingsistemas.mallacurricular.dto.PensumDto;
import com.ingsistemas.mallacurricular.filters.PensumFilter;
import com.ingsistemas.mallacurricular.service.PensumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * The type Pensum controller.
 */
@RestController
@RequestMapping("pensum")
public class PensumController implements ControllerGeneric<PensumDto, Integer> {
    /**
     * The Service.
     */
    @Autowired
    PensumService service;

    /**
     * The Converter.
     */
    @Autowired
    PensumConverter converter;

    @Override
    @GetMapping("/getById")
    @Secured({"ROLE_DIRECTOR"})
    public ResponseEntity<PensumDto> getById(@RequestParam Integer id) throws Exception {
        return new ResponseEntity<>(
                service.getOne(id),
                HttpStatus.OK);
    }

    @Override
    @GetMapping("/getAll")
    @Secured({"ROLE_DIRECTOR"})
    public ResponseEntity<List<PensumDto>> getAll() throws Exception {
        return new ResponseEntity<>(
                service.getAll(),
                HttpStatus.OK);
    }

    @Override
    @PostMapping("/save")
    @Secured({"ROLE_DIRECTOR"})
    public ResponseEntity<PensumDto> crearOActualizar(@RequestBody PensumDto dto) throws Exception {
        return new ResponseEntity<>(
                service.crearOActualizar(dto),
                HttpStatus.OK);
    }

    @Override
    @Secured({"ROLE_DIRECTOR"})
    @DeleteMapping("/delete")
    public void eliminar(Integer UUID) throws Exception {
        service.eliminar(UUID);

    }

    /**
     * Filter by fechas response entity.
     *
     * @param filter the filter
     * @return the response entity
     * @throws Exception the exception
     */
    @GetMapping("/getByFecha")
    @Secured({"ROLE_DIRECTOR"})
    public ResponseEntity<List<PensumDto>> filterByFechas(PensumFilter filter) throws Exception {
        return new ResponseEntity<>(
                service.filter(filter),
                HttpStatus.OK);
    }
}


