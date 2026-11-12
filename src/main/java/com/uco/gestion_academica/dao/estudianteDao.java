package com.uco.gestion_academica.dao;

import com.uco.gestion_academica.entity.estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface estudianteDao extends JpaRepository<estudiante, Long> {

    Optional<estudiante> findByCedula(String cedula);

    boolean existsByCedula(String cedula);
}