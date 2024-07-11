package com.lopez.jpa.WingsAir.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lopez.jpa.WingsAir.dtos.PilotoDto;
import com.lopez.jpa.WingsAir.models.Pilotos;
import com.lopez.jpa.WingsAir.services.IService;

@RestController
@RequestMapping("api/pilotos")
public class PilotosServlet implements IControllers<Pilotos, PilotoDto> {
    @Autowired
    IService<Pilotos, PilotoDto> pilotosService;

    @PostMapping
    @Override
    public ResponseEntity<?> guardar(@RequestBody PilotoDto dto) {

        this.pilotosService.save(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(dto);
    }

    @GetMapping
    @Override
    public ResponseEntity<List<Pilotos>> findAll() {

        List<Pilotos> pilotos = this.pilotosService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(pilotos);
    }

    @GetMapping("/{id}")
    @Override
    public ResponseEntity<Pilotos> findById(@PathVariable(name = "id") Long id) {

        Pilotos pilotos = this.pilotosService.findById(id).get();
        return ResponseEntity.status(HttpStatus.OK).body(pilotos);
    }

    @DeleteMapping("/{id}")
    @Override
    public ResponseEntity<?> deleteById(@PathVariable(name = "id") Long id) {

        this.pilotosService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body(id);
    }

    @PutMapping
    @Override
    public ResponseEntity<?> update(@RequestBody PilotoDto dto) {

        this.pilotosService.save(dto);
        return ResponseEntity.status(HttpStatus.OK).body(dto);
    }

}
