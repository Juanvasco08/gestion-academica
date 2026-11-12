package com.uco.gestion_academica.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "faltas")
public class falta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDate fecha;

    @Column(nullable = false, length = 50)
    private String tipo;

    @Column(nullable = false, length = 200)
    private String observacion;

    @ManyToOne
    @JoinColumn(name = "estudiante_id", nullable = false)
    private estudiante estudiante;

    public falta() {}

    public falta(LocalDate fecha, String tipo, String observacion, estudiante estudiante) {
        this.fecha = fecha;
        this.tipo = tipo;
        this.observacion = observacion;
        this.estudiante = estudiante;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getObservacion() { return observacion; }
    public void setObservacion(String observacion) { this.observacion = observacion; }

    public estudiante getEstudiante() { return estudiante; }
    public void setEstudiante(estudiante estudiante) { this.estudiante = estudiante; }
}