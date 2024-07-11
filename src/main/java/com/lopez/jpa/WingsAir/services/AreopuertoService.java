package com.lopez.jpa.WingsAir.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lopez.jpa.WingsAir.dao.IAreopuertoDao;
import com.lopez.jpa.WingsAir.dtos.AreopuertosDto;
import com.lopez.jpa.WingsAir.models.Areopuertos;

@Component
public class AreopuertoService implements IService<Areopuertos, AreopuertosDto> {

    @Autowired
    private IAreopuertoDao areopuertoDao;

    @Override
    public List<Areopuertos> findAll() {
        return areopuertoDao.findAll();
    }

    @Override
    public Optional<Areopuertos> findById(Long id) {
        return areopuertoDao.findById(id);
    }

    @Override
    public void save(AreopuertosDto t) {
        try {
            Areopuertos areopuerto = new Areopuertos();
            areopuerto.setCodigo(t.getCodigoAeropuerto());
            areopuerto.setNombre(t.getNombreAeropuerto());
            areopuerto.setMunicipio(t.getMunicipio());
            areopuerto.setEstado(t.getEstado());
            areopuerto.setPais(t.getPais());
            areopuerto.setHorasVuelo(t.getHorasVuelo());

            areopuertoDao.save(areopuerto);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void deleteById(Long id) {
        areopuertoDao.deleteById(id);
    }

}
