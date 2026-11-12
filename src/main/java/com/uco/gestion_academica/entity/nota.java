package com.uco.gestion_academica.entity;

import jakarta.persistence.*;

@Entity 
@Table(name = "notas")
public class nota {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private double valor;

    @Column(nullable = false, length = 50)
    private String tipo;

    @Column(nullable = false, length = 200)
    private String observacion;


    @ManyToOne 
    @JoinColumn(name = "estudiante_id", nullable = false)
    private estudiante estudiante;
    public nota() {}

    public nota(double valor, String tipo, String observacion, estudiante estudiante ) {
        this.valor = valor;
        this.tipo = tipo;
        this.observacion = observacion;
        this.estudiante = estudiante;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Double getValor() { return valor; }
    public void setValor(Double valor) { this.valor = valor; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getObservacion() { return observacion; }
    public void setObservacion(String observacion) { this.observacion = observacion; }

    public estudiante getEstudiante() { return estudiante; }
    public void setEstudiante(estudiante estudiante) { this.estudiante = estudiante; }

}