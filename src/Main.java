public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Dr001", "Juan Pérez");
        Paciente paciente = new Paciente("Pa001", "Ana García");

        GestorDeCitas gestorCitas = new GestorDeCitas();
        gestorCitas.crearCita("Cita001", doctor, paciente, "2024-10-10", "10:00 AM");

        gestorCitas.mostrarCitas();
    }
}
