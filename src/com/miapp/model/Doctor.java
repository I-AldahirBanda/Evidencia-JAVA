package com.miapp.model;

public class Doctor {
    private String idDoctor;
    private String nombre;

    public Doctor(String idDoctor, String nombre) {
        this.idDoctor = idDoctor;
        this.nombre = nombre;
    }

    // Getters y setters
    public String getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(String idDoctor) {
        this.idDoctor = idDoctor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "idDoctor='" + idDoctor + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
