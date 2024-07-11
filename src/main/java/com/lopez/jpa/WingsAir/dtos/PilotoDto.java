package com.lopez.jpa.WingsAir.dtos;

import java.time.LocalTime;

public class PilotoDto {
    private Long id;

    private String codigoPiloto;
    private String nombreCompleto;
    private char sexo;
    private LocalTime horasVuelo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigoPiloto() {
        return codigoPiloto;
    }

    public void setCodigoPiloto(String codigoPiloto) {
        this.codigoPiloto = codigoPiloto;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public LocalTime getHorasVuelo() {
        return horasVuelo;
    }

    public void setHorasVuelo(LocalTime horasVuelo) {
        this.horasVuelo = horasVuelo;
    }

}
