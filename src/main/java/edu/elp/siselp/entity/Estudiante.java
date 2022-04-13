package edu.elp.siselp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "estudiante")
@PrimaryKeyJoinColumn(referencedColumnName="idpersona")
public class Estudiante extends Persona {

    @Column(name = "codigo", length = 10, nullable = false)
    private String codigo;

    @Column(name = "serie",length = 8)
    private String serie;

    @Column(name = "estado_egreso", length = 5)
    private String estadoEgreso; //si es egresado: SI, NO

    public Estudiante() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getEstadoEgreso() {
        return estadoEgreso;
    }

    public void setEstadoEgreso(String estadoEgreso) {
        this.estadoEgreso = estadoEgreso;
    }
}
