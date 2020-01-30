/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo.formas;

import java.awt.BasicStroke;

/**
 *
 * @author Ruben
 */
public class Trazo extends BasicStroke {

    public Trazo(int _grosor) {
        super(_grosor);
    }

    public Trazo(int _grosor, boolean rayas) {
        super(_grosor, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10.0f, new float[]{10.0f}, 0.0f);
    }

    public Trazo(int _grosor, boolean rayas, boolean redondo) {
        super(_grosor, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER, 1.0f);
    }
}
