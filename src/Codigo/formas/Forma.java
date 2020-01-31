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

/**
 *
 * @author Ruben
 */
public class Forma extends Polygon {

    public Color color = null;
    public boolean relleno = false;
    //coordenadas del centro de la forma
    public int x = 0;
    public int y = 0;

    public Forma(int _posX, int _posY, int _lados, Color _color, boolean _relleno) {
        //Inicializa el constructor de la forma con distintos lados
        super(new int[_lados], new int[_lados], _lados);
        //Guarda el centro de la forma
        this.x = _posX;
        this.y = _posY;
        //Asigna el color y relleno de la forma
        color = _color;
        relleno = _relleno;
    }

    public void dibujate(Graphics2D g2, int _posX, int _posY,String grosor) {
        // Redibuja la forma
 calculaVertices (y -_posY, x - _posX);
 // Asigna el color de la forma
        g2.setColor(color);
        // Asigna el relleno de la forma
        if (relleno){
            g2.fill(this);
        }
        else{
            g2.setStroke(new BasicStroke(Float.parseFloat(grosor)));
            g2.draw(this);
        }
    }
    //este metodo recalcula la posicion de los vertices en un poligono regular
    public void calculaVertices (int _radio,double _giro){
         for (int i=0; i< npoints; i++){
            xpoints[i] = (int) (x + _radio*Math.cos((2*Math.PI * i + _giro/40)/npoints));
            ypoints[i] = (int) (y + _radio*Math.sin((2*Math.PI * i + _giro/40)/npoints));
        }
    }
    }

    
    
    

