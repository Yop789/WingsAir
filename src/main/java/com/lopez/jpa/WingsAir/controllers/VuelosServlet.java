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

import com.lopez.jpa.WingsAir.dtos.VueloDto;
import com.lopez.jpa.WingsAir.models.Vuelos;
import com.lopez.jpa.WingsAir.services.IService;

@RestController
@RequestMapping("api/vuelos")
public class VuelosServlet implements IControllers<Vuelos, VueloDto> {

    @Autowired
    IService<Vuelos, VueloDto> vuelosService;

    @PostMapping
    @Override
    public ResponseEntity<?> guardar(@RequestBody VueloDto dto) {

        this.vuelosService.save(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(dto);
    }

    @GetMapping
    @Override
    public ResponseEntity<List<Vuelos>> findAll() {

        List<Vuelos> vuelos = this.vuelosService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(vuelos);
    }

    @GetMapping("/{id}")
    @Override
    public ResponseEntity<Vuelos> findById(@PathVariable(name = "id") Long id) {
        Vuelos vuelos = this.vuelosService.findById(id).get();
        return ResponseEntity.status(HttpStatus.OK).body(vuelos);
    }

    @DeleteMapping("/{id}")
    @Override
    public ResponseEntity<?> deleteById(@PathVariable(name = "id") Long id) {

        this.vuelosService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body(id);
    }

    @PutMapping
    @Override
    public ResponseEntity<?> update(VueloDto dto) {

        this.vuelosService.save(dto);
        return ResponseEntity.status(HttpStatus.OK).body(dto);
    }

}
