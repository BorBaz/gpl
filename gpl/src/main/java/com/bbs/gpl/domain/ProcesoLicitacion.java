package com.bbs.gpl.domain;


import java.sql.Timestamp;

public class ProcesoLicitacion {
    private String idSession;
    private String codMaestro;
    private String refExpediente;
    private String refAnotacion;
    private String entidadAfectada;
    private boolean ejecucionCorrecta;
    private String descError;
    private Timestamp fechaHora;

    public ProcesoLicitacion(String idSession, String codMaestro, String refExpediente, String refAnotacion, String entidadAfectada, boolean ejecucionCorrecta, String descError, Timestamp fechaHora) {
        this.idSession = idSession;
        this.codMaestro = codMaestro;
        this.refExpediente = refExpediente;
        this.refAnotacion = refAnotacion;
        this.entidadAfectada = entidadAfectada;
        this.ejecucionCorrecta = ejecucionCorrecta;
        this.descError = descError;
        this.fechaHora = fechaHora;
    }

    public String getIdSession() {
        return idSession;
    }

    public void setIdSession(String idSession) {
        this.idSession = idSession;
    }

    public String getCodMaestro() {
        return codMaestro;
    }

    public void setCodMaestro(String codMaestro) {
        this.codMaestro = codMaestro;
    }

    public String getRefExpediente() {
        return refExpediente;
    }

    public void setRefExpediente(String refExpediente) {
        this.refExpediente = refExpediente;
    }

    public String getRefAnotacion() {
        return refAnotacion;
    }

    public void setRefAnotacion(String refAnotacion) {
        this.refAnotacion = refAnotacion;
    }

    public String getEntidadAfectada() {
        return entidadAfectada;
    }

    public void setEntidadAfectada(String entidadAfectada) {
        this.entidadAfectada = entidadAfectada;
    }

    public boolean isEjecucionCorrecta() {
        return ejecucionCorrecta;
    }

    public void setEjecucionCorrecta(boolean ejecucionCorrecta) {
        this.ejecucionCorrecta = ejecucionCorrecta;
    }

    public String getDescError() {
        return descError;
    }

    public void setDescError(String descError) {
        this.descError = descError;
    }

    public Timestamp getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Timestamp fechaHora) {
        this.fechaHora = fechaHora;
    }
}
