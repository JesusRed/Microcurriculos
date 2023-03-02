package com.ingsistemas.mallacurricular.controller;

import com.ingsistemas.mallacurricular.dto.ProgramaAcademicoDto;
import com.ingsistemas.mallacurricular.serviceImpl.ProgramaAcademicoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * The type Programa academico controller.
 */
@RestController
@RequestMapping("programaAcademico")
public class ProgramaAcademicoController {
    /**
     * The Service.
     */
    @Autowired
    ProgramaAcademicoServiceImpl service;

    /**
     * Crear programa academico.
     *
     * @param nuevo the nuevo
     * @throws Exception the exception
     */
    @Secured({"ROLE_ADMIN"})
    @PostMapping("/save")
    void crearProgramaAcademico(@RequestBody ProgramaAcademicoDto nuevo) throws Exception {
        service.crearOActualizar(nuevo);

    }

    /**
     * Gets programa academico by id.
     *
     * @param id the id
     * @return the programa academico by id
     * @throws Exception the exception
     */
    @Secured({"ROLE_ADMIN", "ROLE_DIRECTOR"})
    @GetMapping("/getById")
    ResponseEntity<ProgramaAcademicoDto> getProgramaAcademicoById(@RequestParam String id) throws Exception {
        ProgramaAcademicoDto d = service.getOne(UUID.fromString(id));
        if (d == null) {
            return new ResponseEntity<>(
                    null,
                    HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(
                d,
                HttpStatus.OK);
    }

    /**
     * Gets programa academico by director.
     *
     * @param directorId the director id
     * @return the programa academico by director
     * @throws Exception the exception
     */
    @GetMapping("/getByDirector")
    @Secured({"ROLE_ADMIN"})
    ResponseEntity<List<ProgramaAcademicoDto>> getProgramaAcademicoByDirector(@RequestParam Integer directorId) throws Exception {
        return new ResponseEntity<>(service.filtrarPorDirector(directorId), HttpStatus.OK);
    }


    /**
     * Gets programa academico by nombre.
     *
     * @param nombre the nombre
     * @return the programa academico by nombre
     * @throws Exception the exception
     */
    @GetMapping("/getByNombre")
    @Secured({"ROLE_ADMIN", "ROLE_DIRECTOR"})
    ResponseEntity<List<ProgramaAcademicoDto>> getProgramaAcademicoByNombre(@RequestParam String nombre) throws Exception {
        return new ResponseEntity<>(service.filtrarPorNombre(nombre), HttpStatus.OK);
    }


    /**
     * Gets programa academico.
     *
     * @return the programa academico
     * @throws Exception the exception
     */
    @GetMapping("/getAll")
    @Secured({"ROLE_ADMIN", "ROLE_DIRECTOR"})
    ResponseEntity<List<ProgramaAcademicoDto>> getProgramaAcademico() throws Exception {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    /**
     * Delete programa academico response entity.
     *
     * @param id the id
     * @return the response entity
     */
    @DeleteMapping("/delete")
    @Secured({"ROLE_ADMIN"})
    ResponseEntity deleteProgramaAcademico(@RequestParam String id) {
        service.eliminar(UUID.fromString(id));
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * Asignar director a programa academico response entity.
     *
     * @param idPrograma     the id programa
     * @param codigoProfesor the codigo profesor
     * @return the response entity
     * @throws Exception the exception
     */
    @PutMapping("/asignarDirector")
    @Secured({"ROLE_ADMIN"})
    ResponseEntity asignarDirectorAProgramaAcademico(@RequestParam String idPrograma, @RequestParam Integer codigoProfesor) throws Exception {
        service.asignarDirector(UUID.fromString(idPrograma), codigoProfesor);
        return new ResponseEntity(HttpStatus.OK);
    }

}
