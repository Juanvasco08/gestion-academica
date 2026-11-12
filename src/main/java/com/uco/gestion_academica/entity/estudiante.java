package com.uco.gestion_academica.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "estudiantes")
public class estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false, unique = true, length = 150)
    private String correo;

    @Column (nullable = false, unique = true, length = 100)
    private String cedula;

    @Column(nullable = false, length = 100)
    private String programa;

    public estudiante() {}

    public estudiante(String nombre, String correo,String cedula, String programa) {
        this.nombre = nombre;
        this.correo = correo;
        this.cedula = cedula;
        this.programa = programa;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getCedula() { return cedula; }
    public void setCedula(String cedula) { this.cedula = cedula; }

    public String getPrograma() { return programa; }
    public void setPrograma(String programa) { this.programa = programa; }
}