package com.uco.gestion_academica.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "estudiantes")
public class estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 20)
    private String cedula;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false, unique = true, length = 150)
    private String correo;

    @Column(nullable = false, length = 50)
    private String semestre;

    public estudiante() {}

    public estudiante(String cedula, String nombre, String correo, String semestre) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.correo = correo;
        this.semestre = semestre;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCedula() { return cedula; }
    public void setCedula(String cedula) { this.cedula = cedula; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getSemestre() { return semestre; }
    public void setSemestre(String semestre) { this.semestre = semestre; }
}