package Ficheros.Prueba1.Models;

import java.util.Arrays;
import java.util.List;

public class Persona {
    private String nombre;
    private float[] notas;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.notas = new float[5];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float[] getNotas() {
        return notas;
    }

    public void setNotas(float[] notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + getNombre() + '\'' +
                ", notas=" + Arrays.toString(getNotas()) +
                '}';
    }
}
