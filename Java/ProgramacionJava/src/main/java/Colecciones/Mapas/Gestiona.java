package Colecciones.Mapas;

import java.util.*;

public class Gestiona {
    static void main(String[] args) {
        Map<Alumno, Double> map = new HashMap<Alumno, Double>();
        Alumno a1 = new Alumno("Diego", "123456789H");
        Alumno a2 = new Alumno("Sergio", "23241255Q");
        Alumno a3 = new Alumno("Ezequiel", "123456789H");

        map.put(a1, 7d);
        map.put(a2, 32d);
        map.put(a3, 4d);

        System.out.println(map.toString());
        System.out.println(map.size());

        Set<Alumno> claves = map.keySet();
        System.out.println(claves);

        Collection<Double> valores = map.values();
        System.out.println(valores);

        Map<Alumno, List<Double>> map2 = new LinkedHashMap<Alumno, List<Double>>();

        Set<Map.Entry <Alumno, Double>> parejas = map.entrySet();
        System.out.println(parejas);

        // Mostrar los alumnos con un 5 o mas
        Set<Alumno> aprobados = new HashSet<Alumno>();
        Iterator <Map.Entry<Alumno, Double>> it = parejas.iterator();
        while (it.hasNext()){
            Map.Entry <Alumno, Double> pareja = it.next();
            if (pareja.getValue() >= 5){
                aprobados.add(pareja.getKey());
            }
        }

        System.out.println(aprobados);
    }
}
