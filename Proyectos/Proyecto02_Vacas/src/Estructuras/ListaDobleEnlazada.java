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
public class ListaDobleEnlazada {

    int maletasss = 1;
    private Nodo_ListaDobleEnlazada cabeza;
    int i = 1;
    public ListaSimpleMantenimiento listaMante = new ListaSimpleMantenimiento();
    public Cola cola = new Cola();
    public ListaSimplePasajeros lispasajeros = new ListaSimplePasajeros();
    public ListaCircularDoble listamaletas = new ListaCircularDoble();

    public ListaDobleEnlazada() {
        this.cabeza = null;
    }

    public boolean esVacia() {
        return getCabeza() == null;
    }

    public ListaDobleEnlazada insertarCabezaLista(Aviones entrada) {

        Nodo_ListaDobleEnlazada nuevo;
        nuevo = new Nodo_ListaDobleEnlazada(entrada);
        nuevo.setSiguiente(getCabeza());
        if (getCabeza() != null) {
            getCabeza().setAnterior(nuevo);
        }
        cabeza = nuevo;
        nuevo.getAvion().setNombre("Avion" + i);
        i = i + 1;
        return this;
    }

    public ListaDobleEnlazada insertarAlFinal(Aviones entrada) {

        Nodo_ListaDobleEnlazada nuevo;
        nuevo = new Nodo_ListaDobleEnlazada(entrada);
        // nuevo.setAdelante(getCabeza());
        if (getCabeza() != null) {
            Nodo_ListaDobleEnlazada aux = getCabeza();
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            nuevo.setAnterior(aux);

        } else {
            cabeza = nuevo;
        }
        nuevo.getAvion().setNombre("Avion" + i);
        i = i + 1;
        return this;
    }

    public ListaDobleEnlazada insertaDespues(Nodo_ListaDobleEnlazada anterior, Aviones entrada) {
        Nodo_ListaDobleEnlazada nuevo;
        nuevo = new Nodo_ListaDobleEnlazada(entrada);
        nuevo.setSiguiente(anterior.getSiguiente());
        if (anterior.getSiguiente() != null) {
            anterior.getSiguiente().setAnterior(nuevo);
        }
        anterior.setSiguiente(nuevo);
        nuevo.setAnterior(anterior);
        nuevo.getAvion().setNombre("Avion" + i);
        i = i + 1;
        return this;
    }

    public void eliminar(Aviones entrada) {
        Nodo_ListaDobleEnlazada actual;
        boolean encontrado = false;
        actual = getCabeza();
        while ((actual != null) && (!encontrado)) {
            encontrado = (actual.getAvion() == entrada);
            if (!encontrado) {
                actual = actual.getSiguiente();
            }
        }
        if (actual != null) {
            if (actual == getCabeza()) {
                cabeza = actual.getSiguiente();
                if (actual.getSiguiente() != null) {
                    actual.getSiguiente().setAnterior(null);
                }
            } else if (actual.getSiguiente() != null) { 
                actual.getAnterior().setSiguiente(actual.getSiguiente());
                actual.getSiguiente().setAnterior(actual.getAnterior());
            } else { 
                actual.getAnterior().setSiguiente(null);
            }
            actual = null;
        }
    }

    public void listar() {
        Nodo_ListaDobleEnlazada aux;
        aux = getCabeza();
        while (aux != null) {
            if (aux.getAvion().getTipo() == 1) {
                System.out.println("Pequeno" + " "
                        + aux.getAvion().getTurnosDesabordaje() + " "
                        + aux.getAvion().getTurnosMante());
            } else if (aux.getAvion().getTipo() == 2) {
                System.out.println("Mediano" + " "
                        + aux.getAvion().getTurnosDesabordaje() + " "
                        + aux.getAvion().getTurnosMante());
            } else if (aux.getAvion().getTipo() == 3) {
                System.out.println("Grande" + " "
                        + aux.getAvion().getTurnosDesabordaje() + " "
                        + aux.getAvion().getTurnosMante());
            }
            aux = aux.getSiguiente();
        }
    }

