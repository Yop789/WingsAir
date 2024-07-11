package com.lopez.jpa.WingsAir.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lopez.jpa.WingsAir.dao.IAvionesDao;
import com.lopez.jpa.WingsAir.dtos.AvionesDto;
import com.lopez.jpa.WingsAir.models.Aviones;

@Component
public class AvionesService implements IService<Aviones, AvionesDto> {
    @Autowired
    private IAvionesDao avionesDao;

    @Override
    public List<Aviones> findAll() {

        return avionesDao.findAll();
    }

    @Override
    public Optional<Aviones> findById(Long id) {
        Optional<Aviones> aviones = avionesDao.findById(id);
        return aviones;
    }

    @Override
    public void save(AvionesDto t) {
        System.out.println("-----------------" + t.getCapacidadPasajeros());
        Aviones aviones = new Aviones();
        aviones.setCodigoAvion(t.getCodigoAvion());
        aviones.setTipoAvion(t.getTipoAvion());
        aviones.setHorasVuelo(t.getHorasVuelo());
        aviones.setCapacidadPasajeros(t.getCapacidadPasajeros());
        if (t.getId() != null) {
            aviones.setId(t.getId());

        }
        avionesDao.save(aviones);

    }

    @Override
    public void deleteById(Long id) {
        avionesDao.deleteById(id);
    }

}
