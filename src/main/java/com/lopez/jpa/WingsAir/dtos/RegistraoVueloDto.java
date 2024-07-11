package com.lopez.jpa.WingsAir.dtos;

import java.time.LocalTime;

public class RegistraoVueloDto {
    private Long id;
    private Long IdVuelo;
    private LocalTime horasVuelo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdVuelo() {
        return IdVuelo;
    }

    public void setIdVuelo(Long idVuelo) {
        IdVuelo = idVuelo;
    }

    public LocalTime getHorasVuelo() {
        return horasVuelo;
    }

    public void setHorasVuelo(LocalTime horasVuelo) {
        this.horasVuelo = horasVuelo;
    }

}
