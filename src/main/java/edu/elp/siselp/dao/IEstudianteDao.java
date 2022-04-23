package edu.elp.siselp.dao;

import edu.elp.siselp.entity.Estudiante;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IEstudianteDao extends JpaRepository<Estudiante,String> {

    @Query("SELECT p FROM Estudiante p WHERE p.codigo = ?1")
    Estudiante buscarEstudiante(String codigo);

    Estudiante findByDni(String codigo);

    @Query("SELECT p FROM Estudiante p WHERE p.nombre = ?1 AND p.apellido = ?2")
    Estudiante findByNombreAndApellido(String nombre, String apellido);

    @Query("SELECT p FROM Estudiante p WHERE p.nombre = :nombre AND p.apellido = :apellido")
    Estudiante findByNombreAndApellidoByParam(@Param("nombre") String nombre, @Param("apellido") String apellido);
}
