/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyec01vacas;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;
import Objetos.*;
import static proyec01vacas.Inicio.*;

/**
 *
 * @author Byron Alvarez
 */
public class Tablero extends javax.swing.JFrame {

    JLabel[][] bMatriz;

    public Tab tab;
    public boolean tablerocreado = false;

    Timer1 cronometro;
    static int minuto = 0;
    static int segundo = 0;
    static int minutoF = 0;
    static int segundoF = 0;
    static boolean iniciaCrono = true;
    boolean corriendoCrono = true;

    boolean turnoJ1 = true;
    boolean turnoJ2 = true;

    int n = 0;
    public int posicionPersonajeMover;
    int[] turnos = new int[6];

    public Jugador jugador1;
    public Jugador jugador2;

    public Tablero() {
        initComponents();
        definirTurnos();
        inicializar();
        jugador1 = new Jugador(nombreJ1, 5);
        jugador2 = new Jugador(nombreJ2, 5);
        jLabel4.setText(jugador1.getNombre());
        jLabel5.setText(jugador2.getNombre());

        detenerCrono();
        //cronometro.start();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButton1.setText("Arriba");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Abajo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Izquierda");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Derecha");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);

        jLabel1.setText("Tiempo:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("00:00");

        jButton5.setText("Tirar Dado");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel4.setText("jLabel4");

        jLabel5.setText("jLabel5");

        jLabel6.setText("Jugador 1 :");

        jLabel7.setText("Jugador 2 :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButton5)
                                        .addContainerGap())))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4)
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel1)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addGap(31, 31, 31))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(89, 89, 89))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        //tab.vecL
        if (!tablerocreado) {
            System.out.println("Error no hay tablero");
            return;
        }
        if (posicionPersonajeMover == 1) {
            Movimiento mover = new Movimiento(Integer.parseInt(jTextField1.getText()), tab, "Derecha", tab.vecL[tab.MagoJ1.posperX][tab.MagoJ1.posperY]);
            // mover.moverDer(Integer.parseInt(jTextField2.getText()));
            mover.start();
        } else if (posicionPersonajeMover == 2) {
            Movimiento mover = new Movimiento(Integer.parseInt(jTextField1.getText()), tab, "Derecha", tab.vecL[tab.MagoJ2.posperX][tab.MagoJ2.posperY]);
            mover.start();
        } else if (posicionPersonajeMover == 3) {
            Movimiento mover = new Movimiento(Integer.parseInt(jTextField1.getText()), tab, "Derecha", tab.vecL[tab.GuerreroJ1.posperX][tab.GuerreroJ1.posperY]);
            mover.start();
        } else if (posicionPersonajeMover == 4) {
            Movimiento mover = new Movimiento(Integer.parseInt(jTextField1.getText()), tab, "Derecha", tab.vecL[tab.GuerreroJ2.posperX][tab.GuerreroJ2.posperY]);
            mover.start();
        } else if (posicionPersonajeMover == 5) {
            Movimiento mover = new Movimiento(Integer.parseInt(jTextField1.getText()), tab, "Derecha", tab.vecL[tab.PrincesaJ1.posperX][tab.PrincesaJ1.posperY]);
            mover.start();
        } else if (posicionPersonajeMover == 6) {
            Movimiento mover = new Movimiento(Integer.parseInt(jTextField1.getText()), tab, "Derecha", tab.vecL[tab.PrincesaJ2.posperX][tab.PrincesaJ2.posperY]);
            mover.start();
        }
        
        if (n>=turnos.length-1) {
            n=0;
            posicionPersonajeMover = turnos[n];
        } else{
        n = n+1;
        posicionPersonajeMover = turnos[n];
        System.out.println("-------");
        System.out.println(n);
        System.out.println(posicionPersonajeMover);
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (!tablerocreado) {
            System.out.println("Error no hay tablero");
            return;
        }if (posicionPersonajeMover == 1) {
            Movimiento mover = new Movimiento(Integer.parseInt(jTextField1.getText()), tab, "Izquierda", tab.vecL[tab.MagoJ1.posperX][tab.MagoJ1.posperY]);
            // mover.moverDer(Integer.parseInt(jTextField2.getText()));
            mover.start();
        } else if (posicionPersonajeMover == 2) {
            Movimiento mover = new Movimiento(Integer.parseInt(jTextField1.getText()), tab, "Izquierda", tab.vecL[tab.MagoJ2.posperX][tab.MagoJ2.posperY]);
            mover.start();
        } else if (posicionPersonajeMover == 3) {
            Movimiento mover = new Movimiento(Integer.parseInt(jTextField1.getText()), tab, "Izquierda", tab.vecL[tab.GuerreroJ1.posperX][tab.GuerreroJ1.posperY]);
            mover.start();
        } else if (posicionPersonajeMover == 4) {
            Movimiento mover = new Movimiento(Integer.parseInt(jTextField1.getText()), tab, "Izquierda", tab.vecL[tab.GuerreroJ2.posperX][tab.GuerreroJ2.posperY]);
            mover.start();
        } else if (posicionPersonajeMover == 5) {
            Movimiento mover = new Movimiento(Integer.parseInt(jTextField1.getText()), tab, "Izquierda", tab.vecL[tab.PrincesaJ1.posperX][tab.PrincesaJ1.posperY]);
            mover.start();
        } else if (posicionPersonajeMover == 6) {
            Movimiento mover = new Movimiento(Integer.parseInt(jTextField1.getText()), tab, "Izquierda", tab.vecL[tab.PrincesaJ2.posperX][tab.PrincesaJ2.posperY]);
            mover.start();
        }
        
        if (n>=turnos.length-1) {
            n=0;
            posicionPersonajeMover = turnos[n];
        } else{
        n = n+1;
        posicionPersonajeMover = turnos[n];
        System.out.println("-------");
        System.out.println(n);
        System.out.println(posicionPersonajeMover);
        }
        //    Movimiento mover = new Movimiento(Integer.parseInt(jTextField1.getText()), tab, "Izquierda");
        // mover.moverDer(Integer.parseInt(jTextField2.getText()));
        //     mover.start();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (!tablerocreado) {
            System.out.println("Error no hay tablero");
            return;
        }
         if (posicionPersonajeMover == 1) {
            Movimiento mover = new Movimiento(Integer.parseInt(jTextField1.getText()), tab, "Abajo", tab.vecL[tab.MagoJ1.posperX][tab.MagoJ1.posperY]);
            // mover.moverDer(Integer.parseInt(jTextField2.getText()));
            mover.start();
        } else if (posicionPersonajeMover == 2) {
            Movimiento mover = new Movimiento(Integer.parseInt(jTextField1.getText()), tab, "Abajo", tab.vecL[tab.MagoJ2.posperX][tab.MagoJ2.posperY]);
            mover.start();
        } else if (posicionPersonajeMover == 3) {
            Movimiento mover = new Movimiento(Integer.parseInt(jTextField1.getText()), tab, "Abajo", tab.vecL[tab.GuerreroJ1.posperX][tab.GuerreroJ1.posperY]);
            mover.start();
        } else if (posicionPersonajeMover == 4) {
            Movimiento mover = new Movimiento(Integer.parseInt(jTextField1.getText()), tab, "Abajo", tab.vecL[tab.GuerreroJ2.posperX][tab.GuerreroJ2.posperY]);
            mover.start();
        } else if (posicionPersonajeMover == 5) {
            Movimiento mover = new Movimiento(Integer.parseInt(jTextField1.getText()), tab, "Abajo", tab.vecL[tab.PrincesaJ1.posperX][tab.PrincesaJ1.posperY]);
            mover.start();
        } else if (posicionPersonajeMover == 6) {
            Movimiento mover = new Movimiento(Integer.parseInt(jTextField1.getText()), tab, "Abajo", tab.vecL[tab.PrincesaJ2.posperX][tab.PrincesaJ2.posperY]);
            mover.start();
        }
        
        if (n>=turnos.length-1) {
            n=0;
            posicionPersonajeMover = turnos[n];
        } else{
        n = n+1;
        posicionPersonajeMover = turnos[n];
        System.out.println("-------");
        System.out.println(n);
        System.out.println(posicionPersonajeMover);
        }
        //    Movimiento mover = new Movimiento(Integer.parseInt(jTextField1.getText()), tab, "Abajo");
        // mover.moverDer(Integer.parseInt(jTextField2.getText()));
        //   mover.start();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (!tablerocreado) {
            System.out.println("Error no hay tablero");
            return;
        }
        if (posicionPersonajeMover == 1) {
            Movimiento mover = new Movimiento(Integer.parseInt(jTextField1.getText()), tab, "Arriba", tab.vecL[tab.MagoJ1.posperX][tab.MagoJ1.posperY]);
            // mover.moverDer(Integer.parseInt(jTextField2.getText()));
            mover.start();
        } else if (posicionPersonajeMover == 2) {
            Movimiento mover = new Movimiento(Integer.parseInt(jTextField1.getText()), tab, "Arriba", tab.vecL[tab.MagoJ2.posperX][tab.MagoJ2.posperY]);
            mover.start();
        } else if (posicionPersonajeMover == 3) {
            Movimiento mover = new Movimiento(Integer.parseInt(jTextField1.getText()), tab, "Arriba", tab.vecL[tab.GuerreroJ1.posperX][tab.GuerreroJ1.posperY]);
            mover.start();
        } else if (posicionPersonajeMover == 4) {
            Movimiento mover = new Movimiento(Integer.parseInt(jTextField1.getText()), tab, "Arriba", tab.vecL[tab.GuerreroJ2.posperX][tab.GuerreroJ2.posperY]);
            mover.start();
        } else if (posicionPersonajeMover == 5) {
            Movimiento mover = new Movimiento(Integer.parseInt(jTextField1.getText()), tab, "Arriba", tab.vecL[tab.PrincesaJ1.posperX][tab.PrincesaJ1.posperY]);
            mover.start();
        } else if (posicionPersonajeMover == 6) {
            Movimiento mover = new Movimiento(Integer.parseInt(jTextField1.getText()), tab, "Derecha", tab.vecL[tab.PrincesaJ2.posperX][tab.PrincesaJ2.posperY]);
            mover.start();
        }
        
        if (n>=turnos.length-1) {
            n=0;
            posicionPersonajeMover = turnos[n];
        } else{
        n = n+1;
        posicionPersonajeMover = turnos[n];
        System.out.println("-------");
        System.out.println(n);
        System.out.println(posicionPersonajeMover);
        }
        //  Movimiento mover = new Movimiento(Integer.parseInt(jTextField1.getText()), tab, "Arriba");
        // mover.moverDer(Integer.parseInt(jTextField2.getText()));
        //   mover.start();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        dado();
    }//GEN-LAST:event_jButton5ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
    //private javax.swing.JPanel jPanel1;

    public int tamMatriz() {

        int tam = 0;
        //int tam = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Tamanio", JOptionPane.QUESTION_MESSAGE));
        Object seleccion = JOptionPane.showInputDialog(
                null,
                "Seleccione un Tamano para el Tablero",
                "Selector de opciones",
                JOptionPane.QUESTION_MESSAGE,
                null, // null para icono defecto
                new Object[]{"8x8", "9x9", "10x10", "11x11", "12x12", "13x13", "14x14", "15x15", "16x16", "17x17", "18x18"},
                "8x8");
        if (seleccion.equals("8x8")) {
            tam = 8;
        } else if (seleccion.equals("9x9")) {
            tam = 9;
        } else if (seleccion.equals("10x10")) {
            tam = 10;
        } else if (seleccion.equals("11x11")) {
            tam = 11;
        } else if (seleccion.equals("12x12")) {
            tam = 12;
        } else if (seleccion.equals("13x13")) {
            tam = 13;
        } else if (seleccion.equals("14x14")) {
            tam = 14;
        } else if (seleccion.equals("15x15")) {
            tam = 15;
        } else if (seleccion.equals("16x16")) {
            tam = 16;
        } else if (seleccion.equals("17x17")) {
            tam = 17;
        } else if (seleccion.equals("18x18")) {
            tam = 18;
        }
        return tam;

    }

    public void definirTurnos() {
        turnos[0] = ordenJ1[0];
        turnos[1] = ordenJ2[0];
        turnos[2] = ordenJ1[1];
        turnos[3] = ordenJ2[1];
        turnos[4] = ordenJ1[2];
        turnos[5] = ordenJ2[2];

    }

    public Object tamMat() {
        Object seleccion = JOptionPane.showInputDialog(
                null,
                "Seleccione opcion",
                "Selector de opciones",
                JOptionPane.QUESTION_MESSAGE,
                null, // null para icono defecto
                new Object[]{"8x8", "10x10", "12x12", "14x14", "16x16", "18x18"},
                "8x8");

        return seleccion;

    }

    public void elegirTiempo() {
        String seleccionM = JOptionPane.showInputDialog(
                null,
                "Ingrese una cantidad de minutos",
                JOptionPane.QUESTION_MESSAGE);
        minutoF = Integer.parseInt(seleccionM);
        String seleccionS = JOptionPane.showInputDialog(
                null,
                "Ingrese una cantidad de segundos",
                JOptionPane.QUESTION_MESSAGE);
        segundoF = Integer.parseInt(seleccionS);
    }

    public void detenerCrono() {
        // System.out.println(minutoF+" "+segundoF);
        //   System.out.println(minuto+" "+segundo);
        //  while (minuto != minutoF && segundo != segundoF) {
        //      cronometro = new Timer1(jLabel2);
        //      cronometro.start();
        //  }

        if (corriendoCrono) {
            cronometro = new Timer1(jLabel2);
            cronometro.start();

        }
        if (minuto == minutoF && segundo == segundoF) {
            cronometro.detener();
        }

    }

    public void inicializar() {
        //this.add(getJPanel());
        posicionPersonajeMover = turnos[0];
                //turnos[0];
        jPanel1.removeAll();
        jPanel1.repaint();
        elegirTiempo();
        // jPanel1.setBounds(50, 50, 400, 400);
        int tama = tamMatriz();
        tab = new Tab(tama, jPanel1);
        tablerocreado = true;
        //  this.add(jPanel1);

        //  posicionPersonajeMover= new int[tama][tama];
    }

    public void dado() {

        ImageIcon dado1 = new ImageIcon(getClass().getResource("/img/dado1.png"));
        Image per1 = dado1.getImage();
        Image imgtam = per1.getScaledInstance(81, 81, Image.SCALE_SMOOTH);
        dado1 = new ImageIcon(imgtam);

        ImageIcon dado2 = new ImageIcon(getClass().getResource("/img/dado2.png"));
        Image per2 = dado2.getImage();
        Image imgtam2 = per2.getScaledInstance(81, 81, Image.SCALE_SMOOTH);
        dado2 = new ImageIcon(imgtam2);
        ImageIcon dado3 = new ImageIcon(getClass().getResource("/img/dado3.png"));
        Image per3 = dado3.getImage();
        Image imgtam3 = per3.getScaledInstance(81, 81, Image.SCALE_SMOOTH);
        dado3 = new ImageIcon(imgtam3);
        ImageIcon dado4 = new ImageIcon(getClass().getResource("/img/dado4.png"));
        Image per4 = dado4.getImage();
        Image imgtam4 = per4.getScaledInstance(81, 81, Image.SCALE_SMOOTH);
        dado4 = new ImageIcon(imgtam4);
        ImageIcon dado5 = new ImageIcon(getClass().getResource("/img/dado5.png"));
        Image per5 = dado5.getImage();
        Image imgtam5 = per5.getScaledInstance(81, 81, Image.SCALE_SMOOTH);
        dado5 = new ImageIcon(imgtam5);
        ImageIcon dado6 = new ImageIcon(getClass().getResource("/img/dado6.png"));
        Image per6 = dado6.getImage();
        Image imgtam6 = per6.getScaledInstance(81, 81, Image.SCALE_SMOOTH);
        dado6 = new ImageIcon(imgtam6);

        //  ArrayList<Integer> numbers = new ArrayList<>();
        //   for (int i = 1; i < 7; i++) {
        //       numbers.add(i);
        //   }
        //   Random random = new Random();
        // int randomNumero = random.nextInt(numbers.size()+1);
        int randomNumero = (int) Math.floor(Math.random() * 6 + 1);
        if (randomNumero == 1) {
            jLabel3.setIcon(dado1);
            jTextField1.setText(String.valueOf(randomNumero));
        } else if (randomNumero == 2) {
            jLabel3.setIcon(dado2);
            jTextField1.setText(String.valueOf(randomNumero));
        } else if (randomNumero == 3) {
            jLabel3.setIcon(dado3);
            jTextField1.setText(String.valueOf(randomNumero));
        } else if (randomNumero == 4) {
            jLabel3.setIcon(dado4);
            jTextField1.setText(String.valueOf(randomNumero));
        } else if (randomNumero == 5) {
            jLabel3.setIcon(dado5);
            jTextField1.setText(String.valueOf(randomNumero));
        } else if (randomNumero == 6) {
            jLabel3.setIcon(dado6);
            jTextField1.setText(String.valueOf(randomNumero));
        }

    }
    /*
    
    if(posicionPersonajeMover==1){
        Movimiento mover = new Movimiento(Integer.parseInt(jTextField1.getText()), tab, "Derecha",tab.vecL[tab.MagoJ1.posperX][tab.MagoJ1.posperY]);
        // mover.moverDer(Integer.parseInt(jTextField2.getText()));
        mover.start();
        }else if(posicionPersonajeMover==2){
        Movimiento mover = new Movimiento(Integer.parseInt(jTextField1.getText()), tab, "Derecha",tab.vecL[tab.MagoJ2.posperX][tab.MagoJ1.posperY]);
        mover.start();
        }else if(posicionPersonajeMover==3){
        Movimiento mover = new Movimiento(Integer.parseInt(jTextField1.getText()), tab, "Derecha",tab.vecL[tab.GuerreroJ1.posperX][tab.MagoJ1.posperY]);
        mover.start();
        }else if(posicionPersonajeMover==4){
        Movimiento mover = new Movimiento(Integer.parseInt(jTextField1.getText()), tab, "Derecha",tab.vecL[tab.GuerreroJ2.posperX][tab.MagoJ1.posperY]);
        mover.start();
        }else if(posicionPersonajeMover==5){
        Movimiento mover = new Movimiento(Integer.parseInt(jTextField1.getText()), tab, "Derecha",tab.vecL[tab.PrincesaJ1.posperX][tab.MagoJ1.posperY]);
        mover.start();
        }else if(posicionPersonajeMover==7){
        Movimiento mover = new Movimiento(Integer.parseInt(jTextField1.getText()), tab, "Derecha",tab.vecL[tab.PrincesaJ2.posperX][tab.MagoJ1.posperY]);
        mover.start();
        }
    
     */
}
