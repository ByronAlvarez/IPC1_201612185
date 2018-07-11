/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import java.util.logging.Level;
import java.util.logging.Logger;
import practica1vacas.Aviones;
import practica1vacas.Estaciones;

/**
 *
 * @author Byron Alvarez
 */
public class ListaSimpleMantenimiento {
    public Cola cola = new Cola();

    private Nodo_ListaSimpleMantenimiento cabeza;
    private int tamanio;
    int i = 1;

    public ListaSimpleMantenimiento() {
        setCabeza(null);
    }

    public boolean esVacia() {
        return getCabeza() == null;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void agregarAlFinal() {
        Nodo_ListaSimpleMantenimiento nuevo;
        //nuevo = new Nodo_ListaSimpleMantenimiento(new Estaciones(avion));
        nuevo = new Nodo_ListaSimpleMantenimiento(new Estaciones());
        if (esVacia()) {
            setCabeza(nuevo);
        } else {
            Nodo_ListaSimpleMantenimiento aux = getCabeza();
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        nuevo.getEstacion().setNombre("Estacion" + i);
        i = i + 1;

        tamanio++;
    }

    public Nodo_ListaSimpleMantenimiento obtenerDesocupado() {
        if (!esVacia()) {
            Nodo_ListaSimpleMantenimiento aux = getCabeza();
            while (aux != null) {
                if (aux.getEstacion().isOcupado() == false) {
                    return aux;
                }
                aux = aux.getSiguiente();
            }
            return null;
        }
        return null;
    }

    public void eliminar(Aviones entrada) {
        if (getCabeza().getEstacion().getAvion() == entrada) {
            setCabeza(getCabeza().getSiguiente());
        } else {
            Nodo_ListaSimpleMantenimiento aux = getCabeza();
            while (aux.getSiguiente().getEstacion().getAvion() != entrada) {
                aux = aux.getSiguiente();
            }
            Nodo_ListaSimpleMantenimiento next = aux.getSiguiente().getSiguiente();
            aux.setSiguiente(next);
        }

    }

    public void restarTurnoMante() {
        Nodo_ListaSimpleMantenimiento aux;
        aux = getCabeza();
        while (aux != null) {
            if (aux.getEstacion().getAvion() != null) {
                aux.getEstacion().getAvion().setTurnosMante(aux.getEstacion().getAvion().getTurnosMante() - 1);
                if (aux.getEstacion().getAvion().getTurnosMante() == 0) {
                    
                    aux.setEstacion(new Estaciones());
                    /*
                    if (obtenerDesocupado() != null) {
                         if (!cola.esVacia()) {
                             obtenerDesocupado().setEstacion(new Estaciones(cola.quitar()));
                         } else {
                    obtenerDesocupado().setEstacion(new Estaciones(aux.getAvion()));
                        }
                } else {
                    cola.insertar(aux.getAvion());
                }
                    */
                }
            } else {
            }
            aux = aux.getSiguiente();
        }
    }

    /**
     * @return the cabeza
     */
    public Nodo_ListaSimpleMantenimiento getCabeza() {
        return cabeza;
    }

    /**
     * @param cabeza the cabeza to set
     */
    public void setCabeza(Nodo_ListaSimpleMantenimiento cabeza) {
        this.cabeza = cabeza;
    }

}
