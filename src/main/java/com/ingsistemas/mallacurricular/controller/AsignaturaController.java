package com.ingsistemas.mallacurricular.controller;

import com.ingsistemas.mallacurricular.dto.AsignaturaDto;
import com.ingsistemas.mallacurricular.exceptions.ErrorsEnum;
import com.ingsistemas.mallacurricular.exceptions.PropiedadFaltanteException;
import com.ingsistemas.mallacurricular.service.AsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * The type Asignatura controller.
 */
@RestController
@RequestMapping("asignatura")
public class AsignaturaController implements ControllerGeneric<AsignaturaDto, Integer> {
    /**
     * The Service.
     */
    @Autowired
    AsignaturaService service;

    /**
     * The Ruta jasper report.
     */
    String rutaJasperReport;


    @Override
    @GetMapping("/getById")
    public ResponseEntity<AsignaturaDto> getById(@RequestParam Integer id) throws Exception {
        AsignaturaDto opa = service.getOne(id);//logica de descarga o vizualizacion pendiente
        return new ResponseEntity<>(opa, HttpStatus.OK);
    }

    /**
     * Alternar descargable response entity.
     *
     * @param id the id
     * @return the response entity
     * @throws Exception the exception
     */
    @GetMapping("/configurarDescarga")
    public ResponseEntity<AsignaturaDto> alternarDescargable(@RequestParam Integer id) throws Exception {
        service.alternarDescarga(id);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @Override
    @GetMapping("/getAll")
    public ResponseEntity<List<AsignaturaDto>> getAll() throws Exception {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    @Override
    @PostMapping("/save")
    public ResponseEntity crearOActualizar(@RequestBody AsignaturaDto dto) throws Exception {
        AsignaturaDto response = service.crearOActualizar(dto);
        return new ResponseEntity<>(response, HttpStatus.OK);

    }

    @Override
    @DeleteMapping("/delete")
    public void eliminar(@RequestParam Integer id) throws Exception {
        service.eliminar(id);
    }

    /**
     * Imprimir response entity.
     *
     * @param id the id
     * @return the response entity
     * @throws Exception the exception
     */
    @GetMapping("/imprimir")
    public ResponseEntity<ByteArrayResource> imprimir(@RequestParam Integer id) throws Exception {
        if (!service.getOne(id).getDescargable()) {
            throw new PropiedadFaltanteException(ErrorsEnum.MISSING_PROPERTY, "asignatura", "descargable");
        }

        ByteArrayResource resource = new ByteArrayResource(service.imprimir(id));
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_PDF).body(resource);
    }


}
