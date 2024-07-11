package com.lopez.jpa.WingsAir.models;

import java.time.LocalTime;

import com.lopez.jpa.WingsAir.Enum.TipoAviones;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "WAir_clientes")
@Entity
public class Aviones {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Wair_seq1")
    @SequenceGenerator(sequenceName = "customer_wair_sq1", allocationSize = 1, name = "Wair_seq1")
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
