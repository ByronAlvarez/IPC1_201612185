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

            pw.println("digraph listoble{");
            pw.println("label=\"Pasajeros\";");
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

            pw.println("digraph listadole{");
            pw.println("label=\"Maletas\";");
            // pw.println("graph [layout = circo]");
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

    public void crearDotEscri(String nombre, Nodo_ListaEscritorios primero) {
        FileWriter wr = null;
        PrintWriter pw = null;
        try {
            wr = new FileWriter(nombre + ".dot");
            pw = new PrintWriter(wr);
            pw.println("digraph G {");
            pw.println("label=\"Escritorios\";");
            // pw.println("graph [layout = circo]");
            pw.println(generarDotEscri(primero));
           
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
    }

    public void crearDotServi(String nombre, Nodo_ListaSimpleMantenimiento primero, Nodo_Cola segundo) {
        FileWriter wr = null;
        PrintWriter pw = null;
        try {
            wr = new FileWriter(nombre + ".dot");
            pw = new PrintWriter(wr);
            pw.println("digraph G {");
            pw.println("subgraph cluster_0{");
            pw.println("label=\"Mantenimiento\";");
            pw.println(generarDotServi(primero));
            pw.print("}");
            pw.println("subgraph cluster_1{");
            pw.println("label=\"Cola\";");
            pw.println(generarDotColita(segundo));
            pw.print("}");
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
    }
   
    public void crearDotTodo(String nombre, Nodo_ListaDobleEnlazada avion,Nodo_ListaSimplePasajeros pasa,
            Nodo_ListaCircularDoble male, Nodo_ListaSimpleMantenimiento mante, 
            Nodo_ListaEscritorios primero, Nodo_Cola segundo) {
        FileWriter wr = null;
        PrintWriter pw = null;
        try {
            wr = new FileWriter(nombre + ".dot");
            pw = new PrintWriter(wr);
            pw.println("digraph T{");
            pw.println("subgraph cluster_0{");
            pw.println("label=\"Aviones\";");
            pw.println(generarDot(avion));
            pw.print("}");
            
            pw.println("subgraph cluster_1{");
            pw.println("label=\"Pasajeros\";");
            pw.println(generarDotP(pasa));
            pw.print("}");
            
            pw.println("subgraph cluster_2{"); 
            pw.println("label=\"Maletas\";");
            pw.println(generarDotC(male));
            pw.print("}");
            
            pw.println("subgraph cluster_3{");
             pw.println("label=\"Escritorios\";");
            pw.println(generarDotEscri(primero));pw.print("}");
            
            pw.println("subgraph cluster_4{");
             pw.println("label=\"Mantenimiento\";");
            pw.println(generarDotServi(mante));pw.print("}");
            
            pw.println("subgraph cluster_5{");
            pw.println("label=\"Cola\";");
            pw.println(generarDotColita(segundo));
            pw.print("}");
            
            
            
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
            cadena += "nodo" + reemplazar(primero.hashCode()) + "[label=\"" + primero.getAvion().getNombre()
                    + "\nTipo: " + primero.getAvion().getTipo()
                    + "\nPasajeros: " + primero.getAvion().getPasajeros()
                    + "\nDesabordaje: " + primero.getAvion().getTurnosDesabordaje()
                    + "\nMantenimiento: " + primero.getAvion().getTurnosMante()
                    + "\"];\n";

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
            cadena += "nodo" + reemplazar(primero.hashCode()) + "[label=\"" + primero.getPasajero().getNombre()
                    + "\n Maletas:" + primero.getPasajero().getMaletas()
                    + "\n Documentos:" + primero.getPasajero().getDocumentos()
                    + "\n Registro:" + primero.getPasajero().getRegistro()
                    + "\"];\n";

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
            cadena += "nodo" + reemplazar(primero.hashCode()) + "[label=\"Maletas: " + primero.getMaletas() + "\"];\n";

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

    private String generarDotEscri(Nodo_ListaEscritorios primero) {
        String cadena = "";

        if (primero == null) {
            System.out.println("Vacio");
            return cadena;
        } else {
       //     cadena += "nodo" + reemplazar(primero.hashCode()) + "[label=\"" + primero.getEscritorio().getNombre()
       //             + "\"];\n";
            
            
            if(primero.getEscritorio().getPasajero()==null){
            
            cadena += "nodo" + reemplazar(primero.hashCode()) + "[label=\"" + primero.getEscritorio().getNombre()
                    + "\n Nombre: "+"Vacio"
                    + "\n Maletas" + "Vacio"
                    + "\n Documentos" + "Vacio"
                    + "\n Registro" + "Vacio"
                    + "\"];\n";
            }else{
            cadena += "nodo" + reemplazar(primero.hashCode()) + "[label=\"" + primero.getEscritorio().getNombre()
                    + "\n Nombre: "+primero.getEscritorio().getPasajero().getNombre()
                    + "\n Maletas" + primero.getEscritorio().getPasajero().getMaletas()
                    + "\n Documentos" + primero.getEscritorio().getPasajero().getDocumentos()
                    + "\n Registro" + primero.getEscritorio().getPasajero().getRegistro()
                    + "\"];\n";}
            

            
            
            Nodo_ColaEscritorios segundo = primero.getEscritorio().getCola().getCabeza();
            if (segundo == null) {
                System.out.println("Vacio");
            } else {
                cadena += "nodo" + reemplazar(segundo.hashCode()) + "[label=\"" + segundo.getPasajero().getNombre()
                        + "\n Maletas" + segundo.getPasajero().getMaletas()
                        + "\n Documentos" + segundo.getPasajero().getDocumentos()
                        + "\n Registro" + segundo.getPasajero().getRegistro()
                        + "\"];\n";

                if (segundo.getSiguiente() != null) {
                    cadena += "nodo" + reemplazar(segundo.hashCode()) + "->" + "nodo" + reemplazar(segundo.getSiguiente().hashCode()) + ";\n";
                    //  cadena += "nodo" + reemplazar(primero.getSiguiente().hashCode()) + "->" + "nodo" + reemplazar(primero.getSiguiente().getAnterior().hashCode()) + ";\n";
                    cadena += generarDotCola(segundo.getSiguiente());
                }
            }

            //  generarDotCola(primero.getEscritorio().getCola().getCabeza());
            if (primero.getSiguiente() != null) {
                cadena += "nodo" + reemplazar(primero.hashCode()) + "->" + "nodo" + reemplazar(primero.getSiguiente().hashCode()) + ";\n";
                cadena += "nodo" + reemplazar(primero.getSiguiente().hashCode()) + "->" + "nodo" + reemplazar(primero.getSiguiente().getAnterior().hashCode()) + ";\n";
                if (segundo != null) {
                    cadena += "nodo" + reemplazar(primero.hashCode()) + "->" + "nodo" + reemplazar(segundo.hashCode()) + ";\n";
                }
                cadena += generarDotEscri(primero.getSiguiente());
            } else {
                if (segundo != null) {
                    cadena += "nodo" + reemplazar(primero.hashCode()) + "->" + "nodo" + reemplazar(segundo.hashCode()) + ";\n";
                }
            }
            return cadena;
        }
    }

    private String generarDotCola(Nodo_ColaEscritorios segundo) {
        String cadena = "";
        if (segundo == null) {
            System.out.println("Vacio");
            return cadena;
        } else {
            cadena += "nodo" + reemplazar(segundo.hashCode()) + "[label=\"" + segundo.getPasajero().getNombre()
                    + "\n Maletas: " + segundo.getPasajero().getMaletas()
                    + "\n Documentos: " + segundo.getPasajero().getDocumentos()
                    + "\n Registro: " + segundo.getPasajero().getRegistro()
                    + "\"];\n";

            if (segundo.getSiguiente() != null) {
                cadena += "nodo" + reemplazar(segundo.hashCode()) + "->" + "nodo" + reemplazar(segundo.getSiguiente().hashCode()) + ";\n";
                //  cadena += "nodo" + reemplazar(primero.getSiguiente().hashCode()) + "->" + "nodo" + reemplazar(primero.getSiguiente().getAnterior().hashCode()) + ";\n";
                cadena += generarDotCola(segundo.getSiguiente());
            }
            return cadena;
        }
    }

    private String generarDotServi(Nodo_ListaSimpleMantenimiento primero) {
        String cadena = "";

        if (primero == null) {
            System.out.println("Vacio");
            return cadena;
        } else {
            if (primero.getEstacion().getAvion() == null) {
                cadena += "nodo" + reemplazar(primero.hashCode()) + "[label=\"" + primero.getEstacion().getNombre()
                        + "\n Nombre: " + "Vacio"
                        + "\nTipo: " + "Vacio"
                        + "\nPasajeros: " + "Vacio"
                        + "\nDesabordaje: " + "Vacio"
                        + "\nMantenimiento: " + "Vacio"
                        + "\"];\n";
            } else {
                cadena += "nodo" + reemplazar(primero.hashCode()) + "[label=\"" + primero.getEstacion().getNombre()
                        + "\n Nombre: " + primero.getEstacion().getAvion().getNombre()
                        + "\nTipo: " + primero.getEstacion().getAvion().getTipo()
                        + "\nPasajeros: " + primero.getEstacion().getAvion().getPasajeros()
                        + "\nDesabordaje: " + primero.getEstacion().getAvion().getTurnosDesabordaje()
                        + "\nMantenimiento: " + primero.getEstacion().getAvion().getTurnosMante()
                        + "\"];\n";
            }

        }
        if (primero.getSiguiente() != null) {
            cadena += "nodo" + reemplazar(primero.hashCode()) + "->" + "nodo" + reemplazar(primero.getSiguiente().hashCode()) + ";\n";
            // cadena += "nodo" + reemplazar(primero.getSiguiente().hashCode()) + "->" + "nodo" + reemplazar(primero.getSiguiente().getAnterior().hashCode()) + ";\n";
            cadena += generarDotServi(primero.getSiguiente());

        }
        return cadena;
    }

    private String generarDotColita(Nodo_Cola segundo) {
        String cadena = "";
        if (segundo == null) {
            System.out.println("Vacio");
            return cadena;
        } else {
            cadena += "nodo" + reemplazar(segundo.hashCode()) + "[label=\"" + segundo.getAvion().getNombre()
                    + "\nTipo: " + segundo.getAvion().getTipo()
                    + "\nPasajeros: " + segundo.getAvion().getPasajeros()
                    + "\nDesabordaje: " + segundo.getAvion().getTurnosDesabordaje()
                    + "\nMantenimiento: " + segundo.getAvion().getTurnosMante()
                    + "\"];\n";
            if (segundo.getSiguiente() != null) {
                cadena += "nodo" + reemplazar(segundo.hashCode()) + "->" + "nodo" + reemplazar(segundo.getSiguiente().hashCode()) + ";\n";
                //  cadena += "nodo" + reemplazar(primero.getSiguiente().hashCode()) + "->" + "nodo" + reemplazar(primero.getSiguiente().getAnterior().hashCode()) + ";\n";
                cadena += generarDotColita(segundo.getSiguiente());
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
