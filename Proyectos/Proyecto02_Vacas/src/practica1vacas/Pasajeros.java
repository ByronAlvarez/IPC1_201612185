/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1vacas;

/**
 *
 * @author Byron Alvarez
 */
public class Pasajeros {
    private int maletas;
    private int documentos;
    private String nombre;

    public Pasajeros() {
    }

    public Pasajeros(int maletas, int documentos) {
        this.maletas = maletas;
        this.documentos = documentos;
    }

    /**
     * @return the maletas
     */
    public int getMaletas() {
        return maletas;
    }

    /**
     * @param maletas the maletas to set
     */
    public void setMaletas(int maletas) {
        this.maletas = maletas;
    }

    /**
     * @return the documentos
     */
    public int getDocumentos() {
        return documentos;
    }

    /**
     * @param documentos the documentos to set
     */
    public void setDocumentos(int documentos) {
        this.documentos = documentos;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
