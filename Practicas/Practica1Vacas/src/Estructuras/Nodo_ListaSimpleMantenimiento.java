/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import practica1vacas.*;

/**
 *
 * @author Byron Alvarez
 */
public class Nodo_ListaSimpleMantenimiento {

    private Estaciones estacion;
    private Nodo_ListaSimpleMantenimiento siguiente;

    public Nodo_ListaSimpleMantenimiento() {
    }

    public Nodo_ListaSimpleMantenimiento(Estaciones estacion) {
        this.estacion = estacion;
        this.siguiente = null;
    }

    /**
     * @return the estacion
     */
    public Estaciones getEstacion() {
        return estacion;
    }

    /**
     * @param estacion the estacion to set
     */
    public void setEstacion(Estaciones estacion) {
        this.estacion = estacion;
    }

    /**
     * @return the siguiente
     */
    public Nodo_ListaSimpleMantenimiento getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo_ListaSimpleMantenimiento siguiente) {
        this.siguiente = siguiente;
    }
    
}
