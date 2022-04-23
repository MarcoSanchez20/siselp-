package edu.elp.siselp.dao;

import edu.elp.siselp.entity.Administrativo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAdministrativoDao extends JpaRepository<Administrativo,String> {
}
