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
public class Nodo_ListaSimplePasajeros {
    private Pasajeros pasajero;
    private Nodo_ListaSimplePasajeros siguiente;

    public Nodo_ListaSimplePasajeros() {
    }

    public Nodo_ListaSimplePasajeros(Pasajeros pasajero) {
        this.pasajero = pasajero;
        this.siguiente=null;
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
     * @return the enlace
     */
    public Nodo_ListaSimplePasajeros getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the enlace to set
     */
    public void setSiguiente(Nodo_ListaSimplePasajeros siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
