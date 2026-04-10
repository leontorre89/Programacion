package Colecciones.Mapas.Simulacion.AlgaByte.Models;

import Colecciones.Mapas.Simulacion.AlgaByte.Exceptions.MemoryException;

import java.time.LocalDate;

public class Post extends Mensaje{

    public Post(String contenido, LocalDate fecha, Usuario usuario) throws MemoryException {
        super(contenido, fecha, usuario);
        if (contenido == null){
            throw new MemoryException("El contenido no puede estar en blanco.");
        }
    }
}
