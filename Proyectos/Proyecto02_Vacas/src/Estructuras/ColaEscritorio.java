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
public class ColaEscritorio {

    private Nodo_ColaEscritorios cabeza;
    private Nodo_ColaEscritorios ultimo;
     private int tamanio;

    public ColaEscritorio() {
        this.cabeza = null;
        this.ultimo = null;
        this.tamanio=0;
    }

    public boolean esVacia() {
        return getCabeza() == null;
    }
    
public int getTamanio() {
        return tamanio;
    }

    public void insertar(Pasajeros elemento) {
        Nodo_ColaEscritorios a;
        a = new Nodo_ColaEscritorios(elemento);
        if (esVacia()) {
            setCabeza(a);
        } else {
            getUltimo().setSiguiente(a);
        }
        setUltimo(a);
        tamanio++;
    }

    public Pasajeros quitar() throws Exception {
        Pasajeros aux;
        if (!esVacia()) {
            aux = getCabeza().getPasajero();
            setCabeza(getCabeza().getSiguiente());
        } else {
            throw new Exception("Cola Vacia");
        }
        tamanio--;
        return aux;
    }

    /**
     * @return the cabeza
     */
    public Nodo_ColaEscritorios getCabeza() {
        return cabeza;
    }

    /**
     * @param cabeza the cabeza to set
     */
    public void setCabeza(Nodo_ColaEscritorios cabeza) {
        this.cabeza = cabeza;
    }

    /**
     * @return the ultimo
     */
    public Nodo_ColaEscritorios getUltimo() {
        return ultimo;
    }

    /**
     * @param ultimo the ultimo to set
     */
    public void setUltimo(Nodo_ColaEscritorios ultimo) {
        this.ultimo = ultimo;
    }
    
}
