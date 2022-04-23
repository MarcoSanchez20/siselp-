package edu.elp.siselp.service.impl;

import edu.elp.siselp.dao.IDocenteDao;
import edu.elp.siselp.entity.Docente;
import edu.elp.siselp.service.IDocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocenteServiceImpl implements IDocenteService {

    @Autowired
    private IDocenteDao docenteDao;

    @Override
    public List<Docente> listaDocentes() {

        List<Docente> docenteList= this.docenteDao.findAll();
        for(Docente docente:docenteList){
            System.out.println(docente.toString());
        }
        return docenteList;
    }

    @Override
    public Docente obtenerDocenteByCodigo(String codDocente) {
        return null;
    }
}
