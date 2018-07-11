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
public class PilaEscritorios {
    
    private  Nodo_PilaEscritorios cabeza;
    
    public PilaEscritorios() {
        this.cabeza = null;
        
    }
    
    public boolean pilaVacia() {
        return getCabeza() == null;
    }
    
    public void insertar(int elemento) {
        Nodo_PilaEscritorios nuevo;
        nuevo = new Nodo_PilaEscritorios(elemento);
        nuevo.setSiguiente(getCabeza());
        cabeza = nuevo;
    }

    /**
     * @return the cabeza
     */
    public  Nodo_PilaEscritorios getCabeza() {
        return cabeza;
    }
    
}
