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
public class Cola {

    private Nodo_Cola cabeza;
    private Nodo_Cola ultimo;

    public Cola() {
        this.cabeza = null;
        this.ultimo = null;
    }

    public boolean esVacia() {
        return getCabeza() == null;
    }

    public void insertar(Aviones elemento) {
        Nodo_Cola a;
        a = new Nodo_Cola(elemento);
        if (esVacia()) {
            setCabeza(a);
        } else {
            getUltimo().setSiguiente(a);
        }
        setUltimo(a);
    }

    public Aviones quitar() throws Exception {
        Aviones aux;
        if (!esVacia()) {
            aux = getCabeza().getAvion();
            setCabeza(getCabeza().getSiguiente());
        } else {
            throw new Exception("Cola Vacia");
        }
        return aux;
    }

    /**
     * @return the cabeza
     */
    public Nodo_Cola getCabeza() {
        return cabeza;
    }

    /**
     * @param cabeza the cabeza to set
     */
    public void setCabeza(Nodo_Cola cabeza) {
        this.cabeza = cabeza;
    }

    /**
     * @return the ultimo
     */
    public Nodo_Cola getUltimo() {
        return ultimo;
    }

    /**
     * @param ultimo the ultimo to set
     */
    public void setUltimo(Nodo_Cola ultimo) {
        this.ultimo = ultimo;
    }
}
