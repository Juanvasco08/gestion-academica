package com.uco.gestion_academica.dao;

import com.uco.gestion_academica.entity.profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface profesorDao extends JpaRepository<profesor, Long> {

    Optional<profesor> findByCedula(String cedula);

    boolean existsByCedula(String cedula);
}
