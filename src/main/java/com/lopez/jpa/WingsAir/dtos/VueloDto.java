package com.lopez.jpa.WingsAir.dtos;

import java.time.LocalDateTime;

import com.lopez.jpa.WingsAir.Enum.EstatusVuelo;

public class VueloDto {

    private Long id;

    private String numeroVuelo;

    private Long idAvion;

    private Long IdPiloto;

    private Long IdOrigen;

    private Long IdDstino;

    private LocalDateTime fechaHora;

    private LocalDateTime fechaHoraLlegada;

    private EstatusVuelo estatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public Long getIdAvion() {
        return idAvion;
    }

    public void setIdAvion(Long idAvion) {
        this.idAvion = idAvion;
    }

    public Long getIdPiloto() {
        return IdPiloto;
    }

    public void setIdPiloto(Long idPiloto) {
        IdPiloto = idPiloto;
    }

    public Long getIdOrigen() {
        return IdOrigen;
    }

    public void setIdOrigen(Long idOrigen) {
        IdOrigen = idOrigen;
    }

    public Long getIdDstino() {
        return IdDstino;
    }

    public void setIdDstino(Long idDstino) {
        IdDstino = idDstino;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public LocalDateTime getFechaHoraLlegada() {
        return fechaHoraLlegada;
    }

    public void setFechaHoraLlegada(LocalDateTime fechaHoraLlegada) {
        this.fechaHoraLlegada = fechaHoraLlegada;
    }

    public EstatusVuelo getEstatus() {
        return estatus;
    }

    public void setEstatus(EstatusVuelo estatus) {
        this.estatus = estatus;
    }

}
