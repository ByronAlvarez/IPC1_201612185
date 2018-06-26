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
public class ListaSimplePasajeros {

    private Nodo_ListaSimplePasajeros cabeza;
    int i = 1;

    public ListaSimplePasajeros() {
        cabeza = null;
    }

    public void insertaralFinal(Pasajeros pasajero) {
        Nodo_ListaSimplePasajeros nuevo;
        nuevo = new Nodo_ListaSimplePasajeros(pasajero);
        if (getCabeza() == null) {
            setCabeza(nuevo);
        } else {
            Nodo_ListaSimplePasajeros aux = getCabeza();
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        nuevo.getPasajero().setNombre("Pasajero" + i);
        i = i + 1;
    }

    public void eliminar(Pasajeros entrada) {

        if (getCabeza().getPasajero() == entrada) {
            setCabeza(getCabeza().getSiguiente());
        } else {
            Nodo_ListaSimplePasajeros aux = getCabeza();
            if (aux != null) {
                while (aux.getSiguiente().getPasajero() != entrada) {
                    aux = aux.getSiguiente();
                }
                Nodo_ListaSimplePasajeros next = aux.getSiguiente().getSiguiente();
                aux.setSiguiente(next);
            } else {
            }
        }

    }

    /**
     * @return the primero
     */
    public Nodo_ListaSimplePasajeros getCabeza() {
        return cabeza;
    }

    /**
     * @param cabeza the cabeza to set
     */
    public void setCabeza(Nodo_ListaSimplePasajeros cabeza) {
        this.cabeza = cabeza;
    }
}
