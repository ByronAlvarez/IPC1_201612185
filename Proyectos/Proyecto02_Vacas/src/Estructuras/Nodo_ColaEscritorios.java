/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import practica1vacas.Pasajeros;

/**
 *
 * @author Byron Alvarez
 */
public class Nodo_ColaEscritorios {
    private Pasajeros pasajero;
    private Nodo_ColaEscritorios siguiente;

    public Nodo_ColaEscritorios() {
    }

    public Nodo_ColaEscritorios(Pasajeros pasajero) {
        this.pasajero = pasajero;
        this.siguiente = null;
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
     * @return the siguiente
     */
    public Nodo_ColaEscritorios getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo_ColaEscritorios siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
