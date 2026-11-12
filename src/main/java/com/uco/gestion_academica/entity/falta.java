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

    @Column(length = 250)
    private String motivo;

    @ManyToOne
    @JoinColumn(name = "estudiante_id", nullable = false)
    private estudiante estudiante;

    public falta() {}

    public falta(LocalDate fecha, String motivo, estudiante estudiante) {
        this.fecha = fecha;
        this.motivo = motivo;
        this.estudiante = estudiante;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }

    public String getMotivo() { return motivo; }
    public void setMotivo(String motivo) { this.motivo = motivo; }

    public estudiante getEstudiante() { return estudiante; }
    public void setEstudiante(estudiante estudiante) { this.estudiante = estudiante; }
}