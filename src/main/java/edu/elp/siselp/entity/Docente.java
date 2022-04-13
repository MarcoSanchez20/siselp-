package edu.elp.siselp.entity;

import javax.persistence.*;

@Entity
@Table(name = "docente")
@PrimaryKeyJoinColumn(referencedColumnName="idpersona")
public class Docente extends Persona{

    @Column(name = "cod_Docente",length = 12)
    private String codDocente;

    public Docente() {
    }

    public String getCodDocente() {
        return codDocente;
    }

    public void setCodDocente(String codDocente) {
        this.codDocente = codDocente;
    }
}
