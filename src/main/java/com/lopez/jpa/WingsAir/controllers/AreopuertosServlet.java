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

import com.lopez.jpa.WingsAir.dtos.AreopuertosDto;
import com.lopez.jpa.WingsAir.models.Areopuertos;
import com.lopez.jpa.WingsAir.services.IService;

@RequestMapping("api/areopuertos")
@RestController
public class AreopuertosServlet implements IControllers<Areopuertos, AreopuertosDto> {

    @Autowired
    IService<Areopuertos, AreopuertosDto> areopuertosService;

    @PostMapping
    @Override
    public ResponseEntity<?> guardar(@RequestBody AreopuertosDto dto) {
        areopuertosService.save(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(dto);
    }

    @GetMapping
    @Override
    public ResponseEntity<List<Areopuertos>> findAll() {

        List<Areopuertos> areopuertos = areopuertosService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(areopuertos);
    }

    @GetMapping("/{id}")
    @Override
    public ResponseEntity<Areopuertos> findById(@PathVariable(name = "id") Long id) {

        Areopuertos areopuertos = areopuertosService.findById(id).get();
        return ResponseEntity.status(HttpStatus.OK).body(areopuertos);

    }

    @DeleteMapping("/{id}")
    @Override
    public ResponseEntity<?> deleteById(@PathVariable(name = "id") Long id) {

        areopuertosService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body(id);
    }

    @PutMapping
    @Override
    public ResponseEntity<?> update(@RequestBody AreopuertosDto dto) {

        areopuertosService.save(dto);
        return ResponseEntity.status(HttpStatus.OK).body(dto);
    }

}
