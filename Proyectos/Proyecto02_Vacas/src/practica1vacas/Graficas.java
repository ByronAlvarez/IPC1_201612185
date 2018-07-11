/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1vacas;

import Estructuras.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Byron Alvarez
 */
public class Graficas {

    Nodo_ListaCircularDoble aux2;

    public Graficas(ListaCircularDoble lis) {

    }

    public Graficas() {
    }

    public void crearDot(String nombre, Nodo_ListaDobleEnlazada primero) {
        FileWriter wr = null;
        PrintWriter pw = null;
        try {
            wr = new FileWriter(nombre + ".dot");
            pw = new PrintWriter(wr);

            pw.println("digraph listadoble{");
            pw.println("label=\"Aviones\";");
            pw.println(generarDot(primero));
            pw.print("}");
            pw.close();
        } catch (IOException e) {

        } finally {
            try {
                wr.close();
            } catch (IOException ex) {
                Logger.getLogger(Graficas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //
        //subgrafos !!!!!!!!
        //
    }

    public void crearDotSimple(String nombre, Nodo_ListaSimplePasajeros primero) {
        FileWriter wr = null;
        PrintWriter pw = null;
        try {
            wr = new FileWriter(nombre + ".dot");
            pw = new PrintWriter(wr);

            pw.println("digraph listadoble{");
            pw.println(generarDotP(primero));
            pw.print("}");
            pw.close();
        } catch (IOException e) {

        } finally {
            try {
                wr.close();
            } catch (IOException ex) {
                Logger.getLogger(Graficas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //
        //subgrafos !!!!!!!!
        //
    }

    public void crearDotCircular(String nombre, Nodo_ListaCircularDoble primero) {
        aux2 = primero;
        FileWriter wr = null;
        PrintWriter pw = null;
        try {
            wr = new FileWriter(nombre + ".dot");
            pw = new PrintWriter(wr);

            pw.println("digraph listadoble{");
            pw.println("graph [layout = circo]");
            pw.println(generarDotC(primero));
            pw.print("}");
            pw.close();
        } catch (IOException e) {

        } finally {
            try {
                wr.close();
            } catch (IOException ex) {
                Logger.getLogger(Graficas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //
        //subgrafos !!!!!!!!
        //
    }

    public String reemplazar(int posMemoria) {
        String cad = Integer.toString(posMemoria);
      //  System.out.println(cad);
        return cad.replace("-", "_");

    }

    private String generarDot(Nodo_ListaDobleEnlazada primero) {
        String cadena = "";

        if (primero == null) {
            System.out.println("Vacio");
            return cadena;
        } else {
            cadena += "nodo" + reemplazar(primero.hashCode()) + "[label=\"" + primero.getAvion().getNombre() + " : " + primero.getAvion().getTipo() + "\"];\n";

            if (primero.getSiguiente() != null) {
                cadena += "nodo" + reemplazar(primero.hashCode()) + "->" + "nodo" + reemplazar(primero.getSiguiente().hashCode()) + ";\n";
                cadena += "nodo" + reemplazar(primero.getSiguiente().hashCode()) + "->" + "nodo" + reemplazar(primero.getSiguiente().getAnterior().hashCode()) + ";\n";
                cadena += generarDot(primero.getSiguiente());
            }
            return cadena;
        }
    }

    private String generarDotP(Nodo_ListaSimplePasajeros primero) {
        String cadena = "";

        if (primero == null) {
            System.out.println("Vacio");
            return cadena;
        } else {
            cadena += "nodo" + reemplazar(primero.hashCode()) + "[label=\"" + primero.getPasajero().getNombre() + " : " + primero.getPasajero().getMaletas() + "\"];\n";

            if (primero.getSiguiente() != null) {
                cadena += "nodo" + reemplazar(primero.hashCode()) + "->" + "nodo" + reemplazar(primero.getSiguiente().hashCode()) + ";\n";
                //  cadena += "nodo" + reemplazar(primero.getSiguiente().hashCode()) + "->" + "nodo" + reemplazar(primero.getSiguiente().getAnterior().hashCode())+";\n";
                cadena += generarDotP(primero.getSiguiente());
            }
            return cadena;
        }
    }

    private String generarDotC(Nodo_ListaCircularDoble primero) {
        String cadena = "";
        Nodo_ListaCircularDoble aux = primero;
       // System.out.println("Aux" + aux);
        if (primero == null) {
            System.out.println("Vacio");
            return cadena;
        } else {
            cadena += "nodo" + reemplazar(primero.hashCode()) + "[label=\"" + primero.getMaletas() + "\"];\n";
            
            if (primero.getSiguiente() != null) {
                cadena += "nodo" + reemplazar(primero.hashCode()) + "->" + "nodo" + reemplazar(primero.getSiguiente().hashCode()) + ";\n";
                cadena += "nodo" + reemplazar(primero.getSiguiente().hashCode()) + "->" + "nodo" + reemplazar(primero.getSiguiente().getAnterior().hashCode()) + ";\n";
                if (primero.getSiguiente() != aux2) {
                    cadena += generarDotC(primero.getSiguiente());
                }
            }
            return cadena;
        }
    }

    public void generarImagen(String archivo, String imagen) {
        String doPath = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";
        String cmd = doPath + " -Tjpg " + archivo + " -o " + imagen;

        try {
            Runtime.getRuntime().exec(cmd);
        } catch (IOException ex) {
        }
    }
}
