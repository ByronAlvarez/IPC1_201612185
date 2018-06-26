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
public class Aviones {
    private String nombre;
    private int tipo;
    private int pasajeros;
    private Pasajeros pasajero;
    private int turnosDesabordaje;
    private int turnosMante;

    public Aviones() {
    }

    public Aviones(int tipo, Pasajeros pasajero, int turnosDesabordaje, int turnosMante) {
        this.tipo = tipo;
        this.pasajero = pasajero;
        this.turnosDesabordaje = turnosDesabordaje;
        this.turnosMante = turnosMante;
    }
    public Aviones(int tipo, int pasajeros, int turnosDesabordaje, int turnosMante) {
        this.tipo = tipo;
        this.pasajeros = pasajeros;
        this.turnosDesabordaje = turnosDesabordaje;
        this.turnosMante = turnosMante;
    }

    /**
     * @return the tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the pasajero
     */
    public Pasajeros getPasajero() {
        return pasajero;
    }

    /**
     * @param pasajero the pasajero to set
     */
    public void setPasajero(Pasajeros pasajero) {
        this.pasajero = pasajero;
    }

    /**
     * @return the turnosDesabordaje
     */
    public int getTurnosDesabordaje() {
        return turnosDesabordaje;
    }

    /**
     * @param turnosDesabordaje the turnosDesabordaje to set
     */
    public void setTurnosDesabordaje(int turnosDesabordaje) {
        this.turnosDesabordaje = turnosDesabordaje;
    }

    /**
     * @return the turnosMante
     */
    public int getTurnosMante() {
        return turnosMante;
    }

    /**
     * @param turnosMante the turnosMante to set
     */
    public void setTurnosMante(int turnosMante) {
        this.turnosMante = turnosMante;
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
     * @return the pasajeros
     */
    public int getPasajeros() {
        return pasajeros;
    }

    /**
     * @param pasajeros the pasajeros to set
     */
    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }
}
