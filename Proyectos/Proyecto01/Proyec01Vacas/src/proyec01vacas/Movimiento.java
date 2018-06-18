/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyec01vacas;

import Objetos.Personajes;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Byron Alvarez
 */
public class Movimiento extends Thread {

    public int cantidad = 0;
    public int logico = 0;
    public Tab tab = null;
    public int XCentro=0;
    public int YCentro=0;
    public boolean encontrado = false;

    public Movimiento(int cantidad, int logico, Tab tablero) {
        this.cantidad = cantidad;
        this.logico = logico;
        this.tab = tablero;
    }

    public Movimiento(int cantidad, Tab tablero, String nombre, int logico) {
        super(nombre);
        this.cantidad = cantidad;
        this.tab = tablero;
        this.logico = logico;
    }

    public boolean comprobar() {
        if (tab.MagoJ1.posperX >= tab.tam - 1) {
            return true;
        }

        return false;
    }

    public boolean comprobarM2() {
        if (tab.MagoJ2.posperX >= tab.tam - 1) {
            return true;
        }
        return false;
    }

    public boolean comprobarG1() {
        if (tab.GuerreroJ1.posperX >= tab.tam - 1) {
            return true;
        }
        return false;
    }

    public boolean comprobarG2() {
        if (tab.GuerreroJ2.posperX >= tab.tam - 1) {
            return true;
        }
        return false;
    }

    public boolean comprobarP1() {
        if (tab.PrincesaJ1.posperX >= tab.tam - 1) {
            return true;
        }
        return false;
    }

    public boolean comprobarP2() {
        if (tab.PrincesaJ2.posperX >= tab.tam - 1) {
            return true;
        }
        return false;
    }
    public boolean comprobarAba() {
        if (tab.MagoJ1.posperY >= tab.tam - 1) {
            return true;
        }

        return false;
    }

    public boolean comprobarM2Aba() {
        if (tab.MagoJ2.posperY >= tab.tam - 1) {
            return true;
        }
        return false;
    }

    public boolean comprobarG1Aba() {
        if (tab.GuerreroJ1.posperY >= tab.tam - 1) {
            return true;
        }
        return false;
    }

    public boolean comprobarG2Aba() {
        if (tab.GuerreroJ2.posperY >= tab.tam - 1) {
            return true;
        }
        return false;
    }

    public boolean comprobarP1Aba() {
        if (tab.PrincesaJ1.posperY >= tab.tam - 1) {
            return true;
        }
        return false;
    }

    public boolean comprobarP2Aba() {
        if (tab.PrincesaJ2.posperY >= tab.tam - 1) {
            return true;
        }
        return false;
    }

    public boolean comprobar2() {
        if (tab.MagoJ1.posperX <= 0) {
            return true;
        }
        return false;
    }
    public boolean comprobar2M2() {
        if (tab.MagoJ2.posperX <= 0) {
            return true;
        }
        return false;
    }public boolean comprobar2G1() {
        if (tab.GuerreroJ1.posperX <= 0) {
            return true;
        }
        return false;
    }public boolean comprobar2G2() {
        if (tab.GuerreroJ2.posperX <= 0) {
            return true;
        }
        return false;
    }
    public boolean comprobar2P1() {
        if (tab.PrincesaJ1.posperX <= 0) {
            return true;
        }
        return false;
    }public boolean comprobar2P2() {
        if (tab.PrincesaJ2.posperX <= 0) {
            return true;
        }
        return false;
    }
    public boolean comprobar2Ar() {
        if (tab.MagoJ1.posperY <= 0) {
            return true;
        }
        return false;
    }
    public boolean comprobar2M2Ar() {
        if (tab.MagoJ2.posperY <= 0) {
            return true;
        }
        return false;
    }public boolean comprobar2G1Ar() {
        if (tab.GuerreroJ1.posperY <= 0) {
            return true;
        }
        return false;
    }public boolean comprobar2G2Ar() {
        if (tab.GuerreroJ2.posperY <= 0) {
            return true;
        }
        return false;
    }
    public boolean comprobar2P1Ar() {
        if (tab.PrincesaJ1.posperY <= 0) {
            return true;
        }
        return false;
    }public boolean comprobar2P2Ar() {
        if (tab.PrincesaJ2.posperY <= 0) {
            return true;
        }
        return false;
    }

    public void moverDer(int cantidad, int logico) {
        if (logico == 1) {
            moverDMagoJ1(cantidad);
        } else if (logico == 2) {
            moverDMagoJ2(cantidad);
        } else if (logico == 3) {
            moverDGuerreroJ1(cantidad);
        } else if (logico == 4) {
            moverDGuerreroJ2(cantidad);
        } else if (logico == 5) {
            moverDPrincesaJ1(cantidad);
        } else if (logico == 6) {
            moverDPrincesaJ2(cantidad);
        }

    }

