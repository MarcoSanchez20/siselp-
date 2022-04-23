package edu.elp.siselp.service.impl;

import edu.elp.siselp.dao.IAdministrativoDao;
import edu.elp.siselp.entity.Administrativo;
import edu.elp.siselp.service.IAdministrativoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministrativoServiceImpl implements IAdministrativoService {

    @Autowired
    private IAdministrativoDao administrativoDao;

    @Override
    public List<Administrativo> listaAdministrativo() {

        List<Administrativo> AdministrativoList = this.administrativoDao.findAll();

        for(Administrativo Administrativo:AdministrativoList ){
            System.out.println(Administrativo.toString());
        }
        return AdministrativoList;
    }
}
