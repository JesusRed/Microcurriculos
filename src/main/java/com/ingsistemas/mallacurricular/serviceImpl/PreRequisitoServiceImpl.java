package com.ingsistemas.mallacurricular.serviceImpl;

import com.ingsistemas.mallacurricular.converter.PreRequisitoConverter;
import com.ingsistemas.mallacurricular.dto.PreRequisitoDto;
import com.ingsistemas.mallacurricular.entity.Asignatura;
import com.ingsistemas.mallacurricular.entity.PreRequisito;
import com.ingsistemas.mallacurricular.exceptions.ElementoNoEncontradoException;
import com.ingsistemas.mallacurricular.exceptions.ErrorsEnum;
import com.ingsistemas.mallacurricular.exceptions.PropiedadFaltanteException;
import com.ingsistemas.mallacurricular.filters.PreRequisitoFilter;
import com.ingsistemas.mallacurricular.repository.AsignaturaRepository;
import com.ingsistemas.mallacurricular.repository.PreRequisitoRepository;
import com.ingsistemas.mallacurricular.service.PreRequisitoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PreRequisitoServiceImpl implements PreRequisitoService {
    @Autowired
    PreRequisitoRepository repo;
    @Autowired
    AsignaturaRepository asirepo;
    @Autowired
    PreRequisitoConverter converter;

    @Override
    public PreRequisitoDto crearOActualizar(PreRequisitoDto entidad) throws Exception {
        PreRequisito p = new PreRequisito();
        p.setCredito(entidad.getCredito());
        if (entidad.getIdPreRequisito() != null) {
            p.setIdPreRequisito(entidad.getIdPreRequisito());
        } else {
            entidad.setIdPreRequisito(UUID.randomUUID());
        }
        if (entidad.getCodigoAsignatura() == null) {
            throw new PropiedadFaltanteException(ErrorsEnum.MISSING_PROPERTY, "prerequisito", "codigo Asignatura");
        }
        Optional<Asignatura> a = asirepo.findById(entidad.getCodigoAsignatura());
        if (a.isEmpty()) {
            throw new ElementoNoEncontradoException(ErrorsEnum.NOT_FOUND, "asignatura", entidad.getCodigoAsignatura().toString());
        } else {
            p.setAsignatura(a.get().getCodigo());
        }
        return converter.convert(repo.save(p));
    }

    @Override
    public PreRequisitoDto getOne(UUID id) throws Exception {
        Optional<PreRequisito> op = repo.findById(id);
        if (op.isEmpty()) {
            throw new ElementoNoEncontradoException(ErrorsEnum.NOT_FOUND, "PreRequisito", id.toString());

        }
        return converter.convert(op.get());
    }

    @Override
    public List<PreRequisitoDto> getAll() throws Exception {
        // TODO Auto-generated method stub
        return converter.convert(repo.findAll());
    }

    @Override
    public List<PreRequisitoDto> filter(PreRequisitoFilter filter) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void eliminar(UUID id) {
        repo.deleteById(id);

    }

}