    public void moverIz(int cantidad, int logico) {
        if (logico == 1) {
            moverIMagoJ1(cantidad);
        } else if (logico == 2) {
            moverIMagoJ2(cantidad);
        } else if (logico == 3) {
            moverIGuerreroJ1(cantidad);
        } else if (logico == 4) {
            moverIGuerreroJ2(cantidad);
        } else if (logico == 5) {
            moverIPrincesaJ1(cantidad);
        } else if (logico == 6) {
            moverIPrincesaJ2(cantidad);
        }
    }

    public void moverAba(int cantidad, int logico) {
        if (logico == 1) {
            moverAbMagoJ1(cantidad);
        } else if (logico == 2) {
            moverAbMagoJ2(cantidad);
        } else if (logico == 3) {
            moverAbGuerreroJ1(cantidad);
        } else if (logico == 4) {
            moverAbGuerreroJ2(cantidad);
        } else if (logico == 5) {
            moverAbPrincesaJ1(cantidad);
        } else if (logico == 6) {
            moverAbPrincesaJ2(cantidad);
        }
    }

    public void moverArri(int cantidad, int logico) {
        if (logico == 1) {
            moverArMagoJ1(cantidad);
        } else if (logico == 2) {
            moverArMagoJ2(cantidad);
        } else if (logico == 3) {
            moverArGuerreroJ1(cantidad);
        } else if (logico == 4) {
            moverArGuerreroJ2(cantidad);
        } else if (logico == 5) {
            moverArPrincesaJ1(cantidad);
        } else if (logico == 6) {
            moverArPrincesaJ2(cantidad);
        }
    }

    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("Derecha")) {
            moverDer(cantidad, logico);
        } else if (Thread.currentThread().getName().equals("Izquierda")) {
            moverIz(cantidad, logico);
        } else if (Thread.currentThread().getName().equals("Abajo")) {
            moverAba(cantidad, logico);
        } else if (Thread.currentThread().getName().equals("Arriba")) {
            moverArri(cantidad, logico);
        }
        // moverIz(cantidad);
    }

    public void moverDMagoJ1(int cantidad) {
        if (cantidad <= 0) {
            return;
        }
        if (comprobar()) {
            //regrear al personaje a la posicion 0
            System.out.println("Ha llegado al limite hacia la derecha, regresara al inicio");
            cantidad = 0;
            tab.vecL[tab.tam - 1][tab.MagoJ1.posperY] = 0;
            tab.vecG[tab.tam - 1][tab.MagoJ1.posperY].setIcon(null);
            tab.MagoJ1.posperX = XCentro;
            tab.MagoJ1.posperX = YCentro;
            llevarCentro(tab.vecL);

            tab.vecL[XCentro][YCentro] = 1;
            tab.repintar();
            return;
        } else {
            try {
                //mover una posicion
                tab.vecL[tab.MagoJ1.posperX][tab.MagoJ1.posperY] = 0;
                tab.vecG[tab.MagoJ1.posperX][tab.MagoJ1.posperY].setIcon(null);
                tab.repintar();
                tab.MagoJ1.posperX = tab.MagoJ1.posperX + 1;
                tab.vecL[tab.MagoJ1.posperX][tab.MagoJ1.posperY] = 1;
                tab.repintar();
                cantidad--;
                Thread.sleep(100);
                moverDer(cantidad, logico);
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void moverDMagoJ2(int cantidad) {
        if (cantidad <= 0) {
            return;
        }
        if (comprobarM2()) {
            //regrear al personaje a la posicion 0
            System.out.println("Ha llegado al limite hacia la derecha, regresara al inicio");
            cantidad = 0;
            tab.vecL[tab.tam - 1][tab.MagoJ2.posperY] = 0;
            tab.vecG[tab.tam - 1][tab.MagoJ2.posperY].setIcon(null);
            tab.MagoJ2.posperX = XCentro;
            tab.MagoJ2.posperY = YCentro;
            llevarCentro(tab.vecL);

            tab.vecL[XCentro][YCentro] = 2;
            tab.repintar();
            return;
        } else {
            try {
                //mover una posicion
                
                tab.vecL[tab.MagoJ2.posperX][tab.MagoJ2.posperY] = 0;
                tab.vecG[tab.MagoJ2.posperX][tab.MagoJ2.posperY].setIcon(null);
                tab.repintar();
                tab.MagoJ2.posperX = tab.MagoJ2.posperX + 1;
                tab.vecL[tab.MagoJ2.posperX][tab.MagoJ2.posperY] = 2;
                tab.repintar();
                cantidad--;
                Thread.sleep(100);
                moverDer(cantidad, logico);
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void moverDGuerreroJ1(int cantidad) {
        if (cantidad <= 0) {
            return;
        }
        if (comprobarG1()) {
            //regrear al personaje a la posicion 0
            System.out.println("Ha llegado al limite hacia la derecha, regresara al inicio");
            cantidad = 0;
            tab.vecL[tab.tam - 1][tab.GuerreroJ1.posperY] = 0;
            tab.vecG[tab.tam - 1][tab.GuerreroJ1.posperY].setIcon(null);
            tab.GuerreroJ1.posperX = 0;
            llevarCentro(tab.vecL);

            tab.vecL[XCentro][YCentro] = 3;
            tab.repintar();
            return;
        } else {
            try {
                //mover una posicion
                //tab.vecL[tab.GuerreroJ1.posperX-1][tab.GuerreroJ1.posperY-1] = 0;
                tab.vecL[tab.GuerreroJ1.posperX][tab.GuerreroJ1.posperY] = 0;
                tab.vecG[tab.GuerreroJ1.posperX][tab.GuerreroJ1.posperY].setIcon(null);
                tab.repintar();
                tab.GuerreroJ1.posperX = tab.GuerreroJ1.posperX + 1;
                tab.vecL[tab.GuerreroJ1.posperX][tab.GuerreroJ1.posperY] = 3;
                tab.repintar();
                cantidad--;
                Thread.sleep(100);
                moverDer(cantidad, logico);
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void moverDGuerreroJ2(int cantidad) {
        if (cantidad <= 0) {
            return;
        }
        if (comprobarG2()) {
            //regrear al personaje a la posicion 0
            System.out.println("Ha llegado al limite hacia la derecha, regresara al inicio");
            cantidad = 0;
            tab.vecL[tab.tam - 1][tab.GuerreroJ2.posperY] = 0;
            tab.vecG[tab.tam - 1][tab.GuerreroJ2.posperY].setIcon(null);
            tab.GuerreroJ2.posperX = 0;
            llevarCentro(tab.vecL);

            tab.vecL[XCentro][YCentro] = 4;
            tab.repintar();
            return;
        } else {
            try {
                //mover una posicion
                tab.vecL[tab.GuerreroJ2.posperX][tab.GuerreroJ2.posperY] = 0;
                tab.vecG[tab.GuerreroJ2.posperX][tab.GuerreroJ2.posperY].setIcon(null);
                tab.repintar();
                tab.GuerreroJ2.posperX = tab.GuerreroJ2.posperX + 1;
                tab.vecL[tab.GuerreroJ2.posperX][tab.GuerreroJ2.posperY] = 4;
                tab.repintar();
                cantidad--;
                Thread.sleep(100);
                moverDer(cantidad, logico);
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void moverDPrincesaJ1(int cantidad) {
        if (cantidad <= 0) {
            return;
        }
        if (comprobarP1()) {
            //regrear al personaje a la posicion 0
            System.out.println("Ha llegado al limite hacia la derecha, regresara al inicio");
            cantidad = 0;
            tab.vecL[tab.tam - 1][tab.PrincesaJ1.posperY] = 0;
            tab.vecG[tab.tam - 1][tab.PrincesaJ1.posperY].setIcon(null);
            tab.PrincesaJ1.posperX = 0;
            llevarCentro(tab.vecL);

            tab.vecL[XCentro][YCentro] = 5;
            tab.repintar();
            return;
        } else {
            try {
                //mover una posicion
                tab.vecL[tab.PrincesaJ1.posperX][tab.PrincesaJ1.posperY] = 0;
                tab.vecG[tab.PrincesaJ1.posperX][tab.PrincesaJ1.posperY].setIcon(null);
                tab.repintar();
                tab.PrincesaJ1.posperX = tab.PrincesaJ1.posperX + 1;
                tab.vecL[tab.PrincesaJ1.posperX][tab.PrincesaJ1.posperY] = 5;
                tab.repintar();
                cantidad--;
                Thread.sleep(100);
                moverDer(cantidad, logico);
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void moverDPrincesaJ2(int cantidad) {
        if (cantidad <= 0) {
            return;
        }
        if (comprobarP2()) {
            //regrear al personaje a la posicion 0
            System.out.println("Ha llegado al limite hacia la derecha, regresara al inicio");
            cantidad = 0;
            tab.vecL[tab.tam - 1][tab.PrincesaJ2.posperY] = 0;
            tab.vecG[tab.tam - 1][tab.PrincesaJ2.posperY].setIcon(null);
            tab.PrincesaJ2.posperX = 0;
            llevarCentro(tab.vecL);

            tab.vecL[XCentro][YCentro] = 6;
            tab.repintar();
            return;
        } else {
            try {
                //mover una posicion
                tab.vecL[tab.PrincesaJ2.posperX][tab.PrincesaJ2.posperY] = 0;
                tab.vecG[tab.PrincesaJ2.posperX][tab.PrincesaJ2.posperY].setIcon(null);
                tab.repintar();
                tab.PrincesaJ2.posperX = tab.PrincesaJ2.posperX + 1;
                tab.vecL[tab.PrincesaJ2.posperX][tab.PrincesaJ2.posperY] = 6;
                tab.repintar();
                cantidad--;
                Thread.sleep(100);
                moverDer(cantidad, logico);
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void moverIMagoJ1(int cantidad) {
        if (cantidad <= 0) {
            return;
        }
        if (comprobar2()) {
            System.out.println("Ha llegado al limite de la izquierda, no puede avanzar mas");
            cantidad = 0;
            tab.vecL[0][tab.MagoJ1.posperY] = 0;
            tab.vecG[0][tab.MagoJ1.posperY].setIcon(null);
            tab.MagoJ1.posperX = 0;
            llevarCentro(tab.vecL);

            tab.vecL[XCentro][YCentro] = 1;
            tab.repintar();
            return;
        } else {
            try {
                //mover una posicion
                tab.vecL[tab.MagoJ1.posperX][tab.MagoJ1.posperY] = 0;
                tab.vecG[tab.MagoJ1.posperX][tab.MagoJ1.posperY].setIcon(null);
                tab.repintar();
                tab.MagoJ1.posperX = tab.MagoJ1.posperX - 1;
                tab.vecL[tab.MagoJ1.posperX][tab.MagoJ1.posperY] = 1;
                tab.repintar();
                cantidad--;
                Thread.sleep(100);
                moverIz(cantidad, logico);
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void moverIMagoJ2(int cantidad) {
        if (cantidad <= 0) {
            return;
        }
        if (comprobar2M2()) {
            System.out.println("Ha llegado al limite de la izquierda, no puede avanzar mas");
            cantidad = 0;
            tab.vecL[0][tab.MagoJ2.posperY] = 0;
            tab.vecG[0][tab.MagoJ2.posperY].setIcon(null);
            tab.MagoJ2.posperX = 0;
            llevarCentro(tab.vecL);

            tab.vecL[XCentro][YCentro] = 2;
            tab.repintar();
            return;
        } else {
            try {
                //mover una posicion
                tab.vecL[tab.MagoJ2.posperX][tab.MagoJ2.posperY] = 0;
                tab.vecG[tab.MagoJ2.posperX][tab.MagoJ2.posperY].setIcon(null);
                tab.repintar();
                tab.MagoJ2.posperX = tab.MagoJ2.posperX - 1;
                tab.vecL[tab.MagoJ2.posperX][tab.MagoJ2.posperY] = 2;
                tab.repintar();
                cantidad--;
                Thread.sleep(100);
                moverIz(cantidad, logico);
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void moverIGuerreroJ1(int cantidad) {
        if (cantidad <= 0) {
            return;
        }
        if (comprobar2G1()) {
            System.out.println("Ha llegado al limite de la izquierda, no puede avanzar mas");
            cantidad = 0;
            tab.vecL[0][tab.GuerreroJ1.posperY] = 0;
            tab.vecG[0][tab.GuerreroJ1.posperY].setIcon(null);
            tab.GuerreroJ1.posperX = 0;
            llevarCentro(tab.vecL);

            tab.vecL[XCentro][YCentro] = 3;
            tab.repintar();
            return;
        } else {
            try {
                //mover una posicion
                tab.vecL[tab.GuerreroJ1.posperX][tab.GuerreroJ1.posperY] = 0;
                tab.vecG[tab.GuerreroJ1.posperX][tab.GuerreroJ1.posperY].setIcon(null);
                tab.repintar();
                tab.GuerreroJ1.posperX = tab.GuerreroJ1.posperX - 1;
                tab.vecL[tab.GuerreroJ1.posperX][tab.GuerreroJ1.posperY] = 3;
                tab.repintar();
                cantidad--;
                Thread.sleep(100);
                moverIz(cantidad, logico);
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void moverIGuerreroJ2(int cantidad) {
        if (cantidad <= 0) {
            return;
        }
        if (comprobar2G2()) {
            System.out.println("Ha llegado al limite de la izquierda, no puede avanzar mas");
            cantidad = 0;
            tab.vecL[0][tab.GuerreroJ2.posperY] = 0;
            tab.vecG[0][tab.GuerreroJ2.posperY].setIcon(null);
            tab.GuerreroJ2.posperX = 0;
            llevarCentro(tab.vecL);

            tab.vecL[XCentro][YCentro] = 4;
            tab.repintar();
            return;
        } else {
            try {
                //mover una posicion
                tab.vecL[tab.GuerreroJ2.posperX][tab.GuerreroJ2.posperY] = 0;
                tab.vecG[tab.GuerreroJ2.posperX][tab.GuerreroJ2.posperY].setIcon(null);
                tab.repintar();
                tab.GuerreroJ2.posperX = tab.GuerreroJ2.posperX - 1;
                tab.vecL[tab.GuerreroJ2.posperX][tab.GuerreroJ2.posperY] = 4;
                tab.repintar();
                cantidad--;
                Thread.sleep(100);
                moverIz(cantidad, logico);
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void moverIPrincesaJ1(int cantidad) {
        if (cantidad <= 0) {
            return;
        }
        if (comprobar2P1()) {
            System.out.println("Ha llegado al limite de la izquierda, no puede avanzar mas");
            cantidad = 0;
            tab.vecL[0][tab.PrincesaJ1.posperY] = 0;
            tab.vecG[0][tab.PrincesaJ1.posperY].setIcon(null);
            tab.PrincesaJ1.posperX = 0;
            llevarCentro(tab.vecL);

            tab.vecL[XCentro][YCentro] = 5;
            tab.repintar();
            return;
        } else {
            try {
                //mover una posicion
                tab.vecL[tab.PrincesaJ1.posperX][tab.PrincesaJ1.posperY] = 0;
                tab.vecG[tab.PrincesaJ1.posperX][tab.PrincesaJ1.posperY].setIcon(null);
                tab.repintar();
                tab.PrincesaJ1.posperX = tab.PrincesaJ1.posperX - 1;
                tab.vecL[tab.PrincesaJ1.posperX][tab.PrincesaJ1.posperY] = 5;
                tab.repintar();
                cantidad--;
                Thread.sleep(100);
                moverIz(cantidad, logico);
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void moverIPrincesaJ2(int cantidad) {
        if (cantidad <= 0) {
            return;
        }
        if (comprobar2P2()) {
            System.out.println("Ha llegado al limite de la izquierda, no puede avanzar mas");
            cantidad = 0;
            tab.vecL[0][tab.PrincesaJ2.posperY] = 0;
            tab.vecG[0][tab.PrincesaJ2.posperY].setIcon(null);
            tab.PrincesaJ2.posperX = 0;
            llevarCentro(tab.vecL);

            tab.vecL[XCentro][YCentro] = 6;
            tab.repintar();
            return;
        } else {
            try {
                //mover una posicion
                tab.vecL[tab.PrincesaJ2.posperX][tab.PrincesaJ2.posperY] = 0;
                tab.vecG[tab.PrincesaJ2.posperX][tab.PrincesaJ2.posperY].setIcon(null);
                tab.repintar();
                tab.PrincesaJ2.posperX = tab.PrincesaJ2.posperX - 1;
                tab.vecL[tab.PrincesaJ2.posperX][tab.PrincesaJ2.posperY] = 6;
                tab.repintar();
                cantidad--;
                Thread.sleep(100);
                moverIz(cantidad, logico);
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void moverArMagoJ1(int cantidad) {
        if (cantidad <= 0) {
            return;
        }
        if (comprobar2Ar()) {
            System.out.println("Ha llegado al limite de la izquierda, no puede avanzar mas");
            cantidad = 0;
            tab.vecL[tab.MagoJ1.posperX][0] = 0;
            tab.vecG[tab.MagoJ1.posperX][0].setIcon(null);
            tab.MagoJ1.posperX = 0;
            llevarCentro(tab.vecL);

            tab.vecL[XCentro][YCentro] = 1;
            tab.repintar();
            return;
        } else {
            try {
                //mover una posicion
                tab.vecL[tab.MagoJ1.posperX][tab.MagoJ1.posperY] = 0;
                tab.vecG[tab.MagoJ1.posperX][tab.MagoJ1.posperY].setIcon(null);
                tab.repintar();
                tab.MagoJ1.posperY = tab.MagoJ1.posperY - 1;
                tab.vecL[tab.MagoJ1.posperX][tab.MagoJ1.posperY] = 1;
                tab.repintar();
                cantidad--;
                Thread.sleep(100);
                moverArri(cantidad, logico);
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void moverArMagoJ2(int cantidad) {
        if (cantidad <= 0) {
            return;
        }
        if (comprobar2M2Ar()) {
            System.out.println("Ha llegado al limite de la izquierda, no puede avanzar mas");
            cantidad = 0;
            tab.vecL[tab.MagoJ2.posperX][0] = 0;
            tab.vecG[tab.MagoJ2.posperX][0].setIcon(null);
            tab.MagoJ2.posperX = 0;
            llevarCentro(tab.vecL);

            tab.vecL[XCentro][YCentro] = 2;
            tab.repintar();
            return;
        } else {
            try {
                //mover una posicion
                tab.vecL[tab.MagoJ2.posperX][tab.MagoJ2.posperY] = 0;
                tab.vecG[tab.MagoJ2.posperX][tab.MagoJ2.posperY].setIcon(null);
                tab.repintar();
                tab.MagoJ2.posperY = tab.MagoJ2.posperY - 1;
                tab.vecL[tab.MagoJ2.posperX][tab.MagoJ2.posperY] = 2;
                tab.repintar();
                cantidad--;
                Thread.sleep(100);
                moverArri(cantidad, logico);
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void moverArGuerreroJ1(int cantidad) {
        if (cantidad <= 0) {
            return;
        }
        if (comprobar2G1Ar()) {
            System.out.println("Ha llegado al limite de la izquierda, no puede avanzar mas");
            cantidad = 0;
            tab.vecL[tab.GuerreroJ1.posperX][0] = 0;
            tab.vecG[tab.GuerreroJ1.posperX][0].setIcon(null);
            tab.GuerreroJ1.posperX = 0;
            llevarCentro(tab.vecL);

            tab.vecL[XCentro][YCentro] = 3;
            tab.repintar();
            return;
        } else {
            try {
                //mover una posicion
                tab.vecL[tab.GuerreroJ1.posperX][tab.GuerreroJ1.posperY] = 0;
                tab.vecG[tab.GuerreroJ1.posperX][tab.GuerreroJ1.posperY].setIcon(null);
                tab.repintar();
                tab.GuerreroJ1.posperY = tab.GuerreroJ1.posperY - 1;
                tab.vecL[tab.GuerreroJ1.posperX][tab.GuerreroJ1.posperY] = 3;
                tab.repintar();
                cantidad--;
                Thread.sleep(100);
                moverArri(cantidad, logico);
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void moverArGuerreroJ2(int cantidad) {
        if (cantidad <= 0) {
            return;
        }
        if (comprobar2G2Ar()) {
            System.out.println("Ha llegado al limite de la izquierda, no puede avanzar mas");
            cantidad = 0;
            tab.vecL[tab.GuerreroJ2.posperX][0] = 0;
            tab.vecG[tab.GuerreroJ2.posperX][0].setIcon(null);
            tab.GuerreroJ2.posperX = 0;
            llevarCentro(tab.vecL);

            tab.vecL[XCentro][YCentro] = 4;
            tab.repintar();
            return;
        } else {
            try {
                //mover una posicion
                tab.vecL[tab.GuerreroJ2.posperX][tab.GuerreroJ2.posperY] = 0;
                tab.vecG[tab.GuerreroJ2.posperX][tab.GuerreroJ2.posperY].setIcon(null);
                tab.repintar();
                tab.GuerreroJ2.posperY = tab.GuerreroJ2.posperY - 1;
                tab.vecL[tab.GuerreroJ2.posperX][tab.GuerreroJ2.posperY] = 4;
                tab.repintar();
                cantidad--;
                Thread.sleep(100);
                moverArri(cantidad, logico);
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void moverArPrincesaJ1(int cantidad) {
        if (cantidad <= 0) {
            return;
        }
        if (comprobar2P1Ar()) {
            System.out.println("Ha llegado al limite de la izquierda, no puede avanzar mas");
            cantidad = 0;
            tab.vecL[tab.PrincesaJ1.posperX][0] = 0;
            tab.vecG[tab.PrincesaJ1.posperX][0].setIcon(null);
            tab.PrincesaJ1.posperX = 0;
            llevarCentro(tab.vecL);

            tab.vecL[XCentro][YCentro] = 5;
            tab.repintar();
            return;
        } else {
            try {
                //mover una posicion
                tab.vecL[tab.PrincesaJ1.posperX][tab.PrincesaJ1.posperY] = 0;
                tab.vecG[tab.PrincesaJ1.posperX][tab.PrincesaJ1.posperY].setIcon(null);
                tab.repintar();
                tab.PrincesaJ1.posperY = tab.PrincesaJ1.posperY - 1;
                tab.vecL[tab.PrincesaJ1.posperX][tab.PrincesaJ1.posperY] = 5;
                tab.repintar();
                cantidad--;
                Thread.sleep(100);
                moverArri(cantidad, logico);
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void moverArPrincesaJ2(int cantidad) {
        if (cantidad <= 0) {
            return;
        }
        if (comprobar2P2Ar()) {
            System.out.println("Ha llegado al limite de la izquierda, no puede avanzar mas");
            cantidad = 0;
            tab.vecL[tab.PrincesaJ2.posperX][0] = 0;
            tab.vecG[tab.PrincesaJ2.posperX][0].setIcon(null);
            tab.PrincesaJ2.posperX = 0;
            llevarCentro(tab.vecL);

            tab.vecL[XCentro][YCentro] = 6;
            tab.repintar();
            return;
        } else {
            try {
                //mover una posicion
                tab.vecL[tab.PrincesaJ2.posperX][tab.PrincesaJ2.posperY] = 0;
                tab.vecG[tab.PrincesaJ2.posperX][tab.PrincesaJ2.posperY].setIcon(null);
                tab.repintar();
                tab.PrincesaJ2.posperY = tab.PrincesaJ2.posperY - 1;
                tab.vecL[tab.PrincesaJ2.posperX][tab.PrincesaJ2.posperY] = 6;
                tab.repintar();
                cantidad--;
                Thread.sleep(100);
                moverArri(cantidad, logico);
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void moverAbMagoJ1(int cantidad) {
        if (cantidad <= 0) {
            return;
        }
        if (comprobarAba()) {
            System.out.println("Ha llegado al limite de la izquierda, no puede avanzar mas");
            cantidad = 0;
            tab.vecL[tab.MagoJ1.posperY][tab.tam - 1] = 0;
            tab.vecG[tab.MagoJ1.posperY][tab.tam - 1].setIcon(null);
            tab.MagoJ1.posperX = 0;

            llevarCentro(tab.vecL);

            tab.vecL[XCentro][YCentro] = 1;
            tab.repintar();
            return;
        } else {
            try {
                //mover una posicion
                tab.vecL[tab.MagoJ1.posperX][tab.MagoJ1.posperY] = 0;
                tab.vecG[tab.MagoJ1.posperX][tab.MagoJ1.posperY].setIcon(null);
                tab.repintar();
                tab.MagoJ1.posperY = tab.MagoJ1.posperY + 1;
                tab.vecL[tab.MagoJ1.posperX][tab.MagoJ1.posperY] = 1;
                tab.repintar();
                cantidad--;
                Thread.sleep(100);
                moverAba(cantidad, logico);
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void moverAbMagoJ2(int cantidad) {
        if (cantidad <= 0) {
            return;
        }
        if (comprobarM2Aba()) {
            System.out.println("Ha llegado al limite de la izquierda, no puede avanzar mas");
            cantidad = 0;
            tab.vecL[tab.MagoJ2.posperY][tab.tam - 1] = 0;
            tab.vecG[tab.MagoJ2.posperY][tab.tam - 1].setIcon(null);
            tab.MagoJ2.posperX = 0;

            llevarCentro(tab.vecL);

            tab.vecL[XCentro][YCentro] = 2;
            tab.repintar();
            return;
        } else {
            try {
                //mover una posicion
                tab.vecL[tab.MagoJ2.posperX][tab.MagoJ2.posperY] = 0;
                tab.vecG[tab.MagoJ2.posperX][tab.MagoJ2.posperY].setIcon(null);
                tab.repintar();
                tab.MagoJ2.posperY = tab.MagoJ2.posperY + 1;
                tab.vecL[tab.MagoJ2.posperX][tab.MagoJ2.posperY] = 2;
                tab.repintar();
                cantidad--;
                Thread.sleep(100);
                moverAba(cantidad, logico);
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void moverAbGuerreroJ1(int cantidad) {
        if (cantidad <= 0) {
            return;
        }
        if (comprobarG1Aba()) {
            System.out.println("Ha llegado al limite de la izquierda, no puede avanzar mas");
            cantidad = 0;
            tab.vecL[tab.GuerreroJ1.posperY][tab.tam - 1] = 0;
            tab.vecG[tab.GuerreroJ1.posperY][tab.tam - 1].setIcon(null);
            tab.GuerreroJ1.posperX = 0;

            llevarCentro(tab.vecL);

            tab.vecL[XCentro][YCentro] = 3;
            tab.repintar();
            return;
        } else {
            try {
                //mover una posicion
                tab.vecL[tab.GuerreroJ1.posperX][tab.GuerreroJ1.posperY] = 0;
                tab.vecG[tab.GuerreroJ1.posperX][tab.GuerreroJ1.posperY].setIcon(null);
                tab.repintar();
                tab.GuerreroJ1.posperY = tab.GuerreroJ1.posperY + 1;
                tab.vecL[tab.GuerreroJ1.posperX][tab.GuerreroJ1.posperY] = 3;
                tab.repintar();
                cantidad--;
                Thread.sleep(100);
                moverAba(cantidad, logico);
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void moverAbGuerreroJ2(int cantidad) {
        if (cantidad <= 0) {
            return;
        }
        if (comprobarG2Aba()) {
            System.out.println("Ha llegado al limite de la izquierda, no puede avanzar mas");
            cantidad = 0;
            tab.vecL[tab.GuerreroJ2.posperY][tab.tam - 1] = 0;
            tab.vecG[tab.GuerreroJ2.posperY][tab.tam - 1].setIcon(null);
            tab.GuerreroJ2.posperX = 0;

            llevarCentro(tab.vecL);

            tab.vecL[XCentro][YCentro] = 4;
            tab.repintar();
            return;
        } else {
            try {
                //mover una posicion
                tab.vecL[tab.GuerreroJ2.posperX][tab.GuerreroJ2.posperY] = 0;
                tab.vecG[tab.GuerreroJ2.posperX][tab.GuerreroJ2.posperY].setIcon(null);
                tab.repintar();
                tab.GuerreroJ2.posperY = tab.GuerreroJ2.posperY + 1;
                tab.vecL[tab.GuerreroJ2.posperX][tab.GuerreroJ2.posperY] = 4;
                tab.repintar();
                cantidad--;
                Thread.sleep(100);
                moverAba(cantidad, logico);
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void moverAbPrincesaJ1(int cantidad) {
        if (cantidad <= 0) {
            return;
        }
        if (comprobarP1Aba()) {
            System.out.println("Ha llegado al limite de la izquierda, no puede avanzar mas");
            cantidad = 0;
            tab.vecL[tab.PrincesaJ1.posperY][tab.tam - 1] = 0;
            tab.vecG[tab.PrincesaJ1.posperY][tab.tam - 1].setIcon(null);
            tab.PrincesaJ1.posperX = 0;

            llevarCentro(tab.vecL);

            tab.vecL[XCentro][YCentro] = 5;
            tab.repintar();
            return;
        } else {
            try {
                //mover una posicion
                tab.vecL[tab.PrincesaJ1.posperX][tab.PrincesaJ1.posperY] = 0;
                tab.vecG[tab.PrincesaJ1.posperX][tab.PrincesaJ1.posperY].setIcon(null);
                tab.repintar();
                tab.PrincesaJ1.posperY = tab.PrincesaJ1.posperY + 1;
                tab.vecL[tab.PrincesaJ1.posperX][tab.PrincesaJ1.posperY] = 5;
                tab.repintar();
                cantidad--;
                Thread.sleep(100);
                moverAba(cantidad, logico);
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void moverAbPrincesaJ2(int cantidad) {
        if (cantidad <= 0) {
            return;
        }
        if (comprobarP2Aba()) {
            System.out.println("Ha llegado al limite de la izquierda, no puede avanzar mas");
            cantidad = 0;
            tab.vecL[tab.PrincesaJ2.posperY][tab.tam - 1] = 0;
            tab.vecG[tab.PrincesaJ2.posperY][tab.tam - 1].setIcon(null);
            tab.PrincesaJ2.posperX = 0;

            llevarCentro(tab.vecL);

            tab.vecL[XCentro][YCentro] = 6;
            tab.repintar();
            return;
        } else {
            try {
                //mover una posicion
                tab.vecL[tab.PrincesaJ2.posperX][tab.PrincesaJ2.posperY] = 0;
                tab.vecG[tab.PrincesaJ2.posperX][tab.PrincesaJ2.posperY].setIcon(null);
                tab.repintar();
                tab.PrincesaJ2.posperY = tab.PrincesaJ2.posperY + 1;
                tab.vecL[tab.PrincesaJ2.posperX][tab.PrincesaJ2.posperY] = 6;
                tab.repintar();
                cantidad--;
                Thread.sleep(100);
                moverAba(cantidad, logico);
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public int llevarCentro(int matrix[][]) {

        int MAX = matrix.length;
        //  matrix = new int[MAX][MAX];
        int i, j;
        int count = 1;
        int aux;
        int seleccion = 0;

        if (MAX % 2 != 0) {
            aux = MAX / 2;
            /* se comienza en el punto central de la matriz */
            for (i = 0; i < MAX / 2 + 1; i++) {
                for (j = aux + i; j > aux - (2 + i); j--) {

                    if (count == MAX * MAX + 1) {
                        break;
                    }
                    if (matrix[aux - i][j] == 0) {
                        System.out.println("En");
                        seleccion = matrix[aux - i][j];
                        XCentro = aux - i;
                        YCentro = j;
                        return seleccion;
                    }
                }
                if (count == MAX * MAX + 1) {
                    break;
                }
                for (j = aux - (1 + i); j < aux + i; j++) {
                    // matrix[j+2][aux-(1+i)] = count;
                    //   count++;
                    if (matrix[j + 2][aux - (1 + i)] == 0) {
                        System.out.println("Encontrado");
                        seleccion = matrix[j + 2][aux - (1 + i)];
                        XCentro = j + 2;
                        YCentro = aux - (1 + i);
                        return seleccion;
                    }
                }
                for (j = aux - (1 + i); j < aux + (1 + i); j++) {
                    //  matrix[aux+(1+i)][j+1] = count;
                    // count++;
                    if (matrix[aux + (1 + i)][j + 1] == 0) {
                        //System.out.println("Encontrado");
                        seleccion = matrix[aux + (1 + i)][j + 1];
                        XCentro = aux + (1 + i);
                        YCentro = j + 1;
                        return seleccion;
                    }
                }
                for (j = aux + i; j > aux - (1 + i); j--) {
                    //  matrix[j][aux+(1+i)] = count;
                    //  count++;
                    if (matrix[j][aux + (1 + i)] == 0) {
                        //System.out.println("Encontrado");
                        seleccion = matrix[j][aux + (1 + i)];
                        XCentro = j;
                        YCentro = aux + (1 + i);
                        return seleccion;
                    }

                }
                //    if (matrix[i][j] == 3) {
                //         System.out.println(matrix[i][j]);
                //   }
            }
        } else {
            aux = MAX / 2 - 1;
            /* se comienza en el punto central de la matriz */
            for (i = 0; i < MAX / 2 + 1; i++) {
                for (j = aux - i; j < aux + (2 + i); j++) {
                    //matrix[aux + (1 + i)][j] = count;
                    // count++;
                    if (matrix[aux + (1 + i)][j] == 0) {
                        System.out.println("En");
                        seleccion = matrix[aux - i][j];
                        XCentro = aux + (1 + i);
                        YCentro = j;
                        return seleccion;
                    }
                }
                for (j = aux + i; j > aux - (1 + i); j--) {
                    // matrix[j][aux + (1 + i)] = count;
                    //  count++;
                    if (matrix[j][aux + (1 + i)] == 0) {
                        System.out.println("En");
                        seleccion = matrix[aux - i][j];
                        XCentro = j;
                        YCentro = aux + (1 + i);
                        return seleccion;
                    }
                }
                for (j = aux + i; j > aux - (2 + i); j--) {
                    if (count == MAX * MAX + 1) {
                        break;
                    }
                    // matrix[aux - i][j] = count;
                    // count++;
                    if (matrix[aux - i][j] == 0) {
                        System.out.println("En");
                        seleccion = matrix[aux - i][j];
                        XCentro = aux - i;
                        YCentro = j;
                        return seleccion;
                    }
                }
                if (count == MAX * MAX + 1) {
                    break;
                }
                for (j = aux - (1 + i); j < aux + i; j++) {
                    // matrix[j + 2][aux - (1 + i)] = count;
                    // count++;
                    if (matrix[j + 2][aux - (1 + i)] == 0) {
                        System.out.println("En");
                        seleccion = matrix[aux - i][j];
                        XCentro = j + 2;
                        YCentro = aux - (1 + i);
                        return seleccion;
                    }
                }
            }
        }
        return seleccion;

    }
}
