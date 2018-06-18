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
public class Mago {
    public int posMagoX = 0;
    public int posMagoY = 0;
    public ImageIcon imgper;

    public ImageIcon obtenerImagenJ1(int tamx) {
        ImageIcon per = new ImageIcon(getClass().getResource("/img/MagoJ1.png"));
        Image per1 = per.getImage();
        Image imgtam = per1.getScaledInstance(tamx, 150, Image.SCALE_SMOOTH);
        per = new ImageIcon(imgtam);
        return per;
    }
     public ImageIcon obtenerImagenJ2(int tamx) {
        ImageIcon per = new ImageIcon(getClass().getResource("/img/MagoJ2.png"));
        Image per1 = per.getImage();
        Image imgtam = per1.getScaledInstance(tamx, 150, Image.SCALE_SMOOTH);
        per = new ImageIcon(imgtam);
        return per;
    }
    
}
