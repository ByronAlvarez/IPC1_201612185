/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import practica1vacas.Aviones;

/**
 *
 * @author Byron Alvarez
 */
public class Nodo_Cola {

    private Aviones avion;
    private Nodo_Cola siguiente;

    public Nodo_Cola(Aviones avion) {
        this.avion = avion;
        siguiente = null;
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

    /**
     * @return the siguiente
     */
    public Nodo_Cola getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo_Cola siguiente) {
        this.siguiente = siguiente;
    }

}
