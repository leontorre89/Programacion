package Colecciones.Mapas.Simulacion.AlgaByte.Models;

import Colecciones.Mapas.Simulacion.AlgaByte.Exceptions.MemoryException;

import java.time.LocalDate;

public class Tweet extends Mensaje{

    public Tweet(String contenido, LocalDate fecha, Usuario usuario) throws MemoryException {
        super(contenido, fecha, usuario);
        if (contenido.length() >50){
            throw new MemoryException("Un máximo de 50 caracteres para un tweet.");
        }
    }


}
