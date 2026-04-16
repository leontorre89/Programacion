package Colecciones.Simulaciones.PreparatorioColecciones.Controller;

import Colecciones.Simulaciones.PreparatorioColecciones.Models.RepoVehiculo;
import Colecciones.Simulaciones.PreparatorioColecciones.Models.Vehiculo;

import java.time.LocalDate;

public class GestionaVehiculos {
    static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("12345", "1830BJF", LocalDate.now(), "Adrian");
        Vehiculo v2 = new Vehiculo("12345", "2746WAZ", LocalDate.now(), "Adrian");
        RepoVehiculo r = new RepoVehiculo();
        r.registrarVehiculo(v1);
        r.registrarMatriculacion(v2);
        r.buscarVehiculo("12345");
        r.mostrarVehiculo("Adrian");
    }
}
