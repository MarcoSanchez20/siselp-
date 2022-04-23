package edu.elp.siselp.service;

import edu.elp.siselp.entity.Estudiante;

import java.util.List;

public interface IEstudianteService {

    List<Estudiante> listaEstudiantes();

    Estudiante obtenerEstudianteByCodigo(String codigo);
}
