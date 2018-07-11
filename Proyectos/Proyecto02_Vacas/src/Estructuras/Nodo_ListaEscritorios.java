/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import practica1vacas.Escritorios;

/**
 *
 * @author Byron Alvarez
 */
public class Nodo_ListaEscritorios {
   private Escritorios escritorio;
    private Nodo_ListaEscritorios siguiente;
    private Nodo_ListaEscritorios anterior;

    public Nodo_ListaEscritorios() {
        this.escritorio= null;
        this.siguiente = null;
        this.anterior = null;
    }

    public Nodo_ListaEscritorios(Escritorios escritorio) {
        this.escritorio=escritorio;
        this.siguiente = null;
        this.anterior = null;
    }

  
    /**
     * @return the siguiente
     */
    public Nodo_ListaEscritorios getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo_ListaEscritorios siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public Nodo_ListaEscritorios getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(Nodo_ListaEscritorios anterior) {
        this.anterior = anterior;
    }

    /**
     * @return the escritorio
     */
    public Escritorios getEscritorio() {
        return escritorio;
    }

    /**
     * @param escritorio the escritorio to set
     */
    public void setEscritorio(Escritorios escritorio) {
        this.escritorio = escritorio;
    }
    
    
    
}
