/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import abstrata.Figura;

/**
 *
 * @author Hiago
 */
public class Triangulo extends Figura {

    @Override
    public double calculoArea(double x, double y) {
        return (x * y) / 2;
    }

}
