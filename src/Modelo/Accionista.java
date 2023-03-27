package Modelo;

/**
 *
 * @author andre
 */
public class Accionista {
    
    private String nombre;
    private String id;
    private double inversion;

    public Accionista() {
    }

    public Accionista(String nombre, String id, double inversion) {
        this.nombre = nombre;
        this.id = id;
        this.inversion = inversion;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the inversion
     */
    public double getInversion() {
        return inversion;
    }

    /**
     * @param inversion the inversion to set
     */
    public void setInversion(double inversion) {
        this.inversion = inversion;
    }

    @Override
    public String toString() {
        return "Accionista{" + "nombre=" + nombre + ", id=" + id + ", inversion=" + inversion + '}';
    }
}