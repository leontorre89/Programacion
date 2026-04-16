package Colecciones.Simulaciones.Preparatorio;

import java.util.Comparator;

public class ComparadorPorFecha implements Comparator<Vehiculo> {
    @Override
    public int compare(Vehiculo o1, Vehiculo o2) {
        return o2.getFechaMatriculacion().compareTo(o1.getFechaMatriculacion());
    }
}
