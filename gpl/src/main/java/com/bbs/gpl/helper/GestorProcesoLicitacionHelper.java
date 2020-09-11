package com.bbs.gpl.helper;

import com.bbs.gpl.domain.ProcesoLicitacion;
import com.bbs.gpl.service.ProcesoLicitacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GestorProcesoLicitacionHelper {

    @Autowired
    ProcesoLicitacionService procesoLicitacionService;

    public boolean insertarProcesoLicitacion(ProcesoLicitacion procesoLicitacion) {

        boolean resultadoEjecucion = Boolean.FALSE;

        if (registroDelMaestroEstaActivado(procesoLicitacion)) {
            resultadoEjecucion = procesoLicitacionService.insertarRegistroDeProceso(procesoLicitacion);
        }
        return resultadoEjecucion;
    }

    private boolean registroDelMaestroEstaActivado(ProcesoLicitacion procesoLicitacion) {
        boolean registroActivo = Boolean.FALSE;

        if (procesoLicitacion != null && !procesoLicitacion.getCodMaestro().isEmpty()) {
            registroActivo = procesoLicitacionService.isRegistroDeProcesoActivo(procesoLicitacion.getCodMaestro());
        }
        return registroActivo;
    }
}
