package com.lopez.jpa.WingsAir.dtos;

import java.time.LocalTime;

import com.lopez.jpa.WingsAir.Enum.TipoAviones;

public class AvionesDto {
    private Long id;

    private String codigoAvion;
    private TipoAviones tipoAvion;
    private LocalTime horasVuelo;
    private int capacidadPasajeros;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigoAvion() {
        return codigoAvion;
    }

    public void setCodigoAvion(String codigoAvion) {
        this.codigoAvion = codigoAvion;
    }

    public TipoAviones getTipoAvion() {
        return tipoAvion;
    }

    public void setTipoAvion(TipoAviones tipoAvion) {
        this.tipoAvion = tipoAvion;
    }

    public LocalTime getHorasVuelo() {
        return horasVuelo;
    }

    public void setHorasVuelo(LocalTime horasVuelo) {
        this.horasVuelo = horasVuelo;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

}
