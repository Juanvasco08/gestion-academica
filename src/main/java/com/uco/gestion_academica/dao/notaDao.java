package com.uco.gestion_academica.dao;

import com.uco.gestion_academica.entity.nota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository 
public interface notaDao extends JpaRepository<nota, Long> {

    List<nota> findByestudianteId(long estudianteId);
    
}