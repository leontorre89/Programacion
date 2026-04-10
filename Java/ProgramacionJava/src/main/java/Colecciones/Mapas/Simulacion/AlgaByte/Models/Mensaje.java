package Colecciones.Mapas.Simulacion.AlgaByte.Models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Mensaje{
    private int idMensaje;
    private static int contador;
    private String contenido;
    private LocalDate fecha;
    private Usuario usuario;
    private List<Valoracion> valoraciones;

    public Mensaje(String contenido, LocalDate fecha, Usuario usuario) {
        contador = contador +1;
        this.idMensaje = contador;
        this.contenido = contenido;
        this.fecha = fecha;
        this.usuario = usuario;
        this.valoraciones = new ArrayList<>();
    }

    public int calcularValoracion(){

    }

    public int getIdMensaje() {
        return idMensaje;
    }

    public void setIdMensaje(int idMensaje) {
        this.idMensaje = idMensaje;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Mensaje.contador = contador;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Valoracion> getValoraciones() {
        return valoraciones;
    }

    public void setValoraciones(List<Valoracion> valoraciones) {
        this.valoraciones = valoraciones;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Mensaje mensaje = (Mensaje) o;
        return idMensaje == mensaje.idMensaje;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idMensaje);
    }
}
