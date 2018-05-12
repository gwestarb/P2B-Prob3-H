/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

import Entregas.Sedex;
import Interfaces.TipoEntregaInterface;

/**
 *
 * @author Gwestarb
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TipoEntregaInterface sedex = new Sedex();
        
        System.out.println(sedex.calculaPrecoEntrega(2230));
    }
    
}
