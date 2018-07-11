/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1vacas;

/**
 *
 * @author Byron Alvarez
 */
public class Estaciones {

    private boolean ocupado;
    private String nombre;
    private Aviones avion;

    public Estaciones() {
        this.ocupado = false;
        this.nombre = "Estacion";
        this.avion = null;
    }
    public Estaciones(Aviones avion) {
        setOcupado(true);
        setNombre("Estacion");
        setAvion(avion);
    }

    
    public Estaciones(boolean estado) {
        this.ocupado = estado;
    }

    /**
     * @return the estado
     */
    public boolean isOcupado() {
        return ocupado;
    }

    /**
     * @param ocupado the estado to set
     */
    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
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
     * @return the avion
     */
    public Aviones getAvion() {
        return avion;
    }

    /**
     * @param avion the avion to set
     */
    public void setAvion(Aviones avion) {
        this.avion = avion;
    }

}
