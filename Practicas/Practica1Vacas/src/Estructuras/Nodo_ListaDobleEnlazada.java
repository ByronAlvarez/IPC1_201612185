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
public class Nodo_ListaDobleEnlazada {

    private int dato;
    private Aviones avion;
    private Nodo_ListaDobleEnlazada siguiente;
    private Nodo_ListaDobleEnlazada anterior;

    public Nodo_ListaDobleEnlazada() {
        this.dato = 0;
        this.siguiente = null;
        this.anterior = null;
    }

    Nodo_ListaDobleEnlazada(Aviones avion) {
        this.avion = avion;
        this.siguiente = null;
        this.anterior = null;
    }

    /**
     * @return the dato
     */
    public int getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(int dato) {
        this.dato = dato;
    }

    /**
     * @return the adelante
     */
    public Nodo_ListaDobleEnlazada getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the adelante to set
     */
    public void setSiguiente(Nodo_ListaDobleEnlazada siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the atras
     */
    public Nodo_ListaDobleEnlazada getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the atras to set
     */
    public void setAnterior(Nodo_ListaDobleEnlazada anterior) {
        this.anterior = anterior;
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
