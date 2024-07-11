package com.lopez.jpa.WingsAir.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lopez.jpa.WingsAir.dao.IVueloDao;
import com.lopez.jpa.WingsAir.dtos.VueloDto;

import com.lopez.jpa.WingsAir.models.Vuelos;

@Component
public class VueloSerice implements IService<Vuelos, VueloDto> {
    @Autowired
    private IVueloDao vuelosDao;

    @Autowired
    private AvionesService avionesService;

    @Autowired
    private PilotosService pilotosService;

    @Autowired
    private AreopuertoService areopuertoService;

    @Override
    public List<Vuelos> findAll() {

        return vuelosDao.findAll();
    }

    @Override
    public Optional<Vuelos> findById(Long id) {

        return vuelosDao.findById(id);
    }

    @Override
    public void save(VueloDto t) {

        vuelosDao.save(this.toModel(t));

    }

    @Override
    public void deleteById(Long id) {

        vuelosDao.deleteById(id);
    }

    private Vuelos toModel(VueloDto t) {
        Vuelos vuelos = new Vuelos();
        vuelos.setNumeroVuelo(t.getNumeroVuelo());
        vuelos.setAvion(avionesService.findById(t.getIdAvion()).get());
        vuelos.setPiloto(pilotosService.findById(t.getIdPiloto()).get());
        vuelos.setDestino(areopuertoService.findById(t.getIdDstino()).get());
        vuelos.setOrigen(areopuertoService.findById(t.getIdOrigen()).get());
        vuelos.setFechaHora(t.getFechaHora());
        vuelos.setFechaHoraLlegada(t.getFechaHoraLlegada());
        vuelos.setEstatus(t.getEstatus());
        return vuelos;
    }

}
