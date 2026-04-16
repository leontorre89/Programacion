package Colecciones.Simulaciones.Preparatorio;

import java.util.Comparator;

public class ComparadorPorMatricula implements Comparator<Vehiculo> {
    @Override
    public int compare(Vehiculo o1, Vehiculo o2) {
        return o1.getMatricula().compareTo(o2.getMatricula());
    }
}
