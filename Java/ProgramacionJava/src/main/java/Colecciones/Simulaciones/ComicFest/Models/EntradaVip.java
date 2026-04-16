package Colecciones.Simulaciones.ComicFest.Models;

import java.time.LocalDate;

public class EntradaVip {
    private int codEntrada;
    private LocalDate fecha;
    private TipoEntrada tipo;
    private EstadoEntrada estado;

    public EntradaVip(int codEntrada, LocalDate fecha, TipoEntrada tipo) {
        this.codEntrada = codEntrada;
        this.fecha = fecha;
        this.tipo = tipo;
    }

    public int getCodEntrada() {
        return codEntrada;
    }

    public void setCodEntrada(int codEntrada) {
        this.codEntrada = codEntrada;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public TipoEntrada getTipo() {
        return tipo;
    }

    public void setTipo(TipoEntrada tipo) {
        this.tipo = tipo;
    }

    public EstadoEntrada getEstado() {
        return estado;
    }

    public void setEstado(EstadoEntrada estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "EntradaVip{" +
                "codEntrada=" + codEntrada +
                ", fecha=" + fecha +
                ", tipo=" + tipo +
                ", estado=" + estado +
                '}';
    }
}
