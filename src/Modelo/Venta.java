package Modelo;

import java.time.LocalDate;

/**
 *
 * @author andre
 */
public class Venta {
    
    private int huevosVendidos;
    private double valorHuevos;
    private LocalDate fecha;
    
    public Venta() {
    }

    public Venta(int huevosVendidos, double valorHuevos, LocalDate fecha) {
        this.huevosVendidos = huevosVendidos;
        this.valorHuevos = valorHuevos;
        this.fecha = fecha;
    }

    /**
     * @return the huevosVendidos
     */
    public int getHuevosVendidos() {
        return huevosVendidos;
    }

    /**
     * @param huevosVendidos the huevosVendidos to set
     */
    public void setHuevosVendidos(int huevosVendidos) {
        this.huevosVendidos = huevosVendidos;
    }

    /**
     * @return the valorHuevos
     */
    public double getValorHuevos() {
        return valorHuevos;
    }

    /**
     * @param valorHuevos the valorHuevos to set
     */
    public void setValorHuevos(double valorHuevos) {
        this.valorHuevos = valorHuevos;
    }

    /**
     * @return the fechaIngresos
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fechaIngresos to set
     */
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}