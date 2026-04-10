package Colecciones.Mapas.Simulacion.AlgaByte.Models;

import Colecciones.Mapas.Simulacion.AlgaByte.Exceptions.MemoryException;

import java.time.LocalDate;

public class Recomendacion extends Mensaje{

    public Recomendacion(String contenido, LocalDate fecha, Usuario usuario) throws MemoryException {
        super(contenido, fecha, usuario);
        if (contenido.length() < 100 || contenido.length() > 200){
            throw new MemoryException("Tiene que tener entre 100 y 200 caracteres.");
        }
    }

}
