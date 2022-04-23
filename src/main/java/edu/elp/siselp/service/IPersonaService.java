package edu.elp.siselp.service;

import edu.elp.siselp.entity.Persona;

import java.util.List;

public interface IPersonaService {

    //Listar personas
    List<Persona> listaPersonas();

    //Buscar persona por su dni
    Persona obtenerPersonaByDni(String dni);

    //TAREA
    //1: listar estudiantes
    //2: listar docentes
    //3: listar administrativos
    //4: Buscar estudiante por codigo

    //FECHA DE ENTREGA: 26 de abril hasta las 11:59pm
}
