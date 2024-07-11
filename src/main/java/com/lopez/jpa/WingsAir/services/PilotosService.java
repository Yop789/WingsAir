package com.lopez.jpa.WingsAir.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lopez.jpa.WingsAir.dao.IPilotosDao;
import com.lopez.jpa.WingsAir.dtos.PilotoDto;
import com.lopez.jpa.WingsAir.models.Pilotos;

@Component
public class PilotosService implements IService<Pilotos, PilotoDto> {
    @Autowired
    private IPilotosDao pilotosDao;

    @Override
    public List<Pilotos> findAll() {

        return pilotosDao.findAll();
    }

    @Override
    public Optional<Pilotos> findById(Long id) {
        Optional<Pilotos> pilotos = pilotosDao.findById(id);
        return pilotos;
    }

    @Override
    public void save(PilotoDto t) {
        Pilotos pilotos = new Pilotos();
        pilotos.setCodigoPiloto(t.getCodigoPiloto());
        pilotos.setNombreCompleto(t.getNombreCompleto());
        pilotos.setSexo(t.getSexo());
        pilotos.setHorasVuelo(t.getHorasVuelo());

        pilotosDao.save(pilotos);
    }

    @Override
    public void deleteById(Long id) {
        pilotosDao.deleteById(id);
    }

}
