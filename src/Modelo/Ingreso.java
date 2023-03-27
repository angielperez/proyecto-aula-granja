package Modelo;

import java.time.LocalDate;

/**
 *
 * @author andre
 */
public class Ingreso {

    private double valor;
    private String descripcion;
    private LocalDate fecha;
    
    public Ingreso() {
    }

    public Ingreso(double valor, String descripcion, LocalDate fecha) {
        this.fecha = fecha;
        this.valor = valor;
        this.descripcion = descripcion;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    /**
     * @return the fecha
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}