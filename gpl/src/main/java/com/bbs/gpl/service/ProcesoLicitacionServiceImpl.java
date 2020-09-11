package com.bbs.gpl.service;

import com.bbs.gpl.domain.ProcesoLicitacion;
import org.springframework.stereotype.Service;

@Service
public class ProcesoLicitacionServiceImpl implements ProcesoLicitacionService {

    @Override
    public boolean insertarRegistroDeProceso(ProcesoLicitacion procesoLicitacion) {
        return false;
    }

    @Override
    public boolean isRegistroDeProcesoActivo(String codMaestro) {
        return false;
    }
}
