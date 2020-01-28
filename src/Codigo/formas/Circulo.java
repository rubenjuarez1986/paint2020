/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo.formas;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author Ruben
 */
public class Circulo extends Ellipse2D.Double {
    
    public Color color = Color.black;
    public boolean relleno = false;
    
    public Circulo(int _posX, int _posY, int _diametro, Color _color, boolean _relleno) {
        super();
        x = _posX;// asigno las posX que me pasan al contruir el objeto a la propiedad x de los ellips2D.Double
        y = _posY;
        width = _diametro;
        height = _diametro;
        color = _color;
        relleno = _relleno;
    }
    
    public void dibujate(Graphics2D g2, int _posX) {
        int diametro = Math.abs((int) x - _posX);
        width = diametro;
        height = diametro;
        g2.setColor(color);
        if (relleno) {
            g2.fill(this);
        } else {
            g2.draw(this);
        }
    }
}
