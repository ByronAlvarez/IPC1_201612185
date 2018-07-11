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
public class Nodo_PilaEscritorios {
    private int documento;
    private  Nodo_PilaEscritorios siguiente;

    public Nodo_PilaEscritorios() {
    }

    public Nodo_PilaEscritorios(int documento) {
        this.documento = documento;
        this.siguiente = null;
    }

    /**
     * @return the documento
     */
    public int getDocumento() {
        return documento;
    }

    /**
     * @param documento the documento to set
     */
    public void setDocumento(int documento) {
        this.documento = documento;
    }

    /**
     * @return the siguiente
     */
    public Nodo_PilaEscritorios getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente( Nodo_PilaEscritorios siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
