package Colecciones.Simulaciones.Preparatorio;

import java.time.LocalDate;

public class Gestiona {
    static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("12345", "1872BHF", LocalDate.of(2024, 4, 14), "Adrian");
        Vehiculo v2 = new Vehiculo("12345", "1872AFH", LocalDate.of(2026, 1, 13), "Adrian");
        Vehiculo v3 = new Vehiculo("12345", "1872OPQ", LocalDate.of(2023, 3, 2), "Adrian");
        RepoVehiculo r = new RepoVehiculo();
        r.registrarVehiculo(v1);
        r.registrarMatriculacion(v2);
        r.registrarMatriculacion(v3);
        r.mostrarRematriculaciones("12345");
    }
}
