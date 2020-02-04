/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo.formas;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.util.Random;

/**
 *
 * @author Ruben
 */
public class Spray extends Polygon {

    //Nos indica los puntos desde los que parten las lineas
    public int x, y;
    //Color del que se pintara la linea
    public Color color;

    //hacemos random para el relleno del spray
    Random random = new Random();
    //Aqui tenemos el valor del random
    int ValorRandom;

    public Spray(int posX, int posY, Color _color) {
        x = posX;
        y = posY;
        color = _color;
    }

    public void dibujate(Graphics2D g2, int posX, int posY, int tamanio) {
        g2.setColor(color);
        g2.setStroke(new BasicStroke(2));
        //Para que se vea 
        tamanio += 8;
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {

                ValorRandom = random.nextInt(5);// uno de cada 5
                if (ValorRandom == 3) {
                    g2.drawLine(x + i, y + j, x + i, y + j);
                }
            }
        }
    }

}
