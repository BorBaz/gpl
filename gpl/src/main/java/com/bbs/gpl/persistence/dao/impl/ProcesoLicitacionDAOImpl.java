package com.bbs.gpl.persistence.dao.impl;

import com.bbs.gpl.domain.ProcesoLicitacion;
import com.bbs.gpl.persistence.dao.ProcesoLicitacionDAO;

public class ProcesoLicitacionDAOImpl implements ProcesoLicitacionDAO {

    @Override
    public boolean insertarRegistroDeProceso(ProcesoLicitacion procesoLicitacion) {
        return false;
    }

    @Override
    public boolean isRegistroDeProcesoActivo(String codMaestro) {
        return false;
    }
}
