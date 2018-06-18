/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyec01vacas;

import java.awt.Font;
import java.util.TimerTask;
import javax.swing.*;
import javax.swing.Timer;
//import static proyec01vacas.Tablero.*;

/**
 *
 * @author Byron Alvarez
 */
public class Timer1 extends Thread {

    JLabel label;
    int m=0;
    int s=0;

    public Timer1(JLabel label) {
        this.label = label;
    }

    @Override
    public void run() {
        try {
            int x = 0;
            while (Tablero.iniciaCrono) {
                Thread.sleep(1000);
                mostrarCrono(x);
                x++;
            }
        } catch (Exception e) {
            System.out.println("Error Hilo");
        }
    }

    private void mostrarCrono(int x) {
      //  System.out.println(x + " - " + Thread.currentThread().getName());

        Tablero.segundo++;

        if (Tablero.segundo > 59) {
            Tablero.segundo = 0;
            Tablero.minuto++;
            
        }

        String textSeg = "", textMin = "";

        if (Tablero.segundo < 10) {
            textSeg = "0" + Tablero.segundo;
        } else {
            textSeg += Tablero.segundo;

        }
        if (Tablero.minuto < 10) {
           textMin = "0" + Tablero.minuto;
        } else {
            textMin += Tablero.minuto;
        }
        m = Tablero.minuto;
        s =Tablero.segundo;
        String reloj = textMin + " : " + textSeg;
        label.setText(reloj);
        
        
    }
    public void detener(){
    Tablero.iniciaCrono=false;
    }

}
