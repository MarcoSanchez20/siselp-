package edu.elp.siselp.service.impl;

import edu.elp.siselp.dao.IEstudianteDao;
import edu.elp.siselp.entity.Estudiante;
import edu.elp.siselp.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServiceImpl implements IEstudianteService {

    @Autowired
    private IEstudianteDao estudianteDao;

    @Override
    public List<Estudiante> listaEstudiantes() {

        List<Estudiante> EstudianteList = this.estudianteDao.findAll();

        for(Estudiante Estudiante:EstudianteList){
            System.out.println(Estudiante.toString());
        }
        return EstudianteList;
    }

    @Override
    public Estudiante obtenerEstudianteByCodigo(String codigo) {

        return this.estudianteDao.buscarEstudiante(codigo);
    }
}
