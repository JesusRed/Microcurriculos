package com.ingsistemas.mallacurricular.controller;

import com.ingsistemas.mallacurricular.dto.CompetenciaResultadoDto;
import com.ingsistemas.mallacurricular.entity.CompetenciaResultadoPK;
import com.ingsistemas.mallacurricular.service.CompetenciaResultadoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * The type Competencia resultado controller.
 */
@RestController
@RequestMapping("competenciaResultado")
public class CompetenciaResultadoController {
    /**
     * The Service.
     */
    CompetenciaResultadoService service;

    /**
     * Crear competencia resultado.
     *
     * @param nuevo the nuevo
     * @throws Exception the exception
     */
    @Secured({"ROLE_DIRECTOR"})
    @PostMapping("/save")
    void crearCompetenciaResultado(@RequestBody CompetenciaResultadoDto nuevo) throws Exception {
        service.crearOActualizar(nuevo);

    }

    /**
     * Gets competencia resultado by id.
     *
     * @param idCompetencia the id competencia
     * @param idResultado   the id resultado
     * @return the competencia resultado by id
     * @throws Exception the exception
     */
    @GetMapping("/getById")
    @Secured({"ROLE_DIRECTOR"})
    ResponseEntity<CompetenciaResultadoDto> getCompetenciaResultadoById(@RequestParam String idCompetencia, @RequestParam String idResultado) throws Exception {
        CompetenciaResultadoPK pk = new CompetenciaResultadoPK();
        pk.setIdCompetencia(idCompetencia);
        pk.setIdResultado(idResultado);
        CompetenciaResultadoDto d = service.getOne(pk);
        return new ResponseEntity<>(
                d,
                HttpStatus.OK);
    }


    /**
     * Gets competencia resultado.
     *
     * @return the competencia resultado
     * @throws Exception the exception
     */
    @GetMapping("/all")
    @Secured({"ROLE_DIRECTOR"})
    ResponseEntity<List<CompetenciaResultadoDto>> getCompetenciaResultado() throws Exception {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    /**
     * Delete competencia resultado.
     *
     * @param idCompetencia the id competencia
     * @param idResultado   the id resultado
     */
    @DeleteMapping("/delete")
    @Secured({"ROLE_DIRECTOR"})
    void deleteCompetenciaResultado(@RequestParam String idCompetencia, @RequestParam String idResultado) {
        CompetenciaResultadoPK pk = new CompetenciaResultadoPK();
        pk.setIdCompetencia(idCompetencia);
        pk.setIdResultado(idResultado);
        service.eliminar(pk);

    }


}
