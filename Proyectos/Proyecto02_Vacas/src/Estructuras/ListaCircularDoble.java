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
public class ListaCircularDoble {
    
    private Nodo_ListaCircularDoble cabeza;
    private Nodo_ListaCircularDoble ultimo;
    int i = 1;
    
    public ListaCircularDoble() {
        this.cabeza = null;
    }
    
    public boolean esVacia() {
        return getCabeza() == null;
    }
    
    public void insertarAlFinal(int maleta) {
        Nodo_ListaCircularDoble nuevo = new Nodo_ListaCircularDoble(maleta);
        if (getCabeza() == null) {
            setCabeza(nuevo);
            getCabeza().setSiguiente(getCabeza());
            getCabeza().setAnterior(getCabeza());
        } else {
            Nodo_ListaCircularDoble aux = getCabeza();
            while (aux.getSiguiente() != getCabeza()) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            nuevo.setAnterior(aux);
            nuevo.setSiguiente(getCabeza());
            getCabeza().setAnterior(nuevo);
            
        }

        /*
        
        if (getCabeza() == null) {
            setCabeza(nuevo);
            getCabeza().setSiguiente(getCabeza());
            getCabeza().setAnterior(getCabeza());
        } else {
            nuevo.setSiguiente(getCabeza());
            nuevo.setAnterior(getCabeza().getAnterior());
            getCabeza().setAnterior(nuevo);
            nuevo.getAnterior().setSiguiente(nuevo);
            setCabeza(nuevo);
        }
         */
 /*
            Nodo_ListaCircularDoble aux = getCabeza();
            while (aux.getSiguiente() != getCabeza()) {
                aux.setSiguiente(nuevo);
                nuevo.setAnterior(aux);
                nuevo.setSiguiente(getCabeza());
                getCabeza().setAnterior(nuevo);
            }
         */
    }
    
    public void eliminar(int maleta) {
        if (getCabeza() != null) {
            Nodo_ListaCircularDoble aux = getCabeza();
            Nodo_ListaCircularDoble ant = null;
            while (aux.getSiguiente() != getCabeza()) {
                if (aux.getMaletas() == maleta) {
                    if (ant == null) {
                        if (aux.getSiguiente() == getCabeza()) {
                            setCabeza(null);
                        } else {
                            ant = aux.getAnterior();
                            ant.setSiguiente(aux.getSiguiente());
                            aux = aux.getSiguiente();
                            aux.setAnterior(ant);
                            setCabeza(aux);
                            ant = null;
                        }
                    } else {
                        aux.setAnterior(null);
                        ant.setSiguiente(aux.getSiguiente());
                        aux = aux.getSiguiente();
                        aux.setAnterior(ant);
                    }
                } else {
                    ant = aux;
                    aux = aux.getSiguiente();
                }
            }
             if (getCabeza().getMaletas() == maleta) {
            setCabeza(null);
        }
        } else {
            esVacia();
        }

        /*
        Nodo_ListaCircularDoble aux = getCabeza();
        if(aux!=null){
            while(aux.getSiguiente()!= getCabeza()){
                if(aux.getMaletas()==maleta){
                    getCabeza().getSiguiente().setAnterior(aux.getAnterior());
                    getCabeza().getAnterior().setSiguiente(aux.getSiguiente());
                    setCabeza(cabeza.getSiguiente());
                }
                aux = aux.getSiguiente();
            }
        }else{}
         */
 /*
        ultimo = getCabeza().getAnterior();
        if (buscar(maleta)) {
            if (getCabeza().getMaletas() == maleta) {
                setCabeza(getCabeza().getSiguiente());
                ultimo.setSiguiente(getCabeza());
            } else {
                Nodo_ListaCircularDoble aux = getCabeza();
                while (aux.getSiguiente().getMaletas() != maleta) {
                    aux = aux.getSiguiente();
                }
                if (aux.getSiguiente() == ultimo) {
                    aux.setAnterior(getCabeza());
                    ultimo = aux;
                } else {
                    Nodo_ListaCircularDoble siguiente = aux.getSiguiente();
                    aux.setSiguiente(siguiente.getSiguiente());
                }
            }
        }
         */
    }
    
    public boolean buscar(int maleta) {
        Nodo_ListaCircularDoble aux = getCabeza();
        boolean encontrado = false;
        do {
            if (maleta == aux.getMaletas()) {
                encontrado = true;
            } else {
                aux = aux.getSiguiente();
            }
        } while (aux != getCabeza() && encontrado != true);
        return encontrado;
    }

    /**
     * @return the cabeza
     */
    public Nodo_ListaCircularDoble getCabeza() {
        return cabeza;
    }

    /**
     * @param cabeza the cabeza to set
     */
    public void setCabeza(Nodo_ListaCircularDoble cabeza) {
        this.cabeza = cabeza;
    }
    
}
