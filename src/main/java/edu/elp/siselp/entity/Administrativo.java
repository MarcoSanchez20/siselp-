package edu.elp.siselp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "administrador")
@PrimaryKeyJoinColumn(referencedColumnName="idpersona")
public class Administrativo {

    @Column(name = "area_labor",length = 50, nullable = false)
    private String areaLabor;

    @Column(name = "cod_admin",length = 12)
    private String codAdmin;

    public Administrativo() {
    }

    public String getAreaLabor() {
        return areaLabor;
    }

    public void setAreaLabor(String areaLabor) {
        this.areaLabor = areaLabor;
    }

    public String getCodAdmin() {
        return codAdmin;
    }

    public void setCodAdmin(String codAdmin) {
        this.codAdmin = codAdmin;
    }
}
