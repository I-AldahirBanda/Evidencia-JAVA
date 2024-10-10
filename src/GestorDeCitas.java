package com.miapp.model;

import java.util.ArrayList;
import java.util.List;

public class GestorDeCitas {
    private List<Cita> citas;

    public GestorDeCitas() {
        this.citas = new ArrayList<>();
    }

    public void crearCita(String idCita, Doctor doctor, Paciente paciente, String fecha, String hora) {
        Cita nuevaCita = new Cita(idCita, doctor, paciente, fecha, hora);
        citas.add(nuevaCita);
        System.out.println("Cita creada: " + nuevaCita);
    }

    public List<Cita> obtenerCitas() {
        return citas;
    }

    public void mostrarCitas() {
        for (Cita cita : citas) {
            System.out.println(cita);
        }
    }
}
