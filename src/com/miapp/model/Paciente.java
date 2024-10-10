package com.miapp.model;

public class Paciente {
    private String idPaciente;
    private String nombre;

    public Paciente(String idPaciente, String nombre) {
        this.idPaciente = idPaciente;
        this.nombre = nombre;
    }

    // Getters y setters
    public String getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "idPaciente='" + idPaciente + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
