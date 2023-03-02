package com.ingsistemas.mallacurricular.serviceImpl;

import com.ingsistemas.mallacurricular.converter.ProgramaAcademicoConverter;
import com.ingsistemas.mallacurricular.dto.ProgramaAcademicoDto;
import com.ingsistemas.mallacurricular.entity.Persona;
import com.ingsistemas.mallacurricular.entity.ProgramaAcademico;
import com.ingsistemas.mallacurricular.exceptions.ElementoNoEncontradoException;
import com.ingsistemas.mallacurricular.exceptions.ErrorsEnum;
import com.ingsistemas.mallacurricular.filters.ProgramaAcademicoFilter;
import com.ingsistemas.mallacurricular.repository.PersonaRepository;
import com.ingsistemas.mallacurricular.repository.ProgramaAcademicoRepository;
import com.ingsistemas.mallacurricular.service.ProgramaAcademicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProgramaAcademicoServiceImpl implements ProgramaAcademicoService {
    @Autowired
    ProgramaAcademicoConverter converter;
    @Autowired
    PersonaRepository personaRepository;
    @Autowired
    ProgramaAcademicoRepository repo;

    @Override
    public ProgramaAcademicoDto crearOActualizar(ProgramaAcademicoDto dto) throws Exception {
        ProgramaAcademico entidad = new ProgramaAcademico();
        if (dto.getIdPrograma() != null) {
            entidad.setIdPrograma(dto.getIdPrograma());
        } else {
            entidad.setIdPrograma(UUID.randomUUID());
        }
        entidad.setNombre(dto.getNombre());
        try {
            entidad.setPersona(personaRepository.findById(dto.getDirectorId()).get());
        } catch (NoSuchElementException exception) {
            throw new ElementoNoEncontradoException(ErrorsEnum.NOT_FOUND_DIRECTOR, "director", dto.getDirectorId().toString());
        }

        return converter.convert((repo).save(entidad));
    }

    @Override

    public ProgramaAcademicoDto getOne(UUID id) throws Exception {
        Optional<ProgramaAcademico> op = repo.findById(id);
        if (op.isPresent()) return converter.convert(op.get());
        else return null;
    }

    @Override
    public List<ProgramaAcademicoDto> getAll() throws Exception {
        return converter.convert(repo.findAll());
    }

    @Override
    @Deprecated
    public List<ProgramaAcademicoDto> filter(ProgramaAcademicoFilter filter) throws Exception {
        return null;
    }


    @Override
    public void eliminar(UUID id) {
        repo.deleteById(id);

    }

    @Override
    public List<ProgramaAcademicoDto> filtrarPorDirector(Integer docenteId) {
        return converter.convert(repo.getByDirector(docenteId));

    }

    @Override
    public List<ProgramaAcademicoDto> filtrarPorNombre(String nombre) {
        return converter.convert(repo.getByNombre(nombre));

    }

    public void asignarDirector(UUID id, Integer docenteId) throws Exception {
        Optional<ProgramaAcademico> pa = repo.findById(id);
        Optional<Persona> per = personaRepository.findById(docenteId);
        if (!pa.isPresent())
            throw new ElementoNoEncontradoException(ErrorsEnum.NOT_FOUND, "programaAcademico", id.toString());
        if (!per.isPresent())
            throw new ElementoNoEncontradoException(ErrorsEnum.NOT_FOUND, "persona", docenteId.toString());
        ProgramaAcademico programaAcademico = pa.get();
        programaAcademico.setPersona(per.get());


    }

}
