package com.lopez.jpa.WingsAir.models;

import java.time.LocalDateTime;

import com.lopez.jpa.WingsAir.Enum.EstatusVuelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "WAir_Vuelos")
@Entity
public class Vuelos {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Wair_seq4")
    @SequenceGenerator(sequenceName = "customer_wair_sq4", allocationSize = 1, name = "Wair_seq4")
    private Long id;

    private String numeroVuelo;

    @ManyToOne
    @JoinColumn(name = "codigoAvion")
    private Aviones avion;
    @ManyToOne
    @JoinColumn(name = "codigoPiloto")
    private Pilotos piloto;

    @ManyToOne
    @JoinColumn(name = "codigoAeropuerto")
    private Areopuertos origen;

    @ManyToOne
    @JoinColumn(name = "codigoAeropuertoDestino")
    private Areopuertos destino;

    private LocalDateTime fechaHora;

    private LocalDateTime fechaHoraLlegada;

    private EstatusVuelo estatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Aviones getAvion() {
        return avion;
    }

    public void setAvion(Aviones avion) {
        this.avion = avion;
    }

    public Pilotos getPiloto() {
        return piloto;
    }

    public void setPiloto(Pilotos piloto) {
        this.piloto = piloto;
    }

    public Areopuertos getOrigen() {
        return origen;
    }

    public void setOrigen(Areopuertos origen) {
        this.origen = origen;
    }

    public Areopuertos getDestino() {
        return destino;
    }

    public void setDestino(Areopuertos destino) {
        this.destino = destino;
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

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

}
