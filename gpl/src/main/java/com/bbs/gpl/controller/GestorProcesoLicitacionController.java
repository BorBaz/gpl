package com.bbs.gpl.controller;


import com.bbs.gpl.domain.ProcesoLicitacion;
import com.bbs.gpl.helper.GestorProcesoLicitacionHelper;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("proceso")
public class GestorProcesoLicitacionController {

    @Resource
    GestorProcesoLicitacionHelper gestorProcesoLicitacionHelper;

    @GetMapping("/informar")
    @ResponseStatus(value = HttpStatus.OK)
    public void informar(ProcesoLicitacion procesoLicitacion) {

        boolean resultadoEjecucion = gestorProcesoLicitacionHelper.insertarProcesoLicitacion(procesoLicitacion);
        HttpStatus status = resultadoEjecucion ? HttpStatus.OK : HttpStatus.INTERNAL_SERVER_ERROR;

        // TODO: Devolver el status (?)
    }
}
