/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 *
 * @author Byron Alvarez
 */
public class Nodo_ListaCircularDoble {

    private int maletas;
    private Nodo_ListaCircularDoble siguiente;
    private Nodo_ListaCircularDoble anterior;

    public Nodo_ListaCircularDoble() {
    }

    public Nodo_ListaCircularDoble(int maletas) {
        this.maletas = maletas;
        this.siguiente = null;
        this.anterior = null;
    }
    

    /**
     * @return the maletas
     */
    public int getMaletas() {
        return maletas;
    }

    /**
     * @param maletas the maletas to set
     */
    public void setMaletas(int maletas) {
        this.maletas = maletas;
    }

    /**
     * @return the siguiente
     */
    public Nodo_ListaCircularDoble getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo_ListaCircularDoble siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public Nodo_ListaCircularDoble getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(Nodo_ListaCircularDoble anterior) {
        this.anterior = anterior;
    }
}
