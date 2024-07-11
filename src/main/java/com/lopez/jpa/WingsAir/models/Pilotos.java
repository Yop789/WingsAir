package com.lopez.jpa.WingsAir.models;

import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "WAir_Pilotos")
public class Pilotos {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Wair_seq2")
    @SequenceGenerator(sequenceName = "customer_wair_sq2", allocationSize = 1, name = "Wair_seq2")
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
