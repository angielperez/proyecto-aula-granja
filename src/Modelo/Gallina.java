package Modelo;

import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class Gallina {
    
    private String codigo;
    private double peso;
    private ArrayList <Produccion> producciones= new ArrayList();

    public Gallina() {
        
    }

    public Gallina(String codigo, double peso) {
        this.codigo = codigo;
        this.peso = peso;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the producciones
     */
    public ArrayList <Produccion> getProducciones() {
        return producciones;
    }

    /**
     * @param producciones the producciones to set
     */
    public void setProducciones(ArrayList <Produccion> producciones) {
        this.producciones = producciones;
    }
}