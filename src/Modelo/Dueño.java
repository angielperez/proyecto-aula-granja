package Modelo;

/**
 *
 * @author andre
 */
public class Dueño {
    
    private String nombre;
    private String id;
    private Direccion direccion;
    private Cuenta cuenta;
    
    public Dueño() {
    }

    public Dueño(String nombre, String id, Direccion direccion, Cuenta cuenta) {
        this.nombre = nombre;
        this.id = id;
        this.direccion = direccion;
        this.cuenta = cuenta;
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
     * @return the direccion
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the cuenta
     */
    public Cuenta getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return "Due\u00f1o{" + "nombre=" + nombre + ", id=" + id + ", direccion=" + direccion + ", cuenta=" + cuenta + '}';
    }
}