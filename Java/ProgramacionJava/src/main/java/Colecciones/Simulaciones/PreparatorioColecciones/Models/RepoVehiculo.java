package Colecciones.Simulaciones.PreparatorioColecciones.Models;

import Colecciones.Mapas.Alumno;

import java.time.LocalDate;
import java.util.*;

public class RepoVehiculo {
    Map <String, List<Vehiculo>> map= new HashMap<>();

    public void registrarVehiculo(Vehiculo vehiculo){
        if(!map.containsKey(vehiculo.getIdBastidor())){
            List<Vehiculo> lista = new ArrayList<Vehiculo>();
            lista.add(vehiculo);
            map.put(vehiculo.getIdBastidor(), lista);
            System.out.println("Vehiculo no esta en el mapa, añadiendo vehiculo");
        }
        else {
            List<Vehiculo> lista = map.get(vehiculo.getIdBastidor());
            lista.add(vehiculo);
            System.out.println("Vehiculo esta en el mapa, añadiendo vehiculo");
        }
    }

    public void registrarMatriculacion(Vehiculo vehiculo){
        if(!map.containsKey(vehiculo.getIdBastidor())){
            System.out.println("El vehiculo no existe");
        }
        else {
            List<Vehiculo> lista = map.get(vehiculo.getIdBastidor());
            lista.add(vehiculo);
            System.out.println("Registrando nueva matricula");
        }
    }

    public void buscarVehiculo(String idBastidor){
        List<Vehiculo> lista = map.get(idBastidor);
        System.out.println(lista);
    }

    public void mostrarVehiculo(String propietario){
        List<Vehiculo> listaPropietario = new ArrayList<>();
       for(List<Vehiculo> listavalores : map.values()){
           for(Vehiculo v : listavalores) {
               if(v.getPropietarioActual().equalsIgnoreCase(propietario)){
                   listaPropietario.add(v);
               }
           }
       }
       Collections.sort(listaPropietario, new ComparadorPorMatricula());
       for(Vehiculo v : listaPropietario){
           System.out.println(v);
       }
    }


}
