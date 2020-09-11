package com.bbs.gpl.persistence.dao;

import com.bbs.gpl.domain.ProcesoLicitacion;

public interface ProcesoLicitacionDAO {

    boolean insertarRegistroDeProceso(ProcesoLicitacion procesoLicitacion);

    boolean isRegistroDeProcesoActivo(String codMaestro);
}
