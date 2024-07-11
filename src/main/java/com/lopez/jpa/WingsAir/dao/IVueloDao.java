package com.lopez.jpa.WingsAir.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lopez.jpa.WingsAir.models.Vuelos;

public interface IVueloDao extends JpaRepository<Vuelos, Long> {

}
