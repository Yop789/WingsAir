package com.lopez.jpa.WingsAir.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lopez.jpa.WingsAir.models.RegistroVuelos;

public interface IRegistrarVueloDao extends JpaRepository<RegistroVuelos, Long> {

}
