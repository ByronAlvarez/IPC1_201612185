/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyec01vacas;

import Objetos.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

/**
 *
 * @author Byron Alvarez
 */
public class Tab {

    public int tam = 0;
    public Personajes MagoJ1;
    public Personajes MagoJ2;
    public Personajes GuerreroJ1;
    public Personajes GuerreroJ2;
    public Personajes PrincesaJ1;
    public Personajes PrincesaJ2;
    public Personajes Vida;
    public Personajes Bomba;
    public int[][] vecL;
    JLabel[][] vecG;
    public JPanel jPanel1;

    public int tambloquex = 0;

    public Tab() {
    }

    public Tab(int tam, JPanel Fondo) {
        this.tam = tam;
        this.jPanel1 = Fondo;
        llenar(tam);
    }

    public void llenar(int tam) {
        tambloquex = 500 / tam;
        vecL = new int[tam][tam];
        vecG = new JLabel[tam][tam];

        for (int i = 1; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                vecL[i][j] = 0;
            }
        }

        ArrayList<Integer> numbers = new ArrayList<>(tam);
        for (int i = 0; i < tam; i++) {
            numbers.add(i);
        }
        Random random = new Random();
        // while (numbers.size() > 1) {
        int randomIndice1 = random.nextInt(numbers.size());
        int randomIndice2 = random.nextInt(numbers.size());
        int randomIndice3 = random.nextInt(numbers.size());
        int randomIndice4 = random.nextInt(numbers.size());
        int randomIndice5 = random.nextInt(numbers.size());
        int randomIndice6 = random.nextInt(numbers.size());

        int randomIndice1Y = random.nextInt(numbers.size());
        int randomIndice2Y = random.nextInt(numbers.size());
        int randomIndice3Y = random.nextInt(numbers.size());
        int randomIndice4Y = random.nextInt(numbers.size());
        int randomIndice5Y = random.nextInt(numbers.size());
        int randomIndice6Y = random.nextInt(numbers.size());
        //System.out.println("Not Repeated Random Number " + numbers.get(randomIndiceX));
        //numbers.remove(randomIndiceX);
        //   }

        for (int i = 0; i < tam * tam * 0.1; i++) {
            int randomPrueba = random.nextInt(numbers.size());
            int randomPrueba2 = random.nextInt(numbers.size());
            this.Bomba = new Personajes();
            if(vecL[randomPrueba][randomPrueba2] !=0){
                System.out.println("Repetido");
                randomPrueba = random.nextInt(numbers.size());
                randomPrueba2 = random.nextInt(numbers.size());
            }
            this.Bomba.posperX = randomPrueba;
            this.Bomba.posperY = randomPrueba2;
            vecL[randomPrueba][randomPrueba2] = 7;
        }
         for (int i = 0; i < tam * tam * 0.05; i++) {
            int randomPrueba = random.nextInt(numbers.size());
            int randomPrueba2 = random.nextInt(numbers.size());
            this.Vida = new Personajes();
            if(vecL[randomPrueba][randomPrueba2] !=0){
                System.out.println("Repetido");
                randomPrueba = random.nextInt(numbers.size());
                randomPrueba2 = random.nextInt(numbers.size());
            }
            this.Vida.posperX = randomPrueba;
            this.Vida.posperY = randomPrueba2;
            vecL[randomPrueba][randomPrueba2] = 8;
        }
         
        //1 equivale personahe y 0 vacio

        this.MagoJ1 = new Personajes();
        while(vecL[randomIndice1][randomIndice1Y] !=0){
         randomIndice1 = random.nextInt(numbers.size());
         randomIndice1Y = random.nextInt(numbers.size());
        }
        this.MagoJ1.posperX = randomIndice1;
        vecL[randomIndice1][randomIndice1Y] = 1;
        this.MagoJ1.posperY = randomIndice1Y;

        this.MagoJ2 = new Personajes();
        while(vecL[randomIndice2][randomIndice2Y] !=0){
         randomIndice2 = random.nextInt(numbers.size());
         randomIndice2Y = random.nextInt(numbers.size());
        }
        this.MagoJ2.posperX = randomIndice2;
        vecL[randomIndice2][randomIndice2Y] = 2;
        this.MagoJ2.posperY = randomIndice2Y;

        this.GuerreroJ1 = new Personajes();
        while(vecL[randomIndice3][randomIndice3Y] !=0){
         randomIndice3 = random.nextInt(numbers.size());
         randomIndice3Y = random.nextInt(numbers.size());
        }
        this.GuerreroJ1.posperX = randomIndice3;
        this.GuerreroJ1.posperY = randomIndice3Y;
        vecL[randomIndice3][randomIndice3Y] = 3;

        this.GuerreroJ2 = new Personajes();
        while(vecL[randomIndice4][randomIndice4Y] !=0){
         randomIndice4 = random.nextInt(numbers.size());
         randomIndice4Y = random.nextInt(numbers.size());
        }
        this.GuerreroJ2.posperX = randomIndice4;
        this.GuerreroJ2.posperY = randomIndice4Y;
        vecL[randomIndice4][randomIndice4Y] = 4;

        this.PrincesaJ1 = new Personajes();
        while(vecL[randomIndice5][randomIndice5Y] !=0){
         randomIndice5 = random.nextInt(numbers.size());
         randomIndice5Y = random.nextInt(numbers.size());
        }
        this.PrincesaJ1.posperX = randomIndice5;
        this.PrincesaJ1.posperY = randomIndice5Y;
        vecL[randomIndice5][randomIndice5Y] = 5;

