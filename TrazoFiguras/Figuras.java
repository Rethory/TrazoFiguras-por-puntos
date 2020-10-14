/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrazoFiguras;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author PC
 */
public class Figuras extends JPanel {
    
        // ventana
    private JFrame ventana;
    // contenedor
    private Container contenedor;
    // inicializar la ventana
    Figuras() {
        ventana = new JFrame("Dibujando icono");
        // definir tamaño a ventana
        ventana.setSize(800, 600);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        
        contenedor = ventana.getContentPane();
        contenedor.setSize(800, 600);
        // agregar la ventana en el contenedor
        contenedor.add(this, BorderLayout.CENTER);
        
        }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //Dibujando con lineas
        g.setColor(Color.blue);
            g.drawLine(100, 50, 200, 50);
            g.drawLine(200, 50, 200, 100);
            g.drawLine(100, 50, 100, 100);
            g.drawLine(100, 100, 200, 100);

            g.setColor(Color.orange);
            g.drawLine(130, 100, 130, 70);
            g.drawLine(130, 70, 160, 70);
            g.drawLine(160, 100, 160, 70);

            g.setColor(Color.green);
            g.drawLine(130, 100, 80, 140);
            g.drawLine(160, 100, 100, 155);


            g.setColor(Color.black);
            g.drawLine(100, 50, 150, 20);
            g.drawLine(200, 50, 150, 20);
        g.setColor(Color.pink);
        g.drawString("Dibujando con lineas", 50, 180);
        
        //Dibujando rectangulos
        g.setColor(Color.red);
        g.drawRect(280, 40, 20, 70);

        g.setColor(Color.red);
        g.drawRect(250, 50, 20, 60);

        g.setColor(Color.yellow);
        g.drawRect(310, 30, 20, 80);

        g.setColor(Color.yellow);
        g.drawRect(340, 20, 20, 90);

        g.setColor(Color.green);
        g.drawRect(370, 10, 20, 100);
        g.setColor(Color.pink);
        g.drawString("Dibujando con rectangulos", 250, 180);

        //Dibujando Circulos
            g.setColor(Color.pink);
            g.drawOval(100, 200, 140, 140);
            g.drawOval(125, 230, 30, 30);
            g.drawOval(165, 230, 30, 30);
            g.fillOval(135, 240, 10, 10);
            g.fillOval(175, 240, 10, 10);
            g.drawOval(140, 270, 40, 40);
            g.setColor(Color.black);
            g.drawString("Dibujando con circulos", 100, 370);
            
            
            
            
//        g.setColor(Color.pink);
//        g.drawLine(100,50,150,20);
//        g.drawLine(200,50,150,20);
//        g.drawLine(50, 25, 100, 25);
//        g.drawLine(100, 25, 100, 100);
//        g.drawLine(50, 25, 50, 50);
//        g.drawLine(50, 50, 100, 50);
        

//        g.drawRect(280, 50, 100, 50);
//        g.fillRect(280, 110, 100, 50);


        //Dibujando ovalos con rectangulos
        g.setColor(Color.MAGENTA);
        g.drawRoundRect(450, 60, 130, 30, 150, 50);
        g.drawRoundRect(478, 50, 70, 20, 100, 30);
        g.drawRoundRect(503, 40, 20, 70, 100, 50);
//        g.fillRoundRect(450, 110, 100, 50, 20, 20);
        
        g.setColor(Color.pink);
        g.drawString("Dibujando ovalos con rectangulos", 450, 170);
        
        //Dibujando ovalos con circulos
        
        
        //Dibujando triangulos
            g.setColor(Color.cyan);
            g.drawLine(450, 300, 550, 300);
            g.drawLine(450, 300, 500, 250);
            g.drawLine(550, 300, 500, 250);
            g.drawLine(500, 250, 500, 230);
            g.drawLine(500, 250, 550, 250);
            g.drawLine(500, 230, 550, 250);

            g.drawLine(430, 260, 430, 210);
            g.drawLine(430, 260, 480, 260);
            g.drawLine(430, 210, 480, 260);
            
        g.setColor(Color.pink);
        g.drawString("Dibujando triangulos", 450, 350);
        
        //Dibujando ovalos
        g.setColor(Color.red);
        g.drawOval(300, 200, 20, 80);
        g.setColor(Color.red);
        g.drawOval(290, 215, 40, 25);
        g.setColor(Color.red);
        g.drawOval(270, 230, 80, 30);
        
        g.setColor(Color.pink);
        g.drawString("Dibujando ovalos", 270, 320);

//        g.setColor(Color.orange);
//        g.drawOval(100, 200, 80, 80);
//        g.fillOval(100, 290, 50, 50);
//        
//        g.setColor(Color.LIGHT_GRAY);
//        g.drawOval(280, 200, 80, 40);
//        g.fillOval(280, 290, 40, 80);
//        
//        g.setColor(Color.RED);
//        g.drawLine(450, 300, 550, 300);
//        g.drawLine(450, 300, 500, 250);
//        g.drawLine(550, 300, 500, 250);
//        
//        g.setColor(Color.pink);
//        g.drawString("Nah mucho texto", 200, 400);
//        
//        g.setColor(Color.cyan);
//        g.drawArc(400, 450, 300, 60, 490, 390);
//        g.fillArc(400, 350, 250, 60, 400, 370);
//        
        
    }


    
}
