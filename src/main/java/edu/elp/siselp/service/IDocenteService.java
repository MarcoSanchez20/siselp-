package edu.elp.siselp.service;

import edu.elp.siselp.entity.Docente;

import java.util.List;

public interface IDocenteService {

    //Listar Docentes
    List<Docente> listaDocentes();

    //Buscar docente por su codigo
    Docente obtenerDocenteByCodigo(String codDocente);
}
