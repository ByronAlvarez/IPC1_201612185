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
public class ListaDobleEscritorio {

    private Nodo_ListaEscritorios cabeza;
    char alfabeto = 'A';
    private int tamanio;

    public ListaDobleEscritorio() {
        this.cabeza = null;
    }

    public boolean esVacia() {
        return getCabeza() == null;
    }
public int getTamanio() {
        return tamanio;
    }
    public ListaDobleEscritorio insertarCabezaLista(Escritorios entrada) {

        Nodo_ListaEscritorios nuevo;
        nuevo = new Nodo_ListaEscritorios(entrada);
        nuevo.setSiguiente(getCabeza());
        if (getCabeza() != null) {
            getCabeza().setAnterior(nuevo);
        }
        cabeza = nuevo;

        System.out.println(Integer.parseInt("" + alfabeto));

        if (Integer.parseInt("" + alfabeto) < 26) {
            nuevo.getEscritorio().setNombre("Escritorio" + alfabeto);
            alfabeto = (char) (alfabeto + 1);
        }
        return this;
    }

    public ListaDobleEscritorio insertarAlFinal(Escritorios entrada) {

        Nodo_ListaEscritorios nuevo;
        nuevo = new Nodo_ListaEscritorios(entrada);
        // nuevo.setAdelante(getCabeza());
        if (getCabeza() != null) {
            Nodo_ListaEscritorios aux = getCabeza();
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            nuevo.setAnterior(aux);

        } else {
            cabeza = nuevo;
        }
       // if (Integer.parseInt("" + alfabeto) < 26) {
            nuevo.getEscritorio().setNombre("Escritorio" + alfabeto);
            alfabeto = (char) (alfabeto + 1);
      //  }
        tamanio++;
        return this;
    }
    
    public Nodo_ListaEscritorios obtenerDesocupado() {
        if (!esVacia()) {
            Nodo_ListaEscritorios aux = getCabeza();
            while (aux != null) {
                if (aux.getEscritorio().isOcupado() == false) {
                    return aux;
                }
                aux = aux.getSiguiente();
            }
            return null;
        }
        return null;
    }

    /*

    public void agregarPasajeros(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            int maletas = (int) Math.floor(Math.random() * 4 + 1);
            int documentos = (int) Math.floor(Math.random() * 10 + 1);
            lispasajeros.insertaralFinal(new Pasajeros(maletas, documentos));
            agregarMaletas(maletas);
        }
    }
     */
    /**
     * @return the cabeza
     */
    public Nodo_ListaEscritorios getCabeza() {
        return cabeza;
    }
}
