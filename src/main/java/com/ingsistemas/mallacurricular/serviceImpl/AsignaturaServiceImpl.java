package com.ingsistemas.mallacurricular.serviceImpl;

import com.ingsistemas.mallacurricular.converter.AsignaturaConverter;
import com.ingsistemas.mallacurricular.dto.AsignaturaDto;
import com.ingsistemas.mallacurricular.dto.AsignaturaImprimibleDto;
import com.ingsistemas.mallacurricular.entity.AreaFormacion;
import com.ingsistemas.mallacurricular.entity.Asignatura;
import com.ingsistemas.mallacurricular.entity.Unidad;
import com.ingsistemas.mallacurricular.exceptions.ElementoNoEncontradoException;
import com.ingsistemas.mallacurricular.exceptions.ErrorsEnum;
import com.ingsistemas.mallacurricular.exceptions.PropiedadFaltanteException;
import com.ingsistemas.mallacurricular.filters.AsignaturaFilter;
import com.ingsistemas.mallacurricular.repository.AreaFormacionRepository;
import com.ingsistemas.mallacurricular.repository.AsignaturaRepository;
import com.ingsistemas.mallacurricular.repository.PreRequisitoRepository;
import com.ingsistemas.mallacurricular.repository.UnidadRepository;
import com.ingsistemas.mallacurricular.service.AsignaturaService;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * The type Asignatura service.
 */
@Service
public class AsignaturaServiceImpl implements AsignaturaService {
    /**
     * The Repo.
     */
    @Autowired
    AsignaturaRepository repo;
    /**
     * The Converter.
     */
    @Autowired
    AsignaturaConverter converter;
    /**
     * The Area repo.
     */
    @Autowired
    AreaFormacionRepository areaRepo;
    /**
     * The Prere repo.
     */
    @Autowired
    PreRequisitoRepository prereRepo;
    /**
     * The Urepo.
     */
    @Autowired
    UnidadRepository urepo;
    /**
     * The Ruta jasper report.
     */
    @Value("${asignaturaReport.path}")
    String rutaJasperReport;

    @Override
    public AsignaturaDto crearOActualizar(AsignaturaDto dto) throws Exception {

        Asignatura entidad = new Asignatura();
        entidad.setAccFormacionInv(dto.getAccFormacionInv());
        if (dto.getAreaFormacion() != null) {
            if (dto.getAreaFormacion().getIdAreaFormacion() != null) {
                entidad.setAreaFormacion(areaRepo.findById(dto.getAreaFormacion().getIdAreaFormacion()).get());
            } else {
                AreaFormacion af = new AreaFormacion();
                af.setIdAreaFormacion(UUID.randomUUID());
                af.setNombre(dto.getAreaFormacion().getNombre());
                areaRepo.save(af);
            }
        } else {
            throw new PropiedadFaltanteException(ErrorsEnum.MISSING_PROPERTY, "Asignatura", "area de formacion");
        }
        entidad.setBibliografia(dto.getBibliografia());
        entidad.setCodigo(dto.getCodigo());
        entidad.setCreditos(dto.getCreditos());
        entidad.setHad(dto.getHad());
        entidad.setHadhti(dto.getHadhti());
        entidad.setHti(dto.getHti());
        if (dto.getPreRequisito() != null) {
            if (dto.getPreRequisito().getIdPreRequisito() != null) {
                entidad.setIdPreRequisito(prereRepo.findById(dto.getPreRequisito().getIdPreRequisito()).get());
            }
        }
        entidad.setJustificacion(dto.getJustificacion());
        entidad.setMetodologia(dto.getMetodologia());
        entidad.setNombre(dto.getNombre());
        entidad.setObjetivo(dto.getObjetivo());
        entidad.setSemestre(dto.getSemestre());
        entidad.setTipoCredito(dto.getTipoCredito());
        entidad.setTipoCurso(dto.getTipoCurso());
        repo.save(entidad);
        return converter.convert(entidad);
    }

    @Override
    public AsignaturaDto getOne(Integer id) throws Exception {

        return converter.convert(repo.findById(id).get());
    }

    @Override
    public List<AsignaturaDto> getAll() throws Exception {

        return converter.convert(repo.findAll());
    }

    @Override
    public void alternarDescarga(Integer id) {
        Optional<Asignatura> a = repo.findById(id);
        if (a.isEmpty()) {
            throw new ElementoNoEncontradoException(ErrorsEnum.NOT_FOUND, "asignatura", id.toString());
        } else {
            Asignatura as = a.get();
            as.setDescargable(!as.getDescargable());
            repo.save(as);
        }
    }

    @Override
    public List<AsignaturaDto> filter(AsignaturaFilter filter) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void eliminar(Integer id) {
        repo.deleteById(id);

    }

    @Override
    public byte[] imprimir(Integer id) throws JRException, IOException {
        List<AsignaturaImprimibleDto> aa = new ArrayList<AsignaturaImprimibleDto>();
        AsignaturaImprimibleDto ai = new AsignaturaImprimibleDto();
        Optional<Asignatura> ao = repo.findById(id);
        if (ao.isEmpty()) {
            throw new ElementoNoEncontradoException(ErrorsEnum.NOT_FOUND, "asignatura", id.toString());
        } else {
            Asignatura a = ao.get();
            ai.setCodigo(a.getCodigo());
            ai.setNombreAsignatura(a.getNombre());
            ai.setBibliografia(a.getBibliografia());
            ai.setCreditos(a.getCreditos());
            ai.setPreRequisito(a.getPreRequisito() != null ? a.getPreRequisito().getAsignatura() : null);
            ai.setHad(a.getHad());
            ai.setHt(a.getHti());
            ai.setHadhti(a.getHadhti());
            Integer k = Integer.parseInt(a.getHad());
            Integer j = Integer.parseInt(a.getHti());
            Integer x = k + j;
            ai.setTh(x.toString());
            JasperReport compileReport = JasperCompileManager.compileReport(new FileInputStream(rutaJasperReport));
            Unidad ue = new Unidad();
            ue.setAsignatura(a);
            Example<Unidad> example = Example.of(ue);
            List<Unidad> unidades = urepo.findAll(example);
            StringBuilder contenido = new StringBuilder();
            int i = 1;
            String salt = System.getProperty("line.separator");
            for (Unidad unidad : unidades) {

                contenido.append("Unidad " + i + ": " + unidad.getNombre());
                contenido.append(salt);
                i++;
            }

            ai.setContenidoBasico(contenido.toString());

            aa.add(ai);
            JRBeanCollectionDataSource beancollection = new JRBeanCollectionDataSource(aa);
            JasperPrint report = JasperFillManager.fillReport(compileReport, null, beancollection);
            byte[] result = JasperExportManager.exportReportToPdf(report);
            Path path = Paths.get("C:\\Users\\Eduardo\\Documents\\docs\\personal projects\\mallacurricular\\mallacurricular\\target\\temp.pdf");
            Files.write(path, result);
            return result;

        }
    }


}
