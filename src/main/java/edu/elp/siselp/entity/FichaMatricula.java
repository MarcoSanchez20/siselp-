package edu.elp.siselp.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "matricula")
public class FichaMatricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idfichamatricula;

    @Column(name = "semestre", length = 50)
    private String semestre;

    private String anioacademico;

    private String fmatricula;

    private String idestudiante;

    private String idasignatura;



    public FichaMatricula() {
    }

    public FichaMatricula(Long idfichamatricula) {
        this.idfichamatricula = idfichamatricula;
    }

    public FichaMatricula(String semestre, String anioacademico, String fmatricula, String idestudiante, String idasignatura, List<Estudiante> estudianteLis) {
        this.semestre = semestre;
        this.anioacademico = anioacademico;
        this.fmatricula = fmatricula;
        this.idestudiante = idestudiante;
        this.idasignatura = idasignatura;

    }

    public Long getIdfichamatricula() {
        return idfichamatricula;
    }

    public void setIdfichamatricula(Long idfichamatricula) {
        this.idfichamatricula = idfichamatricula;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getAnioacademico() {
        return anioacademico;
    }

    public void setAnioacademico(String anioacademico) {
        this.anioacademico = anioacademico;
    }

    public String getFmatricula() {
        return fmatricula;
    }

    public void setFmatricula(String fmatricula) {
        this.fmatricula = fmatricula;
    }

    public String getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(String idestudiante) {
        this.idestudiante = idestudiante;
    }

    public String getIdasignatura() {
        return idasignatura;
    }

    public void setIdasignatura(String idasignatura) {
        this.idasignatura = idasignatura;
    }


}