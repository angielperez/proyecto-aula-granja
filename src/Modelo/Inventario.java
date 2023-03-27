package Modelo;

/**
 *
 * @author andre
 */
public class Inventario {
    
    private int totalHuevos;

    public Inventario() {
    }

    public Inventario(int totalHuevos) {
        this.totalHuevos = totalHuevos;
    }

    /**
     * @return the totalHuevos
     */
    public int getTotalHuevos() {
        return totalHuevos;
    }

    /**
     * @param totalHuevos the totalHuevos to set
     */
    public void setTotalHuevos(int totalHuevos) {
        this.totalHuevos = totalHuevos;
    }
}