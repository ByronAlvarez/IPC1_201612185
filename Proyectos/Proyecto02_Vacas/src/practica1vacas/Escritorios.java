/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1vacas;

import Estructuras.*;

/**
 *
 * @author Byron Alvarez
 */
public class Escritorios {
    private String nombre;
    private boolean ocupado;
    private Pasajeros pasajero;
    private ColaEscritorio cola;
    private PilaEscritorios pila;

    public Escritorios() {
    }

    public Escritorios(ColaEscritorio cola, PilaEscritorios pila) {
        setOcupado(false);
        this.cola = cola;
        this.pila = pila;
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
     * @return the cola
     */
    public ColaEscritorio getCola() {
        return cola;
    }

    /**
     * @param cola the cola to set
     */
    public void setCola(ColaEscritorio cola) {
        this.cola = cola;
    }

    /**
     * @return the pila
     */
    public PilaEscritorios getPila() {
        return pila;
    }

    /**
     * @param pila the pila to set
     */
    public void setPila(PilaEscritorios pila) {
        this.pila = pila;
    }

    /**
     * @return the ocupado
     */
    public boolean isOcupado() {
        return ocupado;
    }

    /**
     * @param ocupado the ocupado to set
     */
    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
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
    
    
    
}
