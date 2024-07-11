package com.lopez.jpa.WingsAir.models;

import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "WAir_RegistroVuelos")
public class RegistroVuelos {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Wair_seq5")
    @SequenceGenerator(sequenceName = "customer_wair_sq5", allocationSize = 1, name = "Wair_seq5")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "numero_vuelo")
    private Vuelos vuelo;
    private LocalTime horasVuelo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Vuelos getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelos vuelo) {
        this.vuelo = vuelo;
    }

    public LocalTime getHorasVuelo() {
        return horasVuelo;
    }

    public void setHorasVuelo(LocalTime horasVuelo) {
        this.horasVuelo = horasVuelo;
    }

}
