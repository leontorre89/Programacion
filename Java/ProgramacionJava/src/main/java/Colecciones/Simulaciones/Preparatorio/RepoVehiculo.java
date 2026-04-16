package Colecciones.Simulaciones.Preparatorio;

import java.util.*;

public class RepoVehiculo {
    Map<String, List<Vehiculo>> mapa = new HashMap<>();

    public void registrarVehiculo(Vehiculo vehiculo) {
        if (!mapa.containsKey(vehiculo.getIdBastidor())) {
            List<Vehiculo> vehiculos = new ArrayList<>();
            mapa.put(vehiculo.getIdBastidor(), vehiculos);
            vehiculos.add(vehiculo);
            System.out.println("El mapa no contiene el vehiculo, añadiendo vehiculo al mapa");
        } else {
            List<Vehiculo> lista = mapa.get(vehiculo.getIdBastidor());
            lista.add(vehiculo);
            System.out.println("El mapa contiene el vehiculo, añadiendo vehiculo al mapa");
        }
    }

    public void registrarMatriculacion(Vehiculo vehiculo) {
        if (!mapa.containsKey(vehiculo.getIdBastidor())) {
            System.out.println("No existe este vehiculo en el mapa");
        } else {
            List<Vehiculo> lista = mapa.get(vehiculo.getIdBastidor());
            lista.add(vehiculo);
            System.out.println("Registrando nueva matricula al vehiculo");
        }
    }

    public void buscarVehiculo(String bastidor) {
        if (mapa.containsKey(bastidor)) {
            List<Vehiculo> lista = mapa.get(bastidor);
            for (Vehiculo v : lista) {
                System.out.println(v);
            }
        } else {
            System.out.println("Vehiculo no encontrado");
        }
    }


    public void mostrarPorPropietario(String propietario) {

        List<Vehiculo> vehiculos = new ArrayList<>();

        for (List<Vehiculo> lista : mapa.values()) {
            for (Vehiculo v : lista) {
                if (v.getPropietarioActual().equalsIgnoreCase(propietario)) {
                    vehiculos.add(v);
                }
            }
        }

        Collections.sort(vehiculos, new ComparadorPorMatricula());

        for (Vehiculo v : vehiculos){
            System.out.println(v);
        }
    }

    public void mostrarRematriculaciones(String bastidor){
        if(!mapa.containsKey(bastidor)){
            System.out.println("Vehiculo no encontrado");
        }

        List<Vehiculo> lista = mapa.get(bastidor);

        Collections.sort(lista, new ComparadorPorFecha());

        for (Vehiculo v : lista){
            System.out.println(v);
        }
    }
}
