package com.lopez.jpa.WingsAir.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lopez.jpa.WingsAir.dao.IRegistrarVueloDao;
import com.lopez.jpa.WingsAir.dtos.RegistraoVueloDto;
import com.lopez.jpa.WingsAir.models.RegistroVuelos;
import com.lopez.jpa.WingsAir.models.Vuelos;

@Component
public class RegistrarVuelosService implements IService<RegistroVuelos, RegistraoVueloDto> {
    @Autowired
    private IRegistrarVueloDao registrarVueloDao;

    @Autowired
    private VueloSerice vuelosService;

    @Override
    public List<RegistroVuelos> findAll() {

        return registrarVueloDao.findAll();
    }

    @Override
    public Optional<RegistroVuelos> findById(Long id) {

        return registrarVueloDao.findById(id);
    }

    @Override
    public void save(RegistraoVueloDto t) {

        RegistroVuelos registroVuelos = new RegistroVuelos();
        registroVuelos.setVuelo(optenrVuelo(t.getIdVuelo()));
        registroVuelos.setHorasVuelo(t.getHorasVuelo());
        registrarVueloDao.save(registroVuelos);

    }

    @Override
    public void deleteById(Long id) {

        registrarVueloDao.deleteById(id);
    }

    private Vuelos optenrVuelo(Long id) {
        return vuelosService.findById(id).get();
    }

}
