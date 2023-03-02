package com.ingsistemas.mallacurricular.converter;

import com.ingsistemas.mallacurricular.dto.AsignaturaDto;
import com.ingsistemas.mallacurricular.entity.Asignatura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AsignaturaConverter implements ConverterDto<Asignatura, AsignaturaDto> {

    @Autowired
    AreaFormacionConverter areaConverter;
    @Autowired
    PreRequisitoConverter preConverter;

    @Override
    public List<AsignaturaDto> convert(List<Asignatura> lista) {
        List<AsignaturaDto> lisResult = new ArrayList<AsignaturaDto>();
        for (Asignatura asignatura : lista) {
            lisResult.add(convert(asignatura));
        }
        return lisResult;
    }

    @Override
    public AsignaturaDto convert(Asignatura dto) {
        AsignaturaDto a = new AsignaturaDto();
        a.setAccFormacionInv(dto.getAccFormacionInv());
        a.setBibliografia(dto.getBibliografia());
        a.setCodigo(dto.getCodigo());
        a.setCreditos(dto.getCreditos());
        a.setHad(dto.getHad());
        a.setHadhti(dto.getHadhti());
        a.setHti(dto.getHti());
        if (dto.getAreaFormacion() != null)
            a.setAreaFormacion(areaConverter.convert(dto.getAreaFormacion()));
        a.setJustificacion(dto.getJustificacion());
        a.setMetodologia(dto.getMetodologia());
        a.setNombre(dto.getNombre());
        a.setObjetivo(dto.getObjetivo());
        a.setSemestre(dto.getSemestre());
        a.setTipoCredito(dto.getTipoCredito());
        a.setTipoCurso(dto.getTipoCurso());
        a.setPreRequisito(preConverter.convert(dto.getIdPreRequisito()));
        a.setDescargable(dto.getDescargable());
        return a;
    }

    public Asignatura convert(AsignaturaDto dto) {
        Asignatura a = new Asignatura();
        a.setAccFormacionInv(dto.getAccFormacionInv());
        a.setBibliografia(dto.getBibliografia());
        a.setCodigo(dto.getCodigo());
        a.setCreditos(dto.getCreditos());
        a.setHad(dto.getHad());
        a.setHadhti(dto.getHadhti());
        a.setHti(dto.getHti());
        //if(dto.getAreaFormacion()!=null)
        //a.setIdAreaFormacion(dto.getAreaFormacion().getIdAreaFormacion());
        a.setJustificacion(dto.getJustificacion());
        a.setMetodologia(dto.getMetodologia());
        a.setNombre(dto.getNombre());
        a.setObjetivo(dto.getObjetivo());
        a.setSemestre(dto.getSemestre());
        a.setTipoCredito(dto.getTipoCredito());
        a.setTipoCurso(dto.getTipoCurso());
        a.setDescargable(dto.getDescargable());
        //if(dto.getPreRequisito()!=null)
        //a.setIdPreRequisito(dto.getPreRequisito().getIdPreRequisito());
        return a;
    }

}