    public String listarS() {
        String a = "";
        String b = "";
        Nodo_ListaDobleEnlazada aux;
        aux = getCabeza();
        while (aux != null) {
            //  System.out.println(aux.getAvion().getTipo() + " " + aux.getAvion().getTurnosDesabordaje());
            if (aux.getAvion().getTipo() == 1) {
                a = "Pequeno" + " "
                        + aux.getAvion().getTurnosDesabordaje() + " "
                        + aux.getAvion().getTurnosMante();
            } else if (aux.getAvion().getTipo() == 2) {
                a = "Mediano" + " "
                        + aux.getAvion().getTurnosDesabordaje() + " "
                        + aux.getAvion().getTurnosMante();
            } else if (aux.getAvion().getTipo() == 3) {
                a = "Grande" + " "
                        + aux.getAvion().getTurnosDesabordaje() + " "
                        + aux.getAvion().getTurnosMante();
            }

            aux = aux.getSiguiente();
            //return a;
        }
        b = a;
        return a + b;
    }

    public Nodo_ListaDobleEnlazada recorrer() {
        Nodo_ListaDobleEnlazada aux;
        aux = getCabeza();
        while (aux != null) {
            //System.out.println(aux.getAvion().getTipo() + " " + aux.getAvion().getTurnosDesabordaje());
            aux = aux.getSiguiente();
        }
        return aux;
    }

    public void restarTurnoDes() throws Exception {
        Nodo_ListaDobleEnlazada aux;
        // Nodo_Cola auxCola;
        //  auxCola = cola.getCabeza();
        aux = getCabeza();
        //|| listaMante.getCabeza() != null
        while (aux != null) {
            aux.getAvion().setTurnosDesabordaje(aux.getAvion().getTurnosDesabordaje() - 1);
            if (aux.getAvion().getTurnosDesabordaje() == 0) {
                //   System.out.println(listaMante.obtenerDesocupado());

                if (listaMante.obtenerDesocupado() != null) {
                    //   if (!cola.esVacia()) {
                    //       listaMante.obtenerDesocupado().setEstacion(new Estaciones(cola.quitar()));
                    //   } else {
                    listaMante.obtenerDesocupado().setEstacion(new Estaciones(aux.getAvion()));
                    //        }
                } else {
                    cola.insertar(aux.getAvion());

                }

                //  agregarPasajeros(aux.getAvion().getTurnosDesabordaje());
                eliminar(aux.getAvion());
            }

            if (esVacia() && !cola.esVacia()) {

                if (listaMante.obtenerDesocupado() != null) {

                    listaMante.obtenerDesocupado().setEstacion(new Estaciones(cola.quitar()));

                }

            }

            aux = aux.getSiguiente();
            //  auxCola= auxCola.getSiguiente();
        }
    }

    /*
    public void metodoMante() throws Exception {
        if (!cola.esVacia()) {
            listaMante.obtenerDesocupado().setEstacion(new Estaciones(cola.quitar()));
        } else {
         //   listaMante.obtenerDesocupado().setEstacion(new Estaciones(aux.getAvion()));
        }
    }
     */
    public void agregarPasajeros(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            int maletas = (int) Math.floor(Math.random() * 4 + 1);
            int documentos = (int) Math.floor(Math.random() * 10 + 1);
            lispasajeros.insertaralFinal(new Pasajeros(maletas, documentos));
            agregarMaletas(maletas);
        }
    }

    public void agregarMaletas(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            listamaletas.insertarAlFinal(maletasss);
            maletasss = maletasss + 1;
        }
    }

    public Aviones devolverAvionaEliminar() {
        Nodo_ListaDobleEnlazada aux;
        aux = getCabeza();
        while (aux != null) {
            if (aux.getAvion().getTurnosDesabordaje() == 0) {

                return aux.getAvion();
            }
            aux = aux.getSiguiente();
        }
        return null;
    }

    /**
     * @return the cabeza
     */
    public Nodo_ListaDobleEnlazada getCabeza() {
        return cabeza;
    }
}
