/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Byron Alvarez
 */
public class Personajes {

    public int posperX = 0;
    public int posperY = 0;
    public ImageIcon imgper;

    public ImageIcon obtenerImagen(int tamx) {
        ImageIcon per = new ImageIcon(getClass().getResource("/img/675273.jpg"));
        Image per1 = per.getImage();
        Image imgtam = per1.getScaledInstance(tamx, 150, Image.SCALE_SMOOTH);
        per = new ImageIcon(imgtam);
        return per;
    }
    public ImageIcon obtenerImagenMagoJ1(int tamx) {
        ImageIcon per = new ImageIcon(getClass().getResource("/img/MagoJ1.png"));
        Image per1 = per.getImage();
        Image imgtam = per1.getScaledInstance(tamx, tamx, Image.SCALE_SMOOTH);
        per = new ImageIcon(imgtam);
        return per;
    }
     public ImageIcon obtenerImagenMagoJ2(int tamx) {
        ImageIcon per = new ImageIcon(getClass().getResource("/img/MagoJ2.png"));
        Image per1 = per.getImage();
        Image imgtam = per1.getScaledInstance(tamx, tamx, Image.SCALE_SMOOTH);
        per = new ImageIcon(imgtam);
        return per;
    }
     public ImageIcon obtenerImagenGuerreroJ1(int tamx) {
        ImageIcon per = new ImageIcon(getClass().getResource("/img/GuerreroJ1.png"));
        Image per1 = per.getImage();
        Image imgtam = per1.getScaledInstance(tamx, tamx, Image.SCALE_SMOOTH);
        per = new ImageIcon(imgtam);
        return per;
    }
     public ImageIcon obtenerImagenGuerreroJ2(int tamx) {
        ImageIcon per = new ImageIcon(getClass().getResource("/img/GuerreroJ2.png"));
        Image per1 = per.getImage();
        Image imgtam = per1.getScaledInstance(tamx, tamx, Image.SCALE_SMOOTH);
        per = new ImageIcon(imgtam);
        return per;
    }
     public ImageIcon obtenerImagenPrincesaJ1(int tamx) {
        ImageIcon per = new ImageIcon(getClass().getResource("/img/PrincesaJ1.png"));
        Image per1 = per.getImage();
        Image imgtam = per1.getScaledInstance(tamx, tamx, Image.SCALE_SMOOTH);
        per = new ImageIcon(imgtam);
        return per;
    }
     public ImageIcon obtenerImagenPrincesaJ2(int tamx) {
        ImageIcon per = new ImageIcon(getClass().getResource("/img/PrincesaJ2.png"));
        Image per1 = per.getImage();
        Image imgtam = per1.getScaledInstance(tamx, tamx, Image.SCALE_SMOOTH);
        per = new ImageIcon(imgtam);
        return per;
    }
     public ImageIcon obtenerVida(int tamx) {
        ImageIcon per = new ImageIcon(getClass().getResource("/img/Vida.png"));
        Image per1 = per.getImage();
        Image imgtam = per1.getScaledInstance(tamx, tamx, Image.SCALE_SMOOTH);
        per = new ImageIcon(imgtam);
        return per;
    }
     public ImageIcon obtenerMina(int tamx) {
        ImageIcon per = new ImageIcon(getClass().getResource("/img/Bomba.jpg"));
        Image per1 = per.getImage();
        Image imgtam = per1.getScaledInstance(tamx, tamx, Image.SCALE_SMOOTH);
        per = new ImageIcon(imgtam);
        return per;
    }
}