        this.PrincesaJ2 = new Personajes();
        while(vecL[randomIndice6][randomIndice6Y] !=0){
         randomIndice6 = random.nextInt(numbers.size());
         randomIndice6Y = random.nextInt(numbers.size());
        }
        this.PrincesaJ2.posperX = randomIndice6;
        this.PrincesaJ2.posperY = randomIndice6Y;
        vecL[randomIndice6][randomIndice6Y] = 6;

        repintar();
    }

    public void repintar() {
        // ImageIcon fondo = new ImageIcon(getClass().getResource("/img/675273.jpg"));
        //   Image per1 = fondo.getImage();
        //  Image imgtam = per1.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
        //   fondo = new ImageIcon(imgtam);

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                JLabel tablero;
                if (vecL[i][j] == 0) {
                    tablero = new JLabel();
                    tablero.setOpaque(false);
                    tablero.setBorder(BorderFactory.createLineBorder(Color.black));
                    tablero.setBounds(i * tambloquex, j * tambloquex, tambloquex, tambloquex);

                    vecG[i][j] = tablero;
                    jPanel1.add(vecG[i][j], BorderLayout.CENTER);

                    jPanel1.repaint();
                }
                if (vecL[i][j] == 1) {
                    tablero = new JLabel(this.MagoJ1.obtenerImagenMagoJ1(tambloquex));
                    tablero.setOpaque(false);
                    tablero.setBorder(BorderFactory.createLineBorder(Color.black));
                    tablero.setBounds(i * tambloquex, j * tambloquex, tambloquex, tambloquex);
                    vecG[i][j] = tablero;
                    jPanel1.add(vecG[i][j], BorderLayout.CENTER);
                    jPanel1.repaint();
                }
                if (vecL[i][j] == 2) {
                    tablero = new JLabel(this.MagoJ2.obtenerImagenMagoJ2(tambloquex));
                    tablero.setOpaque(false);
                    tablero.setBorder(BorderFactory.createLineBorder(Color.black));
                    tablero.setBounds(i * tambloquex, j * tambloquex, tambloquex, tambloquex);
                    vecG[i][j] = tablero;
                    jPanel1.add(vecG[i][j], BorderLayout.CENTER);
                    jPanel1.repaint();
                }
                if (vecL[i][j] == 3) {
                    tablero = new JLabel(this.GuerreroJ1.obtenerImagenGuerreroJ1(tambloquex));
                    tablero.setOpaque(false);
                    tablero.setBorder(BorderFactory.createLineBorder(Color.black));
                    tablero.setBounds(i * tambloquex, j * tambloquex, tambloquex, tambloquex);
                    vecG[i][j] = tablero;
                    jPanel1.add(vecG[i][j], BorderLayout.CENTER);
                    jPanel1.repaint();
                }
                if (vecL[i][j] == 4) {
                    tablero = new JLabel(this.GuerreroJ2.obtenerImagenGuerreroJ2(tambloquex));
                    tablero.setOpaque(false);
                    tablero.setBorder(BorderFactory.createLineBorder(Color.black));
                    tablero.setBounds(i * tambloquex, j * tambloquex, tambloquex, tambloquex);
                    vecG[i][j] = tablero;
                    jPanel1.add(vecG[i][j], BorderLayout.CENTER);
                    jPanel1.repaint();
                }
                if (vecL[i][j] == 5) {
                    tablero = new JLabel(this.PrincesaJ1.obtenerImagenPrincesaJ1(tambloquex));
                    tablero.setOpaque(false);
                    tablero.setBorder(BorderFactory.createLineBorder(Color.black));
                    tablero.setBounds(i * tambloquex, j * tambloquex, tambloquex, tambloquex);
                    vecG[i][j] = tablero;
                    jPanel1.add(vecG[i][j], BorderLayout.CENTER);
                    jPanel1.repaint();
                }
                if (vecL[i][j] == 6) {
                    tablero = new JLabel(this.PrincesaJ2.obtenerImagenPrincesaJ2(tambloquex));
                    tablero.setOpaque(false);
                    tablero.setBorder(BorderFactory.createLineBorder(Color.black));
                    tablero.setBounds(i * tambloquex, j * tambloquex, tambloquex, tambloquex);
                    vecG[i][j] = tablero;
                    jPanel1.add(vecG[i][j], BorderLayout.CENTER);
                    jPanel1.repaint();
                }
                if (vecL[i][j] == 7) {
                    tablero = new JLabel(this.Bomba.obtenerMina(tambloquex));
                    tablero.setOpaque(false);
                    tablero.setBorder(BorderFactory.createLineBorder(Color.black));
                    tablero.setBounds(i * tambloquex, j * tambloquex, tambloquex, tambloquex);
                    vecG[i][j] = tablero;
                    jPanel1.add(vecG[i][j], BorderLayout.CENTER);
                    jPanel1.repaint();
                }
                if (vecL[i][j] == 8) {
                    tablero = new JLabel(this.Vida.obtenerVida(tambloquex));
                    tablero.setOpaque(false);
                    tablero.setBorder(BorderFactory.createLineBorder(Color.black));
                    tablero.setBounds(i * tambloquex, j * tambloquex, tambloquex, tambloquex);
                    vecG[i][j] = tablero;
                    jPanel1.add(vecG[i][j], BorderLayout.CENTER);
                    jPanel1.repaint();
                }

            }
        }
    }
    
    public void buscarEspacio(){
    
    }

}
