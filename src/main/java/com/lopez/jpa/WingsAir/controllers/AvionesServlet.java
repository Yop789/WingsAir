package com.lopez.jpa.WingsAir.controllers;

import java.util.ArrayList;
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

import com.lopez.jpa.WingsAir.Enum.TipoAviones;
import com.lopez.jpa.WingsAir.dtos.AvionesDto;
import com.lopez.jpa.WingsAir.models.Aviones;
import com.lopez.jpa.WingsAir.services.IService;

@RestController
@RequestMapping("api/aviones")
public class AvionesServlet implements IControllers<Aviones, AvionesDto> {

    @Autowired
    IService<Aviones, AvionesDto> avionesService;

    @PostMapping
    @Override
    public ResponseEntity<?> guardar(@RequestBody AvionesDto dto) {

        this.avionesService.save(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(dto);

    }

    @GetMapping
    @Override
    public ResponseEntity<List<Aviones>> findAll() {

        List<Aviones> aviones = this.avionesService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(aviones);
    }

    @GetMapping("/{id}")
    @Override
    public ResponseEntity<Aviones> findById(@PathVariable(name = "id") Long id) {

        Aviones aviones = this.avionesService.findById(id).get();
        return ResponseEntity.status(HttpStatus.OK).body(aviones);
    }

    @DeleteMapping("/{id}")
    @Override
    public ResponseEntity<?> deleteById(@PathVariable(name = "id") Long id) {

        this.avionesService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body(id);
    }

    @PutMapping
    @Override
    public ResponseEntity<?> update(@RequestBody AvionesDto dto) {
        this.avionesService.save(dto);
        return ResponseEntity.status(HttpStatus.OK).body(dto);
    }

    @GetMapping("/tipos")
    public ResponseEntity<List<String>> getTipos() {
        List<String> tipos = new ArrayList<>();
        for (TipoAviones tipo : TipoAviones.values()) {
            tipos.add(tipo.name());
        }
        return ResponseEntity.status(HttpStatus.OK).body(tipos);
    }

}
