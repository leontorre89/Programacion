package Colecciones.Mapas.Ej1ComicFest.Models;

import java.time.LocalDate;

public class EntradaVip {
    private String codEntrada;
    private LocalDate fechaEntrada;
    private TipoEntrada tipo;
    private EstadoEntrada estado;

    public EntradaVip(String codEntrada, LocalDate fechaEntrada, TipoEntrada tipo, EstadoEntrada estado) {
        this.codEntrada = codEntrada;
        this.fechaEntrada = fechaEntrada;
        this.tipo = tipo;
        this.estado = estado;
    }

    public String getCodEntrada() {
        return codEntrada;
    }

    public void setCodEntrada(String codEntrada) {
        this.codEntrada = codEntrada;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
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
}
