package com.uco.gestion_academica.dao;

import com.uco.gestion_academica.entity.falta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface faltaDao extends JpaRepository<falta, Long> {

    // Buscar todas las faltas asociadas al ID de un estudiante específico
    List<falta> findByestudianteId(Long estudianteId);
}