/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

import ClassesProfessor.Pedido;
import Exception.TipoEntregaInvalido;
import Interfaces.TipoEntregaInterface;

/**
 *
 * @author Gwestarb
 */
public class PAC implements TipoEntregaInterface{

    private static PAC instance;
    
    private PAC(){
    }
    
    public static PAC getInstance(){
        if (instance == null) {
            instance = new PAC();
        }
        
        return instance;
    }

    @Override
    public Double calculaPrecoEntrega(Pedido pedido) {
        
        double peso = pedido.calculaPesoTotal();
        
        if(peso <= 1000 ){
            return 10.00;
        }
        if(peso > 1000 && peso <= 2000){
            return 15.00;
        }
        if(peso > 2000 && peso <= 3000){
            return 20.00;
        }
        if(peso > 3000 && peso <=5000){
            return 30.00;
        }
        throw new TipoEntregaInvalido();
    }
    
}
