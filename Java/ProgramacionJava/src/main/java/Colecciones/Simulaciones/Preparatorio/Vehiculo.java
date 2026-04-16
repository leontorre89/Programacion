package Colecciones.Simulaciones.Preparatorio;

import java.time.LocalDate;
import java.util.Objects;

public class Vehiculo{
    private String idBastidor;
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private LocalDate anoFabricacion;
    private LocalDate fechaMatriculacion;
    private String propietarioActual;

    public Vehiculo(String idBastidor, String matricula, LocalDate fechaMatriculacion, String propietarioActual) {
        this.idBastidor = idBastidor;
        this.matricula = matricula;
        this.fechaMatriculacion = fechaMatriculacion;
        this.propietarioActual = propietarioActual;
    }

    public String getIdBastidor() {
        return idBastidor;
    }

    public void setIdBastidor(String idBastidor) {
        this.idBastidor = idBastidor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getAnoFabricacion() {
        return anoFabricacion;
    }

    public void setAnoFabricacion(LocalDate anoFabricacion) {
        this.anoFabricacion = anoFabricacion;
    }

    public LocalDate getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public void setFechaMatriculacion(LocalDate fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }

    public String getPropietarioActual() {
        return propietarioActual;
    }

    public void setPropietarioActual(String propietarioActual) {
        this.propietarioActual = propietarioActual;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return Objects.equals(idBastidor, vehiculo.idBastidor);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idBastidor);
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "idBastidor='" + idBastidor + '\'' +
                ", matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", anoFabricacion=" + anoFabricacion +
                ", fechaMatriculacion=" + fechaMatriculacion +
                ", propietarioActual='" + propietarioActual + '\'' +
                '}';
    }


}
