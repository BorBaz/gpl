package com.bbs.gpl.service;

import com.bbs.gpl.domain.ProcesoLicitacion;

public interface ProcesoLicitacionService {

    boolean insertarRegistroDeProceso(ProcesoLicitacion procesoLicitacion);

    boolean isRegistroDeProcesoActivo(String codMaestro);
}
